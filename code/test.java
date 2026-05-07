import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			Tom t = new Tom(i);
			t.compare();
			System.out.println(t.count); 
			// count输出全是1，因为每次运行
			// 程序都新生成一个对象t，更新count
		}
		
	}
}

// 猜拳， 0，1，2
// 成员变量
// 成员方法，与计算机的随机数进行比较，统计赢的次数
// 
// 困惑，如何生成随机数，如何累加count

class Tom {
	// 0,1,2
	int x;
	int count = 0;
	Tom(int x) {
		this.x = x;
	}
	
	public void compare() {
		if (x != 0) {
			count += 1;
	    }
	}
}