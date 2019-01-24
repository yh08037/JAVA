import java.awt.image.DataBufferDouble;
import java.io.*;

// 자바 I/O 클래스
// -대표 클래스
// Reader : 문자 단위로 읽기 기능 제공, 추상 클래스
// Writer : 문자 단위로 쓰기 기능 제공, 추상 클래스



public class IOEx {

    public static void main(String[] args) throws IOException {

        // 파일에 데이터 쓰기
        FileOutputStream fos
                = new FileOutputStream("C://Users/yh080/OneDrive - 경북대학교/코드/PowerJAVA/test.txt");

        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String str = "ABCD가나다라";
        byte[] b = str.getBytes("utf-8");
        bos.write(b);
        // 이까지만 쓰면 출력이 안된다! 버퍼에 쌓이기만 한다!
        bos.flush();    // 중요! 습관적으로 플러시 쓸 것


//        byte[] b = {'A', 'B', 'C'};
//
//        fos.write(b);


//        fos.write('A');
//        fos.write(65);
//        fos.write(66);;
//        fos.write(67);
//        fos.write('E');


        // 파일에서 데이터 읽기
        FileInputStream fis
                = new FileInputStream("C://Users/yh080/OneDrive - 경북대학교/코드/PowerJAVA/test.txt");
        byte[] r = new byte[1024];
        fis.read(r);
        String mag  = new String(r, "utf-8");        // byte 배열 -> 문자열로 변환
        System.out.println(mag.trim());     // trim() -> 빈 공백 제거

//        System.out.println((char)result);
//        System.out.println((char)result);
//        System.out.println((char)result);
//        System.out.println(C(char)result);
//        result = fis.read();
//        System.out.println((char)result);
//        result = fis.read();
//        System.out.println((char)result);
//        result = fis.read();
//        System.out.println((char)result);

    }
}

