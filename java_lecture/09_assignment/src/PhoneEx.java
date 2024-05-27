import java.io.*;
import java.util.*;

public class PhoneEx {

	public static void main(String[] args) {
		
		
		FileWriter fw = null;
		
		
		File f = new File("c:\\javaTemp\\data.txt");
		try {
			fw = new FileWriter(f);
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String data = scanner.nextLine(); 
				if(data.equals("그만"))
						break; 
				fw.write(data+"\r\n"); 
			}
			System.out.println(f.getPath()+"에 저장하였습니다.");
			
			scanner.close();
			fw.close();
		} 
		catch (IOException e) { 
			System.out.println("IO 오류");
		}
	}

}