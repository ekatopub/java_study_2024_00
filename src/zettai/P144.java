package zettai;

import java.util.Scanner;

public class P144 {

    public static void main(String[] args) {
        System.out.println("プログラム開始");
        System.out.println("点数を入力してください。終わるにはEnterキーのみを入力するか、マイナスの数字を入力してください");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            //if (input.length() == 0) { // Check if the input string has a length of 0
            	   
            
            if (input.isEmpty()) { // Check if the input line is empty (just Enter)
                System.out.println("Enterキーが入力されたため、プログラムを終了します。");
                break;
            }

            try {
                int score = Integer.parseInt(input); // Try to convert the input to an integer

                if (score < 0) {
                    System.out.println("負の数が入力されたため、プログラムを終了します。");
                    break;
                } else if (score == 0) {
                    System.out.println("努力が必要です。F");
                } else if (score == 100) {
                    System.out.println("完璧。A+");
                } else if (score >= 90) {
                    System.out.println("A");
                } else if (score >= 80) {
                    System.out.println("B");
                } else if (score >= 70) {
                    System.out.println("C");
                } else if (score >= 60) {
                    System.out.println("D");
                } else {
                    System.out.println("E"); // 残りは60未満で0以外
                }
            } catch (NumberFormatException e) {
                System.out.println("無効な入力です。整数を入力してください。");
            }
        }
        scanner.close();
        System.out.println("プログラム終了");
    }
}