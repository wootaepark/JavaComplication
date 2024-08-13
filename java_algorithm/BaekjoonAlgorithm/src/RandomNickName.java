import java.util.*;
public class RandomNickName {
	
	static ArrayList<String> nickname1 = new ArrayList<>(Arrays.asList("기절초풍", "멋있는", "재미있는"));
	static ArrayList<String> nickname2 = new ArrayList<>(Arrays.asList("도전적인", "노란색의", "바보같은"));
	static ArrayList<String> nickname3 = new ArrayList<>(Arrays.asList("돌고래", "개발자","오랑우탄"));
	
	public static String createRandomNickName() {
		// Math.random(); -> 0.0이상 1.0 미만의 난수 생성
		int index1 = (int)(Math.random()*3);
		int index2 = (int)(Math.random()*3);
		int index3 = (int)(Math.random()*3);
		
		String result = new String(nickname1.get(index1) + nickname2.get(index2) + nickname3.get(index3));
		return result;
	}

	public static void main(String[] args) {
		

		String nickname = createRandomNickName();
		System.out.println(nickname);

		
		
		

	}

}

// 랜덤 닉네임 생성기 (nbc java 1번 과제)
