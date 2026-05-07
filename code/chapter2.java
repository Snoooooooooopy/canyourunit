public class chapter2{
	public static void main(String[] args) {
		boolean pass = true;  // true小写
		if(pass == true) {
			System.out.println("考试通过");
		}
		else {
			System.out.println("考试未通过");
		}
		int a = 10;
		float b = a + 1.1f;
		System.out.println(b);
		int c = (int)1.9;
		System.out.println("c=" + c);  //造成精度损失
		byte d = (byte)2000;
		System.out.println("d=" + d);  // 造成数据溢出
	}
}