
public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		System.out.println("[Bitwise Operation Results]");
		System.out.printf("%04x\n",(short)(a&b));
		System.out.printf("%04x\n",(short)(a|b));
		System.out.printf("%04x\n",(short)(a^b));
		System.out.printf("%04x\n",(short)(~a));
		
		byte c = 20; //0x14
		byte d = -8; //0xf8;
		
		System.out.println("[Shift operation Results]");
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d>>2);
		System.out.printf("%x\n", d>>2);
		
		System.out.println(d>>>2);
		System.out.printf("%x\n", d>>>2);
		// cpu는 4Byte 기준으로 연산하기 때문에 3e 가 아니다!!!!!
		

		
		
	}

}
