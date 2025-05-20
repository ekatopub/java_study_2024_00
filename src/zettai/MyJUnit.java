package zettai;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyJUnit {
	
	//テスト回数のカウント
	static int testCount;
	
	//テスト対象のインスタンス変数
	static MyLogic myLogic;
	//インスタンスの生成
	@BeforeAll
	static void beforeAll() {
		 myLogic = new MyLogic();	
	}
	
	
	//各テスト前に表示するコンソール
	@BeforeEach
	void beforeEach() {
		testCount++;
		System.out.println("テスト開始："+ testCount +"回目");
	}
	//各テスト後に表示するコンソール
	@AfterEach
	void afterEach() {
		System.out.println("テスト終了");
	}
	//インスタンスの破棄
	@AfterAll
	static void afterAll() {
	}
	
	    // addMax10が10以上
		@Test
		void test1_1() {
			//MyLogic myLogic = new MyLogic();
			assertEquals(10, myLogic.addMax10(1, 10));
		}
	
	
		// addMax10が10未満
		@Test
		void test1_2() {
			//MyLogic myLogic = new MyLogic();
			assertEquals(3, myLogic.addMax10(1, 2));
		}
		// addMax10が10以上
		@Test
		void test1_3() {
			//MyLogic myLogic = new MyLogic();
			assertEquals(10, myLogic.addMax10(1, 10));
		}

		
		
		// addMax10が10以上
		@Test
		void test2_1() {

		  assertTrue(myLogic.judgeOver10(1, 10));
		}
			
			
		// addMax10が10未満
		@Test
		void test2_2() {

		  assertFalse(myLogic.judgeOver10(1, 2));
		}
		
		// nullあり
		@Test
		void test3_1() {

		  assertNull(myLogic.addExceptNull(null, 10));
		}
			
			
		// null無し
		@Test
		void test3_2() {

		  assertNotNull(myLogic.addExceptNull(1, 2));
		}
		// 生成済みのインスタンスをそのまま返す
		@Test
		void test4_1() {
			ArrayList<Object> arrayList = new ArrayList<>();
			assertSame(arrayList,myLogic.generateArrayList(arrayList));
		}
			
			
		// nullとなるはず
		@Test
		void test4_2() {
			ArrayList<Object> arrayList = new ArrayList<>();
			assertNotSame(arrayList,myLogic.generateArrayList(null));
		}
		// 生成済みのインスタンスをそのまま返す　結果は引数のインスタンス
		@Test
		void test5_1() {
			ArrayList<Object> actualList = new ArrayList<>();
			actualList.add("Str1");
			actualList.add("Str2");
			actualList.add("Str3");
			ArrayList<Object> expectList = new ArrayList<>();
			expectList.add("Str1");
			expectList.add("Str2");
			expectList.add("Str3");
			assertIterableEquals(expectList,myLogic.generateArrayList(actualList));

		}
		
	    //privateメソッドにアクセス
		@Test
		void test6_1() {
			try {
				Class<MyLogic2> myClass2 = MyLogic2.class;
				//Objectクラスを利用してテスト対象クラスのインスタンスを生成することでテスト対象クラス内を参照可能にする
				Object object = myClass2.getDeclaredConstructor().newInstance();
				//Methodクラスでprivateメソッドの情報を取得する
				Method method = MyLogic2.class.getDeclaredMethod("add", Integer.class, Integer.class);
				//setAccessibleでprivateメソッドにアクセス可能にする
				method.setAccessible(true);
				//テスト対象privateメソッドの引数として送るデータ
				int a = 1;
				int b = 2;
				//invokeメソッドで入力データとテスト対象クラスのインスタンスを投入
				int actual = (Integer)method.invoke(object, a, b);
				//テスト結果判定
				
			assertEquals(3, actual);
			} catch (Exception e) {
				System.out.println(e);
			}
		}


		
//		fail("まだ実装されていません");addExceptNull


}
