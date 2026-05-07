import java.util.Scanner;

// 案例引入
// 单独变量，不利于数据管理
public class chapter06{
	public static void main(String[] args) {
		// Scanner myScanner = new Scanner(System.in);
		// String name = myScanner.next();
		// String cat_name = "小白";
		// int age = 3;
		// String color = "花色";
		// String cat1_name = "小花";
		// int age1 = 100;
		// String color1 = "花、白色";
		// if (cat_name.equals(name)) {
		// 	System.out.println(age + " " + color);
		// }
		// else if (cat1_name.equals(name)) {
		// 	System.out.println(age1 + " " + color1);
		// }
		// else{
		// 	System.out.println("No cat");
		// }

		Cat cat1 = new Cat();
		System.out.println(cat1.name + " " + cat1.age 
			+ " " + cat1.color + " " + cat1.gender);
		cat1.speak();
		cat1.cal02(5);
		// int res = cat1.getSum(1,2);
		int arr[][] = {{1}, {1,2,3}, {1,2,3,4,5}};
		// System.out.println(res);
		cat1.printarray(arr);
		// int res[] = new int[2];
		int[] res = cat1.getSum(2,1);
		System.out.println(res[0]);
		System.out.println(res[1]);

		if (cat1.ex01(2)) {
			System.out.println("Not odd");
		}
		else System.out.println("odd");

		char a = '#';
		cat1.ex02(4,3,a);


		int[] c = {0, 0, 0, 0};
		int[] b = cat1.ex03(c);
		System.out.println(c[0]);
		System.out.println(b[0]);

	}
}

class Cat{
	String name;
	int age;
	String color;
	char gender;
	public void speak() {
		System.out.println("good");
	}
	// 下面是错误原因，speak函数里面有参数
	// public static void speak(String[] args) {
		
	// }
	public void cal01() {
		int sum = 0;
		for ( int i = 1 ; i <= 1000 ; i++ ) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void cal02(int n) {
		int sum = 0;
		for ( int i = 1 ; i <= n ; i++ ) {
			sum += i;
		}
		System.out.println(sum);
	}

	public int[] getSum(int n, int m) {
		int res[] = new int[2];
		res[0] = n + m;
		res[1] = n - m;
		return res;
	}
    // 遍历数组
	public void printarray(int arr[][]) {
		for (int i = 0; i < arr.length ; i++ ) {
			for (int j = 0; j < arr[i].length ; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	// 判断奇偶 返回boolean
	public boolean ex01(int n){
		if (n % 2 == 0) {
			return true;
		}
		else return false;
	}
 
	// return n % 2 == 0 ? true; false;
	// return n%2 == 0
    
    // 根据行列打印对应字符
    // 

	public void ex02(int n, int m, char a){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m ; j++ ) {
				System.out.print(a);

			}
			System.out.print("\n");
		}
	}

	public int[] ex03(int a[]){
		a[0] = 10;
		return a;
	}

}

// class ex04 {
// 	public static void main(String[] args) {
// 		Person p = new Person();
// 		Person x = p.copyPerson(p);
// 		System.out.println(x.name + " " + p.name);
// 	}
// }

// class Person {
// 	int age = 10;
// 	String name = "Jack";
// 	public Person copyPerson(Person p){
// 		Person q = new Person();
// 		q = p;
// 		return q;
// 	} 
// }

class ex044 {
	public static void main(String[] args) {
		Person m = new Person();
		// Person k = new Person();
		Copy n = new Copy();
		Person k = n.copyPerson(m);  // 可以直接Person xxx = xxx.xxx
		System.out.println(m.name + " " + k.name);
		System.out.println(m == k);
	}
}

class Person {
	int age = 10;
	String name = "Jack";
}

class Copy {
	public Person copyPerson(Person p) {
		Person q = new Person();

		// q = p; 不对，这种还是传递的地址
		// 正确写法如下
		// 
		
		q.age = p.age;
		q.name = p.name;

		return q;
	}
}

class ex05 {
	public static void main(String[] args) {
		Print p = new Print();
		p.printx(4);
		int res = p.mul(4);
		System.out.println(res);
		int r = p.feibo(5);
		System.out.println(r);
		int re = p.count(10);
		System.out.println(re);
		int result = p.count1(1);
		System.out.println(result);
	}
}

class Print {
	public void printx(int n) {
		if (n > 2) {
			printx(n - 1);
		}
		System.out.println("n = " + n);
	}

	//阶乘的代码，使用递归怎么都想不出来
	// public int mul(int n) {
	// 	// int res = 1;
	// 	if (n > 1) {
	// 		 mul(n - 1);
	// 	}
	// 	// res *= n;
	// 	int res = n * (n + 1);
	// 	return res;
	// }
	// 
	// 正确写法
	public int mul(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return n * mul(n-1);
		}
	}

	public int feibo(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return feibo(n-1) + feibo(n-2);
		}
	}

	// 猴子吃桃子
	public int count(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return (count(n - 1) + 1) * 2;
		}
	}

	// 如果正常判断，n = 10时 return 1
	public int count1(int n) {
		if (n == 10) {
			return 1;
		}
		else if (n >= 1 && n <= 9) {
			return (count1(n + 1) + 1 ) * 2;  // 注意这里是n+1
		}
		else
			return -1;
	}
}

// 老鼠出迷宫
// 8 x 7 二维数组
// 数组中0表示可以走，1表示障碍物


class ex06 {
	public static void main(String[] args) {

		int[][] a = new int[8][7];
		for (int i = 0; i < a.length ; i++ ) {
			for (int j = 0; j < a[i].length ; j++ ) {
				if (i == 0 || i == a.length - 1) {
					a[i][j] = 1;
				}
				else if (j == 0 || j == a[i].length - 1) {
					a[i][j] = 1;
				}
				else a[i][j] = 0;
			}
			
		}

		// 特殊位置也有墙
		a[3][1] = 1;
		a[3][2] = 1;
		a[2][2] = 1;
		
		int x = 1;
		int y = 1;
		Mouse m = new Mouse();
		m.findway(x, y, a);


		//输出迷宫
		for (int i = 0; i < a.length ; i++ ) {
			for (int j = 0; j < a[i].length ; j++ ) {
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}


	}
}

	// 老鼠出迷宫
	// 找到路径返回true，否则返回false
	// 初始位置（4，3)，终点位置(6，5)
	// 路径可以标记 0可以走，1障碍物，2可以走且走的通，3走过但是走不通
	// 当终点位置(6,5) == 2 说明找到通路，可以结束了
	// 查找顺序 如 下 -> 右 -> 上 ->左
	// 要注意，走的通的要！！！返回true，走不通的要！！！返回false

class Mouse {
	public boolean findway(int i, int j, int[][] map) {
		if (map[6][5] == 2) {
			return true;
		}
		else {
			if (map[i][j] == 0) {
				
				map[i][j] = 2;

				if (findway(i+1, j, map)) {
					return true;
				}
				else if (findway(i, j+1, map)) {
					return true;
				}
				else if (findway(i-1, j, map)) {
					return true;
				}
				else if (findway(i, j-1, map)) {
					return true;
				}
				else {
					map[i][j] = 3;
					return false;
				}
				
			}
			else{
				return false;
			   }
			} 
		}
}

//
// 就是说，不需要判断是不是越界了或者怎么怎么，只要判断能不能走
// 如果在递归调用中，i 和 j 越界了，即超出了数组的范围，
// 这个时候对应的 map[i][j] 就会是数组中不存在的位置，
// 也就不会进入 map[i][j] == 0 的条件判断中，
// 从而避免了对越界数组的访问。
// 
		// if (map[i][j] == 0 && i < map.length && y < map[i].length) {
		// 	return true;
		// }
		// else if (map[i][j] == 1 && i < map.length && y < map[i].length) {
		// 	return findway(i+1, j, map);
		// }
		// else if (map[i][j] == 1 && i == map.length-1 && y < map[i].length) {
		// 	return findway(i, j+1, map);
		// }
		// else if (map[i][j] == 1 && i < map.length && y == map[i].length-1) {
		// 	return findway(i+1, j, map);
		// }

// 汉诺塔问题
// 在三根柱子之间移动圆盘
// 

class ex07 {
	public static void main(String[] args) {
		HanNuoTa h1 = new HanNuoTa();
		h1.swap(3,'A','B','C');
	}
}

// num, a, b, c表示A,B,C塔

class HanNuoTa {
	public void swap(int num, char a, char b, char c) {
		if (num == 1) {
			System.out.println( a + "->" + c);
		}
		else{
			// 不止一个盘
			swap(num - 1, a, c, b);
			System.out.println(a + "->" + c);
			swap(num - 1, b, a, c);
		}
	}
}

// 8皇后问题，首先，需要初始位置吗？ 肯定要啊


class ex08 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		int[][] chess = new int[n][n];
		for (int i = 0; i < 4; i++ ) {
			for (int j = 0; j < 4; j++) {
				chess[i][j] = 0;
			}
		}
		Queen q = new Queen();
		int count = q.find(0, 0, chess);
		System.out.println(count);
	}
}

class Queen {
	public int find(int count, int row, int[][] chess) {
		if (row == chess.length) {
			print(chess);
			count += 1;
			printcount(count);
			// return count += 1;
			// return count;
		}
		// int total = count;
		for (int col = 0; col < chess.length; col++) {
			if (judge(row, col, chess)) {
				chess[row][col] = 10;
				find(count, row+1, chess);
				chess[row][col] = 0;
			}

		}
		return count;
	}
	public boolean judge(int x, int y, int[][] chess) {
		// 同一行有Q 返回false
		// for (int j = 0; j < chess.length; j++) {
		// 	if (chess[x][j] == 10) {
		// 		return false;
		// 	}
		// }
		// 同一列有Q,返回false
		for (int i = 0; i < chess.length; i++) {
			if (chess[i][y] == 10) {
				return false;
			}
		}
		// 斜线上有Q,返回false
		// 下面写法可能会越界
		// if (chess[x+1][y+1] == 'Q' || chess[x-1][y+1] == 'Q'
		// 	|| chess[x-1][y-1] == 'Q' || chess[x+1][y-1] == 'Q') {
		// 	return false;
		// }
		// 
		//45°
		for (int i = x - 1, j = y - 1; i >=0 && j >= 0; i--, j--) {
			if (chess[i][j] == 10) {
				return false;
			}
		}

		//135°
		for (int i = x - 1, j = y + 1; i >= 0 && j < chess.length; i--, j++) {
			if (chess[i][j] == 10) {
				return false;
			}
		}

		return true;

	}

	public void print(int[][] chess) {
		for (int i = 0; i < chess.length ; i++ ) {
			for (int j = 0; j < chess[i].length ; j++ ) {
				System.out.print(chess[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public void printcount(int count) {
		System.out.println(count + " Solution!");
	}
}


class ex09 {
	public static void main(String[] args) {
		MyCalculator m = new MyCalculator();
		m.calculate(1, 2);
		// m.calculate(1, 2.0);
		// m.calculate(1.0, 2);
		m.calculate(1, 2, 3);

		// 封装成一个方法
		// 
		


	}
}

class MyCalculator {
	// public void calculate(int n1, int n2) {
	// 	System.out.println(n1 + n2);
	// }

	// // public void calculate(int n1, double n2) {
	// // 	System.out.println(n1 + n2);
	// // }

	// // public void calculate(double n2, int n1) {
	// // 	System.out.println(n1 + n2);
	// // }

	// public void calculate(int n1, int n2, int n3) {
	// 	System.out.println(n1 + n2 + n3);
	// }

	// 封装成一个方法

	public void calculate(int... n) { 
	// int...表示可以接收多个int类型的参数
	// 可变参数可以当做数组使用
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		System.out.println(sum);

	}
}


// Method类 重载方法

class ex10 {
	public static void main(String[] args) {
		Method m = new Method();
		m.calculate(1);
		m.calculate(1, 2);
		m.calculate("hello");
		int x = m.max(1, 2);
		double y =m.max(1.0, 2.0);
		double z = m.max(1.0, 3.0, 2.0);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}


class Method {
	public void calculate(int n1) {
		System.out.println(n1 * n1 * n1);
	}

	public void calculate(int n1, int n2) {
		System.out.println(n1 * n2);
	}

	public void calculate(String a) {
		System.out.println(a);
	}

	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1, double n2, double n3) {
		double c = n1 > n2 ? n1 : n2;
		return c > n3 ? c : n3;
		// System.out.println(n1 + n2 + n3);
	}

}


class ex11 {
	public static void main(String[] args) {
		Info m = new Info();
		m.calculate("Lucy", 100, 100, 100);

	}
}

// 姓名 课程成绩

class Info {
	public void calculate(String name, int... n) { 
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		System.out.println(name + sum);

	}
}


class ex12 {
	public static void main(String[] args) {
		// PersonInfo p = new PersonInfo(10, "Lucy");
		// // PersonInfo p = new PersonInfo();
		// // p.PersonInfo(p, 10, "Lucy");
		// System.out.println(p.name);
		// System.out.println(p.age);
		PersonInfo p = new PersonInfo(10, "David");
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.hashCode());
		PersonInfo p1 = new PersonInfo(20, "Lucy");
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.hashCode());
		PersonInfo p2 = new PersonInfo();
		System.out.println(p2.name);
		System.out.println(p2.age);
	}
}

// 构造器

class PersonInfo {
	int age;
	String name;
	//  下面是没看视频之前以为构造器的写法。。。
	//  其实是不太对的，还是只是定义了一个成员方法
	//  
	// public void PersonInfo(PersonInfo p, int age, String name) { 
	// 	p.age = age;
	// 	p.name = name;
	// }
	PersonInfo(){
		this(10, "Jack");
		System.out.println("PersonInfo()构造器"); 
		// age = 18;
	}

	PersonInfo(int age, String name) {
		System.out.println("PersonInfo(int age, String name)构造器");
		this.age = age;
		this.name = name;
		// System.out.println(this.hashCode());
	}

}

// 犯了至少2个错
// 1. this.name == name 字符串相等不应该这么比较，应该用equals
// 2. 题目本质还是和另外一个对象的age和name比较，
// compareTo函数传入的参数应该是一个对象


class ex13 {
	public static void main(String[] args) {
		PersonInfo1 p1 = new PersonInfo1(10, "aaa");
		if (p1.compareTo(10, "aaa")) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
}


class PersonInfo1 {
	int age;
	String name;
	PersonInfo1(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public boolean compareTo(int age, String name) {
		if (this.age == age && this.name == name) {
			return true;
		}
		else return false;
	}
}

// 更正之后
class ex14 {
	public static void main(String[] args) {
		PersonInfo2 p1 = new PersonInfo2(10, "aaa");
		PersonInfo2 p2 = new PersonInfo2(10, "aaa");
		if (p1.compareTo(p2)) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
}


class PersonInfo2 {
	int age;
	String name;
	PersonInfo2(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public boolean compareTo(PersonInfo2 p) {
		// if (this.age == p.age && p.name.equals(this.name)) {
		// 	return true;
		// }
		// else return false;
		return this.age == p.age && p.name.equals(this.name);
	}
}

class ex15 {
	public static void main(String[] args) {
		FindString c = new FindString();
		String[] a = {"Amy", "Jack", "Tom"};
		int res = c.find(a, "TomI");
		System.out.println(res);
	}
}


class FindString {
	public int find(String[] p, String a) {
		int index = -1;

		for (int i = 0; i < p.length; i++) {
			if (a.equals(p[i])) {
				index = i;
			}
		}
		return index;
	}
}


class ex16 {
	public static void main(String[] args) {
		Book b = new Book(160);
		b.updatePrice();
		System.out.println(b.price);
	}
}


class Book {
	int price;
	Book(int price) {
		this.price = price;
	}
	public void updatePrice() {
		if (this.price >150) {
			this.price = 150;
		}
		else {
			if (this.price > 100) {
				this.price = 100;
			}
		}
	}
}


class ex17 {
	public static void main(String[] args) {
		int[] x = {1, 2, 3};
		int[] y = {0, 0, 0};
		// 注意，不能直接写Arr arrold = new Arr({1,2,3})
		// 以为里面是引用类型，传递地址，{1,2,3}断然不能传递地址
		Arr arrold = new Arr(x);
		Arr arrnew = new Arr(y);
		arrnew.copyArr(arrold);
	}
}


class Arr {
	int[] arr;
	Arr(int[] arr) {
		this.arr = arr;
	}
	// 复制数组
	public void copyArr(Arr a) {
		for (int i = 0; i < a.arr.length; i++) {
			this.arr[i] = a.arr[i];
		}
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}

}



class ex18 {
	public static void main(String[] args) {
		Circle c = new Circle(1.0);
		c.zhouchang();
		c.mianji();
	}
}


class Circle {
	double r;
	Circle(double r) {
		this.r = r;
	}
	public void zhouchang() {
		double zhouchang = 2 * Math.PI * this.r;
		System.out.println(zhouchang);
	}
	public void mianji() {
		double mianji =  Math.PI * this.r * this.r;
		System.out.println(mianji);
	}
}



class ex19 {
	public static void main(String[] args) {
		Cale c = new Cale(1, 0);
		c.sum();
		c.minus();
		c.mul();
		c.notmul();
	}
}


class Cale {
	double x;
	double y;
	Cale(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void sum() {
		System.out.println(x + y);
	}
	public void minus() {
		System.out.println(x - y);
	}
	public void mul() {
		System.out.println(x * y);
	}
	public void notmul() {
		if (y == 0) {
			System.out.println("非法操作");
		}
		else
			System.out.println(x/y);
	}
}



class ex20 {
	public static void main(String[] args) {
		Dog d = new Dog(9, "黄色", "来福");
		d.show();
	}
}


class Dog {
	int age;
	String color;
	String name;
	Dog(int age, String color, String name) {
		this.age = age;
		this.color = color;
		this.name = name;
	}
	public void show() {
		System.out.println(this.age + " " + this.name 
			+ " " + this.color);
	}
}


class ex21 {
	public static void main(String[] args) {
		Music m = new Music(100, "111", "x", "y");
		m.show();
	}
}


class Music {
	int time;
	String name;
	String play;
	String stop;
	Music(int time, String name, String play, String stop) {
		this.time = time;
		this.name = name;
		this.play = "play";
		this.stop = "stop";
	}
	public void show() {
		System.out.println(this.time + " " + this.name 
			+ " " + this.play+ " " + this.stop);
	}
}

// class ex22 {
// 	public static void main(String[] args) {
		
// 	}
// }


class Test {
	public double method(double n, double m) {
		return n+m;
	}
	public  void test() {
		System.out.println(method(method(10.0,20.0),100));
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.test();
	}
}
	

class ex22 {
	public static void main(String[] args) {
		int times = 5;
		Circlecc c = new Circlecc();
		PassObject p = new PassObject();
		p.printAreas(c, times);
	}
}


class Circlecc {
	double r;

	public double findArea() {
		return Math.PI * this.r * this.r;
	}
}

class PassObject {
	public void printAreas(Circlecc c, int times) {
		for (int i = 1; i <= times; i++) {
			c.r = i;
			double area = c.findArea();
			System.out.println(c.r + " " + area);
		}
	}
}


class ex23 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Tom t = new Tom();
		while(true){
			int x = myScanner.nextInt();
			t.insert(x);
			int y = (int) (Math.random() * 2 + 1);
			t.compare(y);
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
	int wincount = 0;
	int losecount = 0;
	// Tom(int x) {
	// 	this.x = x;
	// }
	public void insert(int x) {
		this.x = x;
	}
	
	public void compare(int y) {
		if (x == 0) {
			if (y == 0) {
				System.out.println("Tom: " + x + " " + "PC: " + y);
				System.out.println("tie");
			}
			else if (y == 1) {
				this.wincount++;
				System.out.println("Tom: " + x + " " + "PC: " + y);
				System.out.println("Tom win " + this.wincount);
			}
			else if (y == 2) {
				this.losecount++;
				System.out.println("Tom: " + x + " " + "PC: " + y);
				System.out.println("Tom lose " + this.losecount);
			}
		}
		else if (x == 1) {
			if (y == 0) {
				this.losecount++;
				System.out.println("Tom: " + x + " " + "PC: " + y);
				System.out.println("Tom lose " + this.losecount);
				// System.out.println("tie");
			}
			else if (y == 1) {
				System.out.println("Tom: " + x + " " + "PC: " + y);
				System.out.println("tie");
				// wincount++;
				// System.out.println("Tom win " + wincount);
			}
			else if (y == 2) {
				this.wincount++;
				System.out.println("Tom: " + x + " " + "PC: " + y);
				System.out.println("Tom win " + this.wincount);
				// losecount++;
				// System.out.println("Tom lose " + losecount);
			}
		}
		else if (x == 2) {
			if (y == 0) {
				this.wincount++;
				System.out.println("Tom: " + x + " " + "PC: " + y);
				System.out.println("Tom win " + this.wincount);
			}
			else if (y == 1) {
				this.losecount++;
				System.out.println("Tom: " + x + " " + "PC: " + y);
				System.out.println("Tom lose " + this.losecount);
				
			}
			else if (y == 2) {
				System.out.println("Tom: " + x + " " + "PC: " + y);
				System.out.println("tie");
			}
		}
	}
}

// 简单的判断方法，判断所有赢的可能性，否则就是输
// if (tom == 0 && PC ==1) {
// 	赢
// }
// else if () {
// 	赢
// }
// else if () {
// 	赢
// }
// else
// 	输


// class ex21 {
// 	public static void main(String[] args) {
		
// 	}
// }


// class Book {
	
// }
// 
// 
// 
// 
