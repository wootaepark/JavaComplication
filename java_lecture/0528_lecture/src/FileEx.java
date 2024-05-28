import java.io.*;
public class FileEx {
	
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다. -----");
		
		File[] subFiles = dir.listFiles();
		for(int i=0 ;i<subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			System.out.print(f.isFile()?"\t파일" : "\t디렉터리");
			System.out.print("\t파일크기 : " + f.length());
			System.out.printf("\t 수정한 시간 : %tb %td %ta %tT\n", t,t,t,t);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", "+ f1.getParent() + ", " + f1.getName());
		
		String res = "";
		if(f1.isFile())
			res = "파일";
		else if(f1.isDirectory())
			res = "디렉토리";
		System.out.println(f1.getPath() + "은 " + res + " 입니다.");
		
		File f2 = new File("c:\\javaTemp\\java_sample"); 
		if(!f2.exists()) {// 해당 디렉토리 미존재 새로운 디렉터리 생성
			f2.mkdir();
		}
		listDirectory(new File("c:\\javaTemp")); // 해당 위치의 파일리스트 출력
		f2.renameTo(new File("c:\\javaTemp\\javasample")); // java_sample 을 javasample 로 변경 
		listDirectory(new File("c:\\javaTemp"));// 이름 변경 후 리스트 출력
		

	}

}
