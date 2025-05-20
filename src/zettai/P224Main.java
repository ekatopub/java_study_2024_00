package zettai;

import java.io.FileNotFoundException;

public class P224Main{ //P224 Q3　呼び出し元での例外処理
	public static void main(String[] args) {

		try {
			P224Sub.sub();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	System.out.println(".project File is OK if no errors shown over here.")	;
		
	}
}
