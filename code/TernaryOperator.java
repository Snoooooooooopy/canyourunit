public class TernaryOperator{
	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int c = 2;
		// int d = a > b ? a : b;
		// int max = c > d ? c : d;
		// �句话实现�
		int max = c > (a > b ? a : b) ? c : (a > b ? a : b);
		System.out.println(max);
	}
}