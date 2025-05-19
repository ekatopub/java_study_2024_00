package zettai;

public class P147 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


	int result=0;
	int[] array1 = new int[10];
	int[] array2 = new int[5];	
	int temp1=1;	
	int temp2=1;

	
	//input numbers into each array.
	for (int i=0; i<10; i++) {
		array1[i] = i + 1;
		System.out.println("array1[" + i + "] is " + array1[i]);
	}
	int j=5;
	while ( j>=1) {
		array2[j-1] = j;
		System.out.println("array2[" + (j - 1) + "] is " + array2[j - 1]);
		j--;
	}

	// Using the standard for loop to multiply elements of array1
	for (int i=0; i<10; i++) {
		temp1 = temp1 * array1[i];
	}
	System.out.println("array1 subtotal is " + temp1);
	
	// Using the extended for loop to multiply elements of array2
	for (int num : array2) {
		System.out.println("num is " +num);
		temp2 = temp2 * num;		
	}
	System.out.println("array2 subtotal is " + temp2);

	// Here we go total
	result = temp1 + temp2;
	System.out.println("subtotal is " + result);
	}

}
