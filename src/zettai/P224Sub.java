package zettai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class P224Sub{ //P224 Q3　呼び出し元での例外処理
		
		  public static void sub() throws FileNotFoundException {
			  try (FileInputStream fs = new FileInputStream(".project")) {
			  }	  catch (IOException e) {
					  e.printStackTrace();
				  }
		  }
 }

