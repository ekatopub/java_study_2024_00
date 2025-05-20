package zettai;

public class P227Main{ //P227 challenge　呼び出し元での例外処理
	public static void main(String[] args) {

		try {
			P227Sub.sub();
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NULL.")	;

		}
	System.out.println("end.")	;
		
	}
}
