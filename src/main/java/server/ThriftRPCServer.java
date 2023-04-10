package server;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import service.impl.UserServiceImpl;
import thrift.rpc.api.user.UserService;

public class ThriftRPCServer {

    public static void main(String args[]) {
        TServer server = null;
        int tserverPort = 9905;
        try {
            TServerTransport serverTransport = new TServerSocket(tserverPort);
            server = new TSimpleServer(new TServer.Args(serverTransport)
                    .processor(
                            new UserService.Processor<>(new UserServiceImpl())
                    )
            );
            System.out.print("Start the server at port ".concat(String.valueOf(tserverPort)));
            server.serve();
            System.out.println("done.");

        } catch (TTransportException e) {
            System.out.println("Failed to start server");
            System.out.println(e.getMessage());
        }

    }
}
