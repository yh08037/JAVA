import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx2 {

    public static void main(String[] args) throws IOException {

        // Character Stream 계열의 I/O 클래스

        // 파일에 문자 데이터 출력
        FileWriter fw = new FileWriter("C://Users/yh080/OneDrive - 경북대학교/코드/PowerJAVA/test.txt");
        fw.write("ABC가나다");
        fw.flush(); // 중요!
        fw.close(); // 중요!

        // 파일에서 문자열 읽기
        FileReader fr = new FileReader("C://Users/yh080/OneDrive - 경북대학교/코드/PowerJAVA/test.txt");
        BufferedReader br = new BufferedReader(fr); // 버퍼기능을 사용하기 위해 체이닝하여 사용
//        int result = br.read();
//        System.out.println((char)result);
        String result = br.readLine();
        System.out.println(result);
        br.close();
        fr.close();


        // BufferedReader : 버퍼기능 제공, 추가적으로 readLine() 메소드 제공

    }

}
