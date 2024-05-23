import java.io.*;
import java.util.*;
public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		FileWriter fount = null;
		// int c;
		
		try {
			fount = new FileWriter("C:\\Users\\taewoo\\Desktop\\lecture4_1\\객체지향\\8장 입출력_2024\\test.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length()==0) {
					break;
				}
				fount.write(line, 0, line.length());
				fount.write("\r\n", 0, 2); // \r 은 왼쪽 앞으로 커서를 이동시키는 의미
				
			}
			fount.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();

	}

}
