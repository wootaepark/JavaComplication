import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\taewoo\\Desktop\\lecture4_1\\객체지향\\8장 입출력_2024\\test.out");
			int n=0,c;
			while((c=fin.read())!= -1) {
				b[n] = (byte)c;
				n ++;
			}
			System.out.println("C:\\Users\\taewoo\\Desktop\\lecture4_1\\객체지향\\8장 입출력_2024\\test.out 에서 읽은 배열을 출력합니다.");
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i] + " ");
				
			}
			System.out.println();
			fin.close();
		}catch(IOException e) {
			System.out.println("C:\\Users\\taewoo\\Desktop\\lecture4_1\\객체지향\\8장 입출력_2024 에서 읽지 못했습니다. 경로명 체크해주세요");
		}
	}

}
