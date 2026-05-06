package chapter12.exception_;

import java.util.Scanner;

/**
 * @author hoengjing
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true){
            try {
                System.out.println("请输入一个正数");
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
            }
        }

    }
}
