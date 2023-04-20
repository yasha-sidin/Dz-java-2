import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String text = iScanner.nextLine();
        StringCompression(text);
    }

    private static void StringCompression(String text) {
        int count = 1;
        String result = "";
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                count++;
            } else if (text.charAt(i) != text.charAt(i + 1) && count == 1){
                result += Character.toString(text.charAt(i));
                count = 1;
            }
            else {
                result += Character.toString(text.charAt(i)) + count;
                count = 1;
            }
        }
        if (text.charAt(text.length() - 2) != text.charAt(text.length() - 1) && count == 1){
            result += Character.toString(text.charAt(text.length() - 1));
        } else {
            result += Character.toString(text.charAt(text.length() - 1)) + count;
        }
        System.out.println(result);
    }
}
