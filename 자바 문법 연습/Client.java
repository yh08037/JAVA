import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket client = new Socket("155.230.57.60", 8888);
        String msg = "메세지 내용";
        OutputStream os = client.getOutputStream();
        os.write(msg.getBytes());
    }

}
