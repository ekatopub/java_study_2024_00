package zettai;

public class P228Main{ //P228 debug test

	private static P228Calc p228calc = new P228Calc();

	public static void main(String[] args) {
		System.out.println("Calc starts.");
		int x = addMax10(1, 3);
		int y = addMax10(11, 2);
		int z = addMax10(x, y);
		System.out.println("Result is " + z);	
		
	}
	
	private static int addMax10(int a,int b) {
		return p228calc.addMAX10(a, b);
	}



}
