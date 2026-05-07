import java.util.Scanner;
public class chapter04{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int age = myScanner.nextInt();
		if(age > 18){
			System.out.println("xxxx");
		}
	}
}
class ex2{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double x = myScanner.nextDouble();
		double y = myScanner.nextDouble();
		if(x > 10.0 & y < 20.0){
			// double z = x + y;
			System.out.println(x+y);
		}

	}
}

class ex3{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int x = myScanner.nextInt();
		int y = myScanner.nextInt();
		int z = x + y;
		if(z %3 ==0 & z %5 ==0){
			// double z = x + y;
			System.out.println(x+y);
		}	
	}
}

class ex4{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int z = myScanner.nextInt();
		if((z % 4 ==0 && z % 100 !=0) || (z % 400 ==0)){
			// double z = x + y; 闰年是两者条件符合一个就行
			System.out.println(z);
		}	
	}
}

class ex5{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int z = myScanner.nextInt();
		// 后面还可以利用异常处理机制判断是否为合法数字
		if(z >= 0 && z <= 100){
			if(z == 100){
				// double z = x + y; 闰年是两者条件符合一个就行
				System.out.println("!!!");
			}
			else if (z > 80 && z <= 99) {
				System.out.println("!!");
			}	
			else if (z > 60 && z <= 80) {
				System.out.println("!");
			}
			else{
				System.out.println(".");
			}
		}
		else{
			System.out.println("x");
		}

		
	}
}

class ex6{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double score = myScanner.nextDouble();
		char gendar = myScanner.next().charAt(0);
		if (score > 8.0){
			if(gendar == '女'){
				System.out.println("进入女子组");
			}
			else{
				System.out.println("进入男子组");
			}
		}
		else{
			System.out.println("淘汰");
		}	
	}
}

class ex7{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int age = myScanner.nextInt();
		int mon = myScanner.nextInt();

		if (mon >= 4 && mon <= 10){
			if(age < 18){
				System.out.println("30");
			}
			else if( age <= 60){
				System.out.println("60");
			}
			else{
				System.out.println("10");
			}
	    }
	    else{
	    	if(age >= 18 && age <= 60){
	    		System.out.println("40");
	    	}
	    	else{
	    		System.out.println("20");
	    	}
	    }
  }
}

class ex8{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		char shuru = myScanner.next().charAt(0);
		switch(shuru){
			case 'a': System.out.println("星期一"); break;
			case 'b': System.out.println("星期二"); break;
			case 'c': System.out.println("星期三"); break;
			case 'd': System.out.println("星期四"); break;
			case 'e': System.out.println("星期五"); break;
			case 'f': System.out.println("星期六"); break;
			case 'g': System.out.println("星期七"); break;
			default: System.out.println("错误");
		}  // 每个语句后面都要break；除了default	
	}
}

class ex9{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		char shuru = myScanner.next().charAt(0);
		switch(shuru){
			case 'a': System.out.println("A"); break;
			case 'b': System.out.println("B"); break;
			case 'c': System.out.println("C"); break;
			case 'd': System.out.println("D"); break;
			case 'e': System.out.println("E"); break;
			// case 'f': System.out.println("星期六"); break;
			// case 'g': System.out.println("星期七"); break;
			default: System.out.println("other");
		}  // 每个语句后面都要break；除了default	
	}
}


class ex10{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int season = myScanner.nextInt();
		// int res = season/3
		switch(season){
			case 3: 
			case 4:
			case 5:
				System.out.println("春"); break;
			case 6: 
			case 7:
			case 8:
				System.out.println("夏"); break;
			case 9: 
			case 10:
			case 11:
				System.out.println("秋"); break;
			case 12: 
			case 1:
			case 2:
				System.out.println("冬"); break;
			// case 'g': System.out.println("星期七"); break;
			default: System.out.println("错误");
		}  // 每个语句后面都要break；除了default	
	}
}
// 
// 
class ex11{
	public static void main(String[] args) {
		int i = 0;
		for(i = 0; i <= 8; i++){
			System.out.println("1");	
	}
		System.out.println("2");
  }
}




class ex12{
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		int start = 1;
		int end = 100;
		int t =9;
		// int i = 1;
		for (int i = start; i <= end; i++){
			if(i % t ==0){
				System.out.println(i);
				sum += i;
				count += 1;

			}
		}
		System.out.println(sum);
		System.out.println(count);
	}
}

class ex13{
	public static void main(String[] args) {
		// for(i = 0, j = 5; i<=5 && j>=0; i++, j++){ //条件式子不能写成for(; i<=5, j>=0;)
		// 	System.out.println(i + " + " + j +" = " + "5");
		// }
		int n = 5;
		for (int i = 0; i <= n; i++){
			System.out.println(i + " + " + (n-i) + " = 5");
		}
	}
}


class ex14{
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i + " * " + j + " = " + (i*j) + " ");
			}
			System.out.print("\n");
		}
		
	}
}


class ex15{
	public static void main(String[] args) {
		int i = 1;
		while(i <= 100){
			if(i % 3 == 0){
				System.out.println(i);
			}
			i++;
		}		
	}
}

class ex16{
	public static void main(String[] args) {
		int i = 40;
		while(i <= 200){
			if(i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}		
	}
}


class ex17{
	public static void main(String[] args) {
		int  i = 1;
		int sum = 0;
		do{
			System.out.println(i);
			i++;
			sum += i;
		}while(i <= 100);
		
	}
}

class ex18{
	public static void main(String[] args) {
		int  i = 1;
		int count = 0;
		do{
			if(i % 5 == 0 && i % 3 != 0){
				count += 1;
			}
			i++;
		}while(i <= 100);
		
		System.out.println(count);
	}
}

class ex19{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		// boolean flag = true;
		// String ans = myScanner.next();
		// 错误原因：定义的string类型的ans，并且用ans == "no"错误的进行字符串的比较
		do{
			char ans = myScanner.next().charAt(0); 
			if (ans == 'n'){
				System.out.println("还钱!");
			}
			else if(ans == 'y'){
				break;
			}
		}while(true);
		
	}
}



class ex20{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double total_sum = 0;
		for(int i=1; i<= 5; i++){
			double sum = 0;
			for(int j=1; j<=5; j++){
				double score = myScanner.nextDouble();
				sum += score;
			}
			total_sum += sum;
			System.out.println(sum/5.0);
		}
		System.out.println(total_sum/15.0);
		

		// double sum = 0;
		// double avr = 0;
		// double sum_all = 0;
		// double avr_all = 0;
		// int count = 0;
		// for(int j = 1; j <= 3; j++){
		// 	for(int i =1; i <= 5; i++){
		// 		double score = myScanner.nextDouble();
		// 		if(score >= 60){
		// 			count += 1;
		// 		}
		// 		sum += score;
		// 		avr =sum/5.0;
		//    }
		//    System.out.println(avr);
		//    sum = 0;
		//    sum_all += avr;
		// }
		// avr_all = sum_all/3.0;
		// System.out.println(avr_all);
		
	}
}



class ex21{
	public static void main(String[] args) {
		//打印斜矩阵
		for (int i = 1; i <= 4 ; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		//打印金字塔
		for (int i = 1; i <= 4 ; i++) {
			for (int j = 3 - i; j >= 0 ; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++){
				System.out.print("*");
			}
			for (int m = 1; m <= i-1 ; m++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		//打印空心金字塔
		for (int i = 1; i <= 4 ; i++) {
			if(i <= 3){
				for (int j = 3-i; j >= 0 ; j--) {
					System.out.print(" ");
					}
					System.out.print("*");
					for (int k = 1; k <= i-1; k++) {
						System.out.print(" ");
					}
					if(i >= 2){
						for (int m = 1; m <= i-2 ; m++ ) {
							System.out.print(" ");
						}
						System.out.print("*");
					}
					System.out.print("\n");
			}
			if(i == 4){
				for(int n = 1; n <= (2*i -1); n++){
					System.out.print("*");
				}
			}
		}
	}

}
//老师的很简单的代码	
class ex22{
	public static void main(String[] args) {
		//打印空心金字塔
		for (int i = 1; i <= 4 ; i++) {
			for (int k = 1; k <= 4-i; k++){
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i - 1 ; j++) {
				if (j == 1 || j == (2*i -1) || i == 4) {
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.print("\n");
		}
  }
}

class ex23{
	public static void main(String[] args) {
		//打印空心菱形
		for (int i = 1; i <= 5 ; i++) {
			if (i <= 3) {
				for (int j = 1; j <= 3-i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= 2*i -1; k++) {
					if (k == 1 || k == 2*i - 1) {
						System.out.print("*");				
					}
					else
						System.out.print(" ");
				}
			}
			else{
				for (int m = 1; m <= i-3; m++) {
					System.out.print(" ");
				}
				for (int n = 1; n <= 11-2*i; n++ ) {
					if (n == 1 || n == 11-2*i) {
						System.out.print("*");
					} 
					else
						System.out.print(" ");
				}
			}
			
			System.out.print("\n");
		}
  }
}
// 


class ex24{
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100 ; i++ ) {
			sum += i;
			if (sum > 20) {
				System.out.println(i);
				break;
			}
			
		}
		
	}
}

// string比较方法 euqals
class ex25{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		//  name = "";
		// String passwd = "";
		for (int i =1; i <= 3 ; i++) {
			String name = myScanner.next();
			String passwd = myScanner.next();
			if ("丁真".equals(name) && "666".equals(passwd)) {
				System.out.println("success");
				break;
			}
			System.out.println("还有"+ (3-i) + "次机会");
		}
		
	}
}


class zuoye1{
	public static void main(String[] args) {
		// 100,000
		//  > 50,000 5%/time
		//  <= 50,000, 1000/time
		double money = 100000;
		int count = 0;
		while(money > 1000){
			if (money > 50000) {
				money -= money * 0.05;
				count += 1;
			}
			else{
				money -= 1000;
				count += 1;
			}
		}
		System.out.println(count);
		
	}
}




class zuoye4{
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i ++) {
			for (int j = 0; j <= 9 ; j++ ) {
				for (int k = 0;k <= 9 ;k++ ) {
					if (i*i*i + j*j*j +k*k*k == 100*i + 10*j + k) {
						System.out.println(100*i + 10*j + k);				
					}
					
				}
				
			}
			
		}
		
	}
}



class zuoye6{
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1;i <= 100;i++) {
			if (i % 5 != 0) {
				System.out.print(i + " ");
				count += 1;
				if (count % 5 == 0) {
					System.out.print("\n");
				}
			}
		}
		
	}
}


// 字符是可以当数值运算的
// 'b' = 'a' + 1

class zuoye7{
	public static void main(String[] args) {
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			// int ans = 'a' + i;
			System.out.println(c1);

		}
		for (char c2 = 'Z'; c2 >= 'A' ; c2-- ) {
			System.out.println(c2);
		}
		//下面这个还是不行
		//for (int i = 1; i <= 26 ; i++ ) {
		// 	char c3 = 97 + i;
		// 	System.out.println(c3);
		// }
		// 更改后正确：
		for (int i = 0; i < 26 ; i++ ) {
			char c3 = (char)(97 + i); 

			// 错误写法 char c3 = char(97 + i) char没用括号括起来
			System.out.println(c3);
		}
		
	}
}


class zuoye8{
	public static void main(String[] args) {
		double sum = 0;
		double x = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				x = 1.0/i;
				sum += x;
			}
			else{
				x = -1.0/i;
				sum += x;
			}
			
		}
		System.out.println(sum);
		
	}
}



class zuoye9{
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++ ) {
			for (int j = 1; j <= i ; j++ ) {
				sum += j;
			}
		}
		System.out.println(sum);
	}
}

// 
// class zuoye2{
// 	public static void main(String[] args) {
		
// 		
// 	}
// }

// 
// class zuoye2{
// 	public static void main(String[] args) {
		
// 		
// 	}
// }

// 
// class zuoye2{
// 	public static void main(String[] args) {
		
// 		
// 	}
// }

// 
// class zuoye2{
// 	public static void main(String[] args) {
		
// 		
// 	}
// }

