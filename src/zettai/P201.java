package zettai;

public class P201{ //P201 ラッパークラス 指定型にキャストする明示的な型変換の書き方 書籍にはない
	public static void main(String[] args) {
		//P201 Q1
        double number = 9.7;
        int result = (int)number;
        System.out.println(result);
      
		//P202 Q2
        int a = 5;
        int b = 3;
        double c = (double)a / b;
        System.out.println(c);

		//P202 Q3 文字列型から整数型へ
        String strNum1 = "123";
        int num1 = Integer.parseInt(strNum1);
        System.out.println(num1);

        
		//P202 Q4 浮動小数点型から文字列型へ
        double pi = 3.14;
        String StrPi = String.valueOf(pi);
        System.out.println(StrPi);

        //P203 Q5 文字列型から浮動小数点型へ
        String strDouble1 = "123.45";
        double num2 = Double.parseDouble(strDouble1);
        System.out.println(num2);

        
        //P203 チャレンジ　String型変数からdouble型に変換
        String strDouble2 = "123.45";
        double num3 = Double.parseDouble(strDouble2);
        num3 = num3 * 2;
        int num4 = (int)num3;
        String strResult = String.valueOf(num4);
        System.out.println("Result:[結果] " + strResult);

	}
	
  


}
