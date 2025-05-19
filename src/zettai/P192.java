package zettai;

public class P192{ //P192  private fields with public getter and setter method
	public static void main(String[] args) {
        P192 mainInstance = new P192(); // Create an instance of Main
        Person yamada = mainInstance.new Person();
        yamada.setName("yamada");
        System.out.println("I'm " + yamada.getName() + ".");

/*
        Person satou = mainInstance.new Person("satou",30);
        satou.selfintroduction();
        Person imamiya = mainInstance.new Person("imamiya",65);
        imamiya.selfintroduction();
*/
	}
	

	public class Person {
    	private String name; //declared the name variable with the private access modifier 
    	
    	/*
		public Person(String name, int age) {  //Constructor which initialize name.
			this.name = name;
			this.age = age;
		}*/
    	// default no-argument constructor will initialize name as null.    	
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
       
		
		
    	public void selfintroduction1() {
			System.out.println("I'm " + name + ".");
		}
		public void selfintroduction() {
			selfintroduction1();
		}
	

	}


}
