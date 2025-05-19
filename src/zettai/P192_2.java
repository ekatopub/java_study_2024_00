package zettai;

public class P192_2{ //P192＿2  private fields with public getter and setter method
	public static void main(String[] args) {

        SportsTeamPlayers yamada = new SportsTeamPlayers();
        yamada.setMemberName("yamada");
        yamada.selfintroduction1();
        SportsTeamPlayers satou = new SportsTeamPlayers();
        satou.setMemberName("satou");
        satou.selfintroduction();
        
        SportsTeamPlayers.TeamName = "Giants";
        yamada.selfintroduction1();
        satou.selfintroduction();        

/*
        Person satou = mainInstance.new Person("satou",30);
        satou.selfintroduction();
        Person imamiya = mainInstance.new Person("imamiya",65);
        imamiya.selfintroduction();
*/
	}
	

	public static class SportsTeamPlayers {//a non-static inner class has an implicit reference to an instance of its enclosing outer class (Main in this case)
		//f SportsTeamPlayers doesn't need to access any non-static members of the Main class, this is the cleaner solution:
		public static String TeamName = "Tigers";//The static keyword means that the TeamName field belongs to the SportsTeamPlayers class itself, not to any specific instance of SportsTeamPlayers.
		//TeamName cannot be declared static in a non-static inner type, unless initialized with a constant expression====final
		private String memberName;

		public void setMemberName(String name) {
			this.memberName = name;
		}
		public String getMemberName() {
			return this.memberName;
		}
	   	public void selfintroduction1() {
				System.out.println(memberName + " belongs to the " + TeamName +".");
			}
		public void selfintroduction() {
				selfintroduction1();
			}
       

	
	}


}
