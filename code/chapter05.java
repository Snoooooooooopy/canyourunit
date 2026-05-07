import java.util.Scanner;
import java.util.Random;
// string±È½Ï·½·¨ euqals
public class chapter05{
	public static void main(String[] args) {
		double[] hens = {1, 2, 3, 4, 5};
		for (int i = 0; i < 6 ; i++ ) {
			System.out.println(hens[i]);
		}
		
	}
}

class ex01{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double res[] = new double[5];
		for (int i = 0 ; i < 5 ; i++ ) {
			res[i] = myScanner.nextDouble();
			System.out.println(res[i]);
		}
	}
}


class ex02{
	public static void main(String[] args) {
		char c1[] = new char[26];
		int i = 0;
		for (char c2 = 'A'; c2 <= 'Z' ; c2++ ) {
			c1[i] = c2;
			i += 1;
		}
		// for (int i = 0; i < 26 ; i++ ) {
		// 	c1[i] = (char) (97 + i);
		// }
		for (int j = 0; j < 26 ; j++ ) {
			System.out.println(c1[j]);
		}
	}
}


class ex03{
	public static void main(String[] args) {
		int a[] = {4, -1, 9, 10, 23};
		int max = 0;
		for (int i = 0; i < a.length ; i++ ) {
			if (a[i] > max) {
				max = a[i];
				//ÎªÊ²Ã´ÒªÐ´³ÉÏÂÃæÕâÑù·±Ëö£¿£¿
				//	// int temp = 0;
				// temp = a[i];
				// max = temp;
			}
			else
				continue;
		}
		System.out.println(max);
	}
}


class ex04{
	public static void main(String[] args) {
		double hens[] = {1, 2, 3, 4, 5};
		double sum = 0;
		for (int i = 0 ; i < hens.length ; i++) {
			sum += hens[i];
		}
		double avr = sum/hens.length;
		System.out.println(avr);
	}
}


class ex05{
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3};
		int arr2[] = new int[4];
		for (int i = 0; i < arr1.length; i++ ) {
			arr2[i] = arr1[i];
		}
		arr2[arr1.length] = 4;
		arr1 = arr2;
		System.out.println(arr1.length);

	}
}


class ex06{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int l = arr.length/2;
		for (int i = 0, j = arr.length - 1; i < l ; i++, j-- ) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int k = 0; k < arr.length ; k++ ) {
			System.out.println(arr[k]);
		}
	}
}

class ex07{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int arr[] = {1, 2, 3};
		int len = arr.length;
		// int arr[5] = 1;
		while(true){
			char ans = myScanner.next().charAt(0);
			if (ans == 'y') {
				int x = myScanner.nextInt();
				len += 1;
				int arr1[] = new int[len];
				for (int i = 0; i < len - 1 ; i++ ) {
					arr1[i] = arr[i];
				}
				arr1[len-1] = x;
				arr = arr1;

			}
			else break;
		}
		for (int k = 0; k < arr.length ; k++ ) {
			System.out.println(arr[k]);
		}
	}
}

class ex08{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		Scanner myScanner = new Scanner(System.in);
		while(true){
			char ans = myScanner.next().charAt(0);
			if (ans == 'y') {
				int arr1[] = new int[arr.length - 1];
			
				if (arr.length == 1) {
					System.out.println("²»ÄÜÉ¾¼õ");
					break;
				}
				else{
					for (int i = 0; i < arr1.length ; i++ ) {
					arr1[i] = arr[i];
					}
					arr = arr1;
				}
			}
			else{
				break;
			}
			
		}
		System.out.println(arr.length);
	}
}

class ex09{
	public static void main(String[] args) {
		int a[] = {1, 5, 3, -1, 2};
		for (int i = 0; i < a.length - 1 ; i++ ) {
			for (int j = 1; j < a.length-i ;j++) {
				if (a[j-1] > a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(i);
		
		}
		for (int k = 0; k < a.length ; k++ ) {
			System.out.println(a[k]);
		}
	}
}

class ex10{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int target = 4;
		int j = arr.length/2;;
		for (int i = 0; i < arr.length/2 ; i++ ) {
			for (; j < arr.length || j >= 0; ) {

				if (target == arr[j]) {
					System.out.println(j);
					return;
				}
				else if (target > arr[j]) {
					j = (j + arr.length)/2;
					continue;
				}
				else if (target < arr[j]){
					j = arr.length/2;
					continue;
				}
			}
			
		}
	}
}


class ex11{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int target = 6;
		//Ò²¿ÉÒÔÓÃflagµÈ±êÊ¶·û
		int index  = -1;
		for (int i = 0; i < arr.length ; i++ ) {
			if (target == arr[i]) {
				System.out.println(i);
				index = i;
				break;
			}
			
		  }
	   if (index == -1) {
				System.out.println("Not found");
			}
		// for (int i = 0; i < arr.length ; i++ ) {
		// 	if (target == arr[i]) {
		// 		System.out.println(i);
		// 		break;
		// 	}
		// 	else {
		// 		if (i == arr.length - 1) {
		// 			System.out.println("Not found");
		// 			break;
					
		// 		}
		// 		else
		// 		continue;
		//   }
	 //  }	
	}
}

class ex12{
	public static void main(String[] args) {
		// int a[][] =  { {0, 0, 0 ,0 ,0 ,0},
		// 			   {0, 0, 1 ,0 ,0 ,0},
		// 			   {0, 0, 0 ,0 ,2 ,0},
		// 			   {0, 0, 0 ,0 ,0 ,0} };
		int a[][] = new int[4][6];
		a[0][1] = 1;
		for (int i = 0; i < 4 ; i++ ) {
			for (int j = 0; j < 6 ; j++ ) {
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}


class ex13{
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		for (int i = 0; i < 3 ; i ++) {
			int b[] = new int[i + 1];
			for (int j = 0; j < i+1 ; j ++) {
				b[j] = i + 1;
			}
			a[i] = b;
		}
		// System.out.println(a.length);
		for (int m = 0; m < a.length ; m++ ) {
			for (int n = 0; n < a[m].length ; n++ ) {
				System.out.print(a[m][n] + " ");
			}
			System.out.print("\n");
		}
	}
}

//ÉÏÃæÕâÖÖ×ö·¨»¹ÊÇint[3][3]ÁË

//¶¯Ì¬¿ª±Ù¶þÎ¬Êý×é¿Õ¼ä
class ex14{
	public static void main(String[] args) {
		int len = 9;
		int a[][] = new int[len][];
		for (int i = 0; i < len ; i ++ ) {
			a[i] = new int[i+1];
			for (int j = 0; j < i + 1 ; j++ ) {
				a[i][j] = i + 1;
			}
		}
		for (int m = 0; m < a.length ; m++ ) {
			for (int n = 0; n < a[m].length ; n++ ) {
				System.out.print(a[m][n] + " ");
			}
			System.out.print("\n");
		}
	}
}


class ex15{
	public static void main(String[] args) {
		int len = 10;
		int a[][] = new int[len][];
		for (int i = 0; i < len ; i++ ) {
			a[i] = new int[i+1];
			for (int j = 0; j < i + 1 ; j++ ) {
				if (j == 0 || j == i) {
					a[i][j] = 1;
				}
				else{
					a[i][j] = a[i-1][j-1] + a[i-1][j]; 
				}

			}
		}
		// System.out.print(a.length);
		for (int m = 0; m < a.length ; m++ ) {
			for (int n = 0; n < a[m].length ; n++ ) {
				System.out.print(a[m][n] + " ");
			}
			System.out.print("\n");
		}
	}
}


class ex16{
	public static void main(String[] args) {
		String a[] = new String[]{"a", "b", "c"}; //ÕýÈ·
		// String b[] = new String{"a", "b", "c"}; ´íÎó
		// String b[] = new String[3]{"a", "b", "c"}; ´íÎó
	}
}

class ex17{
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 5};
		int b[] = new int[a.length + 1];
		int target = 6;
		int flag = -1;
		for (int i = 0, j = 0; i < b.length && j < a.length ; ) {
			
			if (target > a[j] && flag == -1) {
				b[i] = a[j];
				if (j == a.length - 1) {
					b[i+1] = target;
					break;
				}
				else{
					
					i++;
					j++;
				}
				
			}
			else if(target < a[j] && flag == -1){
				b[i] = target;
				i++;
				flag = 1;
			}
			else if (flag == 1) {
				b[i] = a[j];
				i++;
				j++;
			}
			// else if (flag == 1 && j < a.length) {
			// 	b[i] = a[j];
			// 	i++;
			// 	j++;
			// }
			// else if (flag == -1 && j == a.length - 1) {
			// 	b[i] = a[j];
			// }
			// // i++;
			// // j++;
		}
		for (int m = 0; m < b.length ; m++ ) {
			System.out.print(b[m] + " ");
		}
	}
}

// ÉÏÃæ¿ÉÒÔ¸ü¼ò»¯£¨
// ÆäÊµË¼Â·×Ô¼ºÒ»¿ªÊ¼Ïë¹ý£¬¾ÍÊÇÏÈÕÒµ½²åÈëµÄÎ»ÖÃ£¬È»ºó²åÈë£©

class ex20{
	public static void main(String[] args) {
		int a[] = {1,3,5,7};
		int b[] = new int[a.length + 1];
		int target = 9;
		int index = -1;
		// ²éÕÒ
		for (int i = 0; i < a.length ; i++ ) {
			if (target <= a[i]) {
				index = i;
				break;
			}
		}
		// 少写了下面这�
		if (index == -1) {
			index = b.length - 1;
		}
		// System.out.println(index);
		//²åÈë 
		
		for (int i = 0, j = 0; j < b.length; j++ ) {
			if (j != index) {
				b[j] = a[i];
				i++;
			}
			else {
				b[j] = target;
				// j++;
			}
			
		}
		
		for (int m = 0; m < b.length ; m++ ) {
			System.out.print(b[m] + " ");
		}

	}
}


class ex18{
	public static void main(String[] args) {
		int a[] = new int[10]; //ÍüÁËËæ»úÉú³ÉÕ¦Éú³ÉÁË
		int sum = 0;
		double avr = 0;
		int max = 0;
		int index = 0;
		int flag = 0;
		// Éú³ÉËæ»úÊý£¬±£´æµ½Êý×éa
		// ÕýÈ·Éú³ÉËæ»úÊý·½·¨
		// (int)(Math.random() * 100) + 1
		// for (int i = 0; i < 10 ; i++ ) {
		// 	Random random = new Random();
		// 	int b = random.nextInt();
		// 	a[i] = b;
		// }
		// 
		for (int i = 0; i < 10 ; i++ ) {
			int b = (int)(Math.random() * 100) + 1;
			a[i] = b;
		}

		// µ¹Ðò´òÓ¡
		for (int j = a.length-1; j >= 0 ; j-- ) {
			System.out.println(a[j]);
		}
		// ÇóºÍ¡¢ÇóÆ½¾ùÖµ¡¢Çó×î´óÖµ
		for (int k = 0; k < a.length ; k++ ) {
			sum += a[k];
			if (a[k] > max) {
				max = a[k];
				index = k;
			}
		}
		avr = sum/a.length;
		// ²éÕÒÊÇ·ñÓÐ8
		for (int m = 0; m < a.length ; m++ ) {
			if (a[m] == 8) {
				System.out.println("yes");
				flag = -1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("no");
		}
	}
}


class ex19{
	public static void main(String[] args) {
		int a[] = {1,5,2,3,-1};
		//4ÂÖ±éÀú
		for (int i = 0; i < a.length - 1 ; i++ ) {
			for (int j = 1; j < a.length - i ; j++ ) {
				if (a[j-1] < a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int m = 0; m < a.length ; m++ ) {
			System.out.println(a[m]);
		}
	}
}



