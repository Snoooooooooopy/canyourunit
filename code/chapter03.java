public class chapter03{
	public static void main(String[] args) {
		// 取整
		System.out.println(10/3);

		// 取余 取模  a % b = a - (a / b) * b 
		System.out.println(10%3);

		int a = 1;
		int b = a++;  // b = a; a = a + 1
		// System.out.println(b);
		int c = 1;
		int d = ++c;  // c = c + 1; d =c
		System.out.println(a + " " + b);
		System.out.println(c + " " + d);

		int i = 1;
		i = i++;
		System.out.println(i);
		// 算术运算符 课堂练习2
		int x = 59;
		int y = x/7;
		int z = x%7;
		System.out.println( y + " weeks " + " and " + z + " days");
		double e = 234.5;
		double f = 5.0/9.0 * (e - 100); //必须是5.0和9.0,否则int相除得到0.xxxx转为int结果为0
		System.out.println(f);

		boolean u = true;
		boolean v = false;
		z = 46;
		if((v = false) && (++z == 46)) z++;
		System.out.println(z);
		if((u = false) || (++z == 47)) z++;
		System.out.println(z);

	}
}