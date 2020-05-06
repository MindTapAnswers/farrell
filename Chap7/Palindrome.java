import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner pls_end_me = new Scanner(System.in);
        System.out.println("Enter a word or phrase: ");
        String og = pls_end_me.nextLine();
        og = og.replaceAll(" ","");
        System.out.println(og);
        String rev = "";
        for (int i = og.length() - 1; i >= 0; i--)
            rev = rev + og.charAt(i);

            System.out.println(rev);
            rev.replaceAll(" ","");

        if (rev.equalsIgnoreCase(og))
            System.out.println("You entered a palindrome");
            else
            System.out.println("You did not enter a palindrome");
    }
}
