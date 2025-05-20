package zettai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class P222{ //P222 例外
	public static void main(String[] args) {
		//P222 Q1　実行時例外
		String str = null;
		try {
		System.out.println(str.length());
		} catch (java.lang.NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("実行時例外 end.");		

		//P223 Q2　try-with-finally /try-with-resource
		FileInputStream fs1 = null;
		try {
		fs1 = new FileInputStream(".project");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("try-with-resource end.");		
		
		//P223 Q2　try-with-finally /try-with-resource
		FileInputStream fs2 = null;
		try {
		fs2 = new FileInputStream(".project");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fs2 != null) {
				try {
					fs2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		System.out.println("try-with-finally end.");		
		
		
		
		
		

		
		
 

	}
}
