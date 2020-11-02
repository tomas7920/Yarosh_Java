/*Given an array of strings, reverse them and their order in such way that their length
stays the same as the length of the original inputs*/

import java.util.Scanner;

public class Fifth {

    static void reverses(String str) {

        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] != ' ') {

                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your String: ");
        String v = sc.nextLine();
        reverses(v);
    }
}