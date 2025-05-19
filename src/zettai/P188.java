package zettai;

public class P188 {  //全部staticで完結しながら他のクラスメンバーを利用する

	public static void main(String[] args) {
        Person.name = "yamada";
        Person.age = 20;
        Person.selfintroduction(Person.name);
        Person.selfintroduction(Person.age);
        Person.name = "satou";
        Person.age = 30;
        Person.selfintroduction(Person.name);
        Person.selfintroduction(Person.age);
        Person.name = "imamiya";
        Person.age = 65;
        Person.selfintroduction(Person.name);
        Person.selfintroduction(Person.age);

	}
	public static class Person {
    	public static String name;
    	public static int age =0;    	

		public static void selfintroduction(String name) {
			System.out.println("I'm " + name + ".");
		}
		public static void selfintroduction(int age) {
			System.out.println("I'm " + age + " years old.");
		}

	}


}
