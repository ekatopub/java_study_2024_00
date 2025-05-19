package zettai;

public class P112 {

	
	    public static void main(String[] args) {
	        int[][] numbersOrg = {
	                {1, 2, 3},
	                {4, 5, 6},
	        };
	// get array numbers and length, while preparing switch
	        int rowLengthAlt = numbersOrg.length;//1次元目　Org行の数=2
	        int rowNumbersAlt = numbersOrg[1].length;//2次元目　Orgカラムの数=3


	      System.out.println("rowLengthAlt:"+ rowLengthAlt);//debug
	      System.out.println("rowNumbersAlt"+ rowNumbersAlt);//debug
	        
	// entering elemnts into new array
	        int[][] numbersAlt = new int[rowNumbersAlt][rowLengthAlt]; // ★ 宣言と初期化を同時に行う
	        for (int i = 0; i < rowNumbersAlt; i++) {
	            for (int j = 0; j < rowLengthAlt; j++) {

	            	System.out.println("i:"+ i + " j:"+ j );    	//debug

	            	System.out.println("numbersOrg[j][i]:"+ numbersOrg[j][i] ); //debug
	            	numbersAlt[i][j] = numbersOrg[j][i];

	            	System.out.println("numbersAlt[i][j]:"+ numbersAlt[i][j] ); //debug
	            }
	        }


	        for (int[] number : numbersAlt ) {
	        	System.out.println(java.util.Arrays.toString(number)); 
	        	
	        	/*
	        	 * 
	        	 * 配列の内容を正しく表示するためには、java.util.Arrays クラスのメソッドを使用する必要があります。特に、1次元配列の場合は Arrays.toString() メソッド、多次元配列の場合は Arrays.deepToString() メソッドを使います。

	ご提示のコードでは numbersAlt は2次元配列なので、各行の1次元配列を表示するために Arrays.toString() を使用します。

	        	 * 
	        	 * なぜ println(number) が期待通りに表示されないのか？

	Javaにおいて、オブジェクト（配列もオブジェクトの一種です）を System.out.println() に渡すと、デフォルトではそのオブジェクトの toString() メソッドが呼び出されます。配列クラス (int[], int[][] など) は toString() メソッドをオーバーライドしていないため、Objectクラスのデフォルトの toString() メソッドが呼ばれます。

	Objectクラスのデフォルトの toString() メソッドは、通常「クラス名@16進数ハッシュコード」のような形式の文字列を返します。
	        	 * 
	        	 * 
	        	 */
	        	
	        	
	        }
	    }
	
	
	
	}

