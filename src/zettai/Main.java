package zettai;

public class Main{ //P261 Test with JUnit
	private static MyLogic myLogic = new MyLogic();
	
	public static void main(String[] args) {
		System.out.println("計算1回目");
		System.out.println(addMax10(1, 2));	
	}
	private static int addMax10(int a, int b) {
		return myLogic.addMax10(a, b);
	}
 


}
