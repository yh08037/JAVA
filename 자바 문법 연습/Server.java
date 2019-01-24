import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        System.out.println("[Server Start]");

        // 서버 파트에서 사용할 종이컵(Socket) 클래스 생성 방법
        ServerSocket ss = new ServerSocket(8888);   // port 지정

        while (true) {
            Socket server = ss.accept();

            InputStream is = server.getInputStream();
            byte[] b = new byte[1024];
            is.read(b);
            String result = new String(b);
            System.out.println(result.trim());
        }
    }
}
