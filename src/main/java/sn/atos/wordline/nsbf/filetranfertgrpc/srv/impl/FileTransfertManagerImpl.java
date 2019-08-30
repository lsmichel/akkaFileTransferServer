/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.atos.wordline.nsbf.filetranfertgrpc.srv.impl;

import akka.stream.Materializer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfertManager;
import sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed;
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

        System.out.println("============== recevied" + in.getChunk());
        PostFileActionPerformed _PostFileActionPerformed = PostFileActionPerformed
                .newBuilder()
                .setErrorMessage("")
                .setHasError(true)
                .setMessage("ok")
                .build();
        return CompletableFuture.completedFuture(_PostFileActionPerformed);
    }

}
