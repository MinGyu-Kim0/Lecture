import java.io.*;

public class IOEx {

    public static void main(String[] args) throws IOException {
        //(1) byte stream 사용
        //파일에 데이터 쓰기
        FileOutputStream fos
                = new FileOutputStream("C://javatest/test.txt");
        BufferedOutputStream bos
                = new BufferedOutputStream(fos);
        String str = "ABC가나다";
        byte[] r = str.getBytes(); //문자열 -> 바이트배열 변환
        bos.write(r);
        bos.flush();
        //      fos.write('가'); //파일에 쓰기 제대로 동작하지 않음 => 한글표현을 위해 최소 2바이트

        //파일에서 데이터 읽기
        FileInputStream fis = new FileInputStream("C://javatest/test.txt");
        BufferedInputStream bis
                = new BufferedInputStream(fis);
        byte[] temp = new byte[1024];
        fis.read(temp); //1024바이트 읽기 -> temp에 저장
        //바이트배열 -> 문자열 변환
        String msg = new String(temp);
        System.out.print(msg.trim()); //빈 공백 제거 후 출력
        System.out.println("end");
    }

}

