import java.io.*;
public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] b = {7, 51, 3, 4, -1, 24};
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\taewoo\\Desktop\\lecture4_1\\객체지향\\8장 입출력_2024\\test.out");
			for(int i=0;i<b.length;i++) {
				fout.write(b[i]);
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("C:\\Users\\taewoo\\Desktop\\lecture4_1\\객체지향\\8장 입출력_2024\\test.out 에 저장할 수 없습니다. 경로명을 확인해주세요");
			return;
		}
		
		System.out.println("C:\\Users\\taewoo\\Desktop\\lecture4_1\\객체지향\\8장 입출력_2024\\test.out 을 저장하였습니다.");

	}

}
