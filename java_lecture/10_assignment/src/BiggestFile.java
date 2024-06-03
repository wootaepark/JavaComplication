import java.io.File;
 
public class BiggestFile {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f;
		File list[];
		try {
			f=new File("c:\\");
			list=f.listFiles();
			
			long max=-1;
			int maxi=-1;
			for(int i=0;i<list.length;i++) {
				if(max<list[i].length()) {
					max=list[i].length();
					maxi=i;
				}
			}
			System.out.println("가장 큰 파일은 "+list[maxi].getPath()+"  "+list[maxi].length()+"바이트");
			
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
	}
 
}