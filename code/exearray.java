public class exearray{
	public static void main(String[] args) {
		int a[] = {1,3,5,7};
		int b[] = new int[a.length + 1];
		int target = 9;
		int index = -1;
		// 
		for (int i = 0; i < a.length ; i++ ) {
			if (target <= a[i]) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			index = b.length - 1;
		}
		System.out.println(index);
		//
		
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