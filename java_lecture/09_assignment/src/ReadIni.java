import java.io.*;

public class ReadIni {

	public static void main(String[] args) {
		FileReader fr = null;
		File f = new File("c:\\windows\\system.ini");
		try {
			fr = new FileReader(f);
			System.out.println(f.getPath() + "를 출력합니다.");
			while(true) {
				int c = fr.read();
				if(c == -1)
					break;
				System.out.print((char)c);
			}
			fr.close();
		} 
		catch (IOException e) {
			System.out.println("IO 오류");
		}
	}

}