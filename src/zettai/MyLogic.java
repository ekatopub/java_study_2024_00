package zettai;

import java.util.ArrayList;

public class MyLogic{ //P261 Test with JUnit	
	
	public int addMax10(int a, int b) {
		int ret = a + b;
		if(ret > 10) {
			return 10;
		} else {
		return ret;	
		} 
	}
	public boolean judgeOver10(int a, int b) {
		int ret = a + b;
		if(ret > 10) {
			return true;
		} else {
		return false;	
		} 
	}
	public Integer addExceptNull(Integer a, Integer b) {
		if( a == null || b == null) {
			return null;
		} else {
			return a + b;
		}
	}
	//ArrayListのインスタンス変数で判断
	public ArrayList<Object> generateArrayList(ArrayList<Object> arrayList) {
		if( arrayList == null) {
			return new ArrayList<>();
		} else {
			return arrayList;
		}
	}

}
