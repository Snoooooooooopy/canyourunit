import java.util.Scanner;

public class input{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String name = myScanner.next(); // 表示接收用户输入
		int age = myScanner.nextInt();
		double salary = myScanner.nextDouble();
		System.out.println(name + " " + age + " " + salary);
	}
}