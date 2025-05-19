package zettai;

public class Main{ //P193 継承とオーバーライド
	public static void main(String[] args) {
	  Main mainInstance = new Main(); // Create an instance of Main
      Car car = mainInstance.new Car();
      System.out.println(car);
      MyCar myCar = mainInstance.new MyCar();
      System.out.println(myCar);
		

	}
	
    public class MyCar extends Car {
  	  public String toString() {
      	return "The color of the car is blue.";
  	  }
    }
    public class Car {
	  public String toString() {
    	return "The color of the car is red.";
      }
    }


}
