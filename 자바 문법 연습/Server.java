import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {


        ServerSocket ss = new ServerSocket(8888);
        Socket server = ss.accept();

        InputStream is = server.getInputStream();
        byte[] b = new byte[1024];
        is.read(b);
        String result = new String(b);
        System.out.println(result.trim());
    }
}
