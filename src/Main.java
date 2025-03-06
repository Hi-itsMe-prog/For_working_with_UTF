import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the symbol: ");
        Scanner in = new Scanner(System.in);
        String S = in.next();

        char s = S.charAt(0);
        int utf = (int) s;

        String binary1 = Integer.toBinaryString(utf);

        StringBuilder resstr = new StringBuilder(binary1.length());
        Random random = new Random();
        StringBuilder binary2 = new StringBuilder(binary1.length());


        for (int i = 0; i < binary1.length(); i++) {
            int bit = random.nextInt(2);
            binary2.append(bit);
        }


        for (int i = 0; i < binary1.length(); i++) {
            char char1 = binary1.charAt(i);
            char char2 = binary2.charAt(i);
            if (char1 == char2) {
                resstr.append('0');
            } else {
                resstr.append('1');
            }
        }


        String resultString = resstr.toString();

        int decimal = Integer.parseInt(resultString, 2);

        char[] rez = Character.toChars(decimal);
        System.out.println(rez);
    }
}