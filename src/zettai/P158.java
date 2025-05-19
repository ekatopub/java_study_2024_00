package zettai;

public class P158 {

	public static void main(String[] args) {
		selfintroduction("yamada");
		selfintroduction(20);
		
	}		
		public static void selfintroduction(String name) {
			System.out.print("I'm " + name + ".");
		}
		public static void selfintroduction(int age) {
			System.out.print("I'm " + age + " years old.");
		}
		


}
