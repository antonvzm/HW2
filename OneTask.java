import java.util.Scanner;
public class OneTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word: ");
        String str = sc.nextLine();
        System.out.println(isPalindrom(str));
        sc.close();
    }
    public static boolean isPalindrom(String text) {
        return text.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", "")).reverse().toString());
    }
}