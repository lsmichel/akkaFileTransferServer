/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.atos.wordline.nsbf.filetranfertgrpc.srv.impl;

import akka.stream.IOResult;
import akka.stream.Materializer;
import akka.stream.javadsl.FileIO;
import akka.stream.javadsl.Source;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfertManager;
import sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed;
import sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileInfoActionPerformed;
import sn.atos.wordline.nsbf.filetranfertgrpc.srv.fileInfo;
import sn.atos.wordline.nsbf.filetranfertgrpc.srv.filePart;

/**
 *
 * @author A746054
 */
public class FileTransfertManagerImpl implements FileTransfertManager {

    private final Materializer mat;
    

    public FileTransfertManagerImpl(Materializer mat) {
        this.mat = mat;
    }

    @Override
    public CompletionStage<PostFileActionPerformed> postFile(filePart in) {
        File file = new File("C:\\Users\\A746054\\Documents\\ftpReslt\\" + in.getFileName());
        if (!file.isFile()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(FileTransfertManagerImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        akka.util.ByteString req = akka.util.ByteString.fromArray(in.getChunk().toByteArray());
        IOResult ioResult = null;
        try {
            ioResult = Source.single(req)
                    .runWith(FileIO.toPath(file.toPath()), mat).toCompletableFuture().get();
        } catch (InterruptedException ex) {
            Logger.getLogger(FileTransfertManagerImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(FileTransfertManagerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        PostFileActionPerformed _PostFileActionPerformed = PostFileActionPerformed
                .newBuilder()
                .setErrorMessage("")
                .setHasError(true)
                .setMessage("ok")
                .build();
        return CompletableFuture.completedFuture(_PostFileActionPerformed);
    }

    @Override
    public CompletionStage<PostFileInfoActionPerformed> postFileinfo(fileInfo in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
