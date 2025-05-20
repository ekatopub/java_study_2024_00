package zettai;

public class P228Calc{  //P228 debug test
	// If the sum went beyond 10, show 10 as result. If not, show simple sum as result 
	
	public int addMAX10(int a, int b) {
		int ret = add(a, b);
		
		if (ret >10) {
			return 10;			
		} else {
			return ret;
		}
	}
	private Integer add(Integer a, Integer b) {
		return a + b;
	}

 }

