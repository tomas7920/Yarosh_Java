/*Implement method. Method returns true if none of the letters in the blacklist are present in the phrase.
If at least one letter from blacklist is present in the phrase return false.
Comparison should be case insensetive. meaning 'A' == 'a'*/

import java.util.Scanner;

public class Sixth {

    public static void findSymbols() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a chars and separate with , - symbol: ");
        String blackList = sc.nextLine();
        while (blackList.equals("")) {
            System.out.println("Please insert a chars: ");
            blackList = sc.nextLine();
        }
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        while (sentence.equals("")) {
            System.out.println("Please insert a chars: ");
            sentence = sc.nextLine();
        }
        String[] chars = blackList.split(",");
        boolean a = false;
        for(int i =0;i<chars.length;i++) {
            if ((sentence.contains(chars[i].toLowerCase())) || (sentence.contains(chars[i].toUpperCase()))) {
                a = false;
                break;
            }else {
                a = true;
            }
        }
        System.out.println(a);
        sc.close();
    }
    public static void main(String argc[]) {
        findSymbols();
    }
}