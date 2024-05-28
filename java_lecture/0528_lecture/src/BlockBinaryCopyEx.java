import java.io.*;
public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("c:\\Windows\\Web\\Wallpaper\\ThemeD\\img32.jpg");
		
		File dest = new File("c:\\javaTemp\\copying2.jpg"); // 복사 파일
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024 * 2048]; // 10KB
			while (true) {
				int n = fi.read(buf);
				fo.write(buf,0,n);
				if(n<buf.length) {
					break;
				}
				fi.close();
				fo.close();
				System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
			}
		}catch(IOException e) {System.out.println("파일 복사 오류");}

	}

}
