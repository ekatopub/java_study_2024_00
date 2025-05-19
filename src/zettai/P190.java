package zettai;

public class P190{ //P190 非staticで他のクラスのメンバーを活用する しかし非statiの内部クラスは、enclosing instance(外部インスタンス)に紐付いている。

	public static void main(String[] args) {
        P190 mainInstance = new P190(); // Create an instance of Main
        Person yamada = mainInstance.new Person("yamada",20);
        yamada.selfintroduction();
        Person satou = mainInstance.new Person("satou",30);
        satou.selfintroduction();
        Person imamiya = mainInstance.new Person("imamiya",65);
        imamiya.selfintroduction();

	}
	

	public class Person {
    	private final String NAME;
    	private int age;    	
     	private int olderAge; 
    	
		public Person(String name, int age) {
			NAME = name;
			this.age = age;
		}
    	    	
    	
    	public void selfintroduction1() {
			System.out.println("I'm " + NAME + ".");
		}
		public void selfintroduction2() {
			System.out.println("I'm " + age + " years old.");
		}
	   	public void growOld() {
	   		olderAge = age + 1;
	   	}
		public void selfintroduction3() {
				System.out.println("I'm going to be " + olderAge + " years old next year.");
			}
		public void selfintroduction() {
			selfintroduction1();
			selfintroduction2();
			growOld();
			selfintroduction3();
		}
	

	}


}
