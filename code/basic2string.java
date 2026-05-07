public class basic2string{
	public static void main(String[] args) {
		int n1 = 100;
		String s1 = n1 + "";
		String s2 = n1 + "";
		System.out.println(s1 + s2);

		String s3 = 100 + "";
		int a = Integer.parseInt(s3);
		double b = Double.parseDouble(s3);
		boolean c = Boolean.parseBoolean(s3);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(s3.charAt(1));
	}
}