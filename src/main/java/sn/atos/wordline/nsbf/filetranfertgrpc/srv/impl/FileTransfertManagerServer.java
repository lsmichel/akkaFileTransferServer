/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.atos.wordline.nsbf.filetranfertgrpc.srv.impl;

/**
 *
 * @author A746054
 *
 */
import akka.actor.ActorSystem;
import akka.grpc.javadsl.ServiceHandler;
import akka.http.javadsl.*;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.Function;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import java.util.concurrent.CompletionStage;
import sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfertManagerHandlerFactory;

public class FileTransfertManagerServer {

    public static void main(String[] args) throws Exception {
        Config conf = ConfigFactory.parseString("akka.http.server.preview.enable-http2 = on")
                .withFallback(ConfigFactory.defaultApplication());
        ActorSystem sys = ActorSystem.create("HelloWorld", conf);
        run(sys).thenAccept(binding -> {
            System.out.println("gRPC server bound to: " + binding.localAddress());
        });

    }

    public static CompletionStage<ServerBinding> run(ActorSystem sys) throws Exception {
        Materializer mat = ActorMaterializer.create(sys);

        // Instantiate implementation
        FileTransfertManagerImpl impl = new FileTransfertManagerImpl(mat);

        return Http.get(sys).bindAndHandleAsync(
                FileTransfertManagerHandlerFactory.create(impl, mat, sys),
                ConnectHttp.toHost("127.0.0.1", 8082),
                mat);
    }
}
