package zettai;

public class P190_2{ //P190_2 アクセス修飾子　public/private

   public static void main(String[] args) {
       P190_2 mainInstance = new P190_2(); // Create an instance of Main
	   PasswordManager pm = mainInstance.new PasswordManager();

      //4桁で設定する
     pm.setPassword("abcd");
     if (pm.passwordCheck("abcd")) {
    	 System.out.println("check ok.");
     } else {
    	 System.out.println("check ng.");    	 
     }
     //4桁で設定する
    pm.setPassword("abcd");
    if (pm.passwordCheck("bcde")) {
   	 System.out.println("check ok.");
    } else {
   	 System.out.println("check ng.");    	 
    }

     //3桁で設定する
    pm.setPassword("abc");
    if (pm.passwordCheck("abc")) {
   	 System.out.println("check ok.");
    } else {
   	 System.out.println("check ng.");    	 
    }
    //3桁で設定する
    pm.setPassword("abc");
    if (pm.passwordCheck("bcd")) {
   	 System.out.println("check ok.");
    } else {
   	 System.out.println("check ng.");    	 
    } 
   
    //4桁で設定する
   pm.setPassword("abcd");
   if (pm.passwordCheck("abcd")) {
  	 System.out.println("check ok.");
   } else {
  	 System.out.println("check ng.");    	 
   }
  
   
   
   
   }
	

	 public class PasswordManager {
		/**　
		 * 　設定されたパスワード
		 * 　初期値はnull
		 * 　4桁で設定されない場合はnull
		 */
		public String password = null;
		/**　
		 * 　パスワード設定メソッド
		 * 　4桁で設定されない場合はnullを設定する
		 * 　@param password
		 */
		public void setPassword(String password) {
			if (password.length() == 4) {
				this.password = password;
			} else {
				this.password = null;				
			}
		}
		/**　
		 * 　パスワードチェックメソッド
		 * 　@param password
		 * 　@return　設定と一致すればtrue
		 * 　nulの時はfalse
		 */
		public boolean passwordCheck(String password) {
			if (this.password == null) {
				return false;
			}
			return this.password.equals(password);
		}

	}


}
