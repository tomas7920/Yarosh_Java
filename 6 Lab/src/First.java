import java.util.Scanner;
/*Given a sentence. Find the longest word in that sentence and return its length*/
public class First {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");


        int largestLength = 0;
        String largestWord = "";
        String userinput = sc.nextLine();
        while (userinput.equals("")) {
            System.out.println("Please insert a String: ");
            userinput = sc.nextLine();
        }

        for (String b : userinput.split(" ")) {
            if (largestWord.length() == 0) {
                largestLength = b.length();
                largestWord = b;
            } else if (b.length() >= largestLength) {
                largestLength = b.length();
                largestWord = b;
            }
        }
        sc.close();
        System.out.println("Longest Word: " + largestWord);
        System.out.println("Longest Word: " + largestLength);
    }

    public boolean isAlpha(String userinput) {
        char[] chars = userinput.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}