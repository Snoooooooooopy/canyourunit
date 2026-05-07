
// JAVA
// 文件编码为GBK，和cmd控制台一致
// hello是一个public类
// 这里必须和文件名hello一样，如果类名为Hello则不能正确编译
// 需要注意，javac hello.java编译之后，运行直接java hello
// 不需要java hello.class，不然程序会默认这里的类是hello.class
// 从而找不到
public class hello{
	public static void main(String[] args) {
		System.out.println("hellojava"); // 分号结束
	}
}
class dog{
	public static void main(String[] args) {
		System.out.println("dog");
	}
}