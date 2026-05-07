public class homework02{
	public static void main(String[] args) {
		char a = '\n';  // 没问题，前面加/是为了有“\”时的输出
		char b = '\t';
		char c = '\r';
		char d = '\\';
		char e = '1';
		char f = '2';
		char g = '3';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println('\"');   // 这是转义字符输出的表示
		// \n \t \r本事就是转义字符了
	}

}

class homework03{
	public static void main(String[] args) {
		String book1 = "平凡的世界";
		String book2 = "Gone with wind";
		System.out.println(book1 + book2);

		// String gender1 = "男";
		// String gender2 = "女";
		// System.out.println(gender1 + gender2);

		// String price1 = "100";
		// String price2 = "200";
		// System.out.println(price1 + price2);

		char gender1 = '男';
		char gender2 = '女';
		System.out.println(gender1 + gender2);

		int price1 = 100;
		int price2 = 200;
		System.out.println(price1 + price2);
	}	
}

class homework04{
	public static void main(String[] args) {
		String name = "姓名"; // string
		String age = "年龄";  // int
		String score = "成绩";  // double
		String gender = "性别";  // char
		String hobby = "爱好"; // string
		String n = "路之遥";
		int a = 24;
		double s = 100.00;
		char g = '女';
		String h = "阅读";
		System.out.println(name + '\t' + age + '\t' + score + '\t' + gender + '\t' + hobby + '\n' 
			+ n + '\t' + a + '\t' + s + '\t' + g + '\t' + h);
		// \t是个转义字符，本质上是一个字符串（char类型），因此可以单引号'\t'
		// 也可以升级精度，用双引号引，"\t"
	}	
}