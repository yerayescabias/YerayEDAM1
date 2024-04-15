package string;
import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        String str;
        int strlenth;
        char lastChar;
        int number = 0;
        int vocals = 0;
        float numberpercent = 0;
        float vocalspercent = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String:");
        str = in.next();
        strlenth = str.length();

        in.close();
        for (int charIdx = strlenth - 1; charIdx >= 0; --charIdx) {
            lastChar = str.charAt(charIdx);
            if (lastChar >= '0' && lastChar <= '9') {
                ++number;
            } else if (lastChar == 'A' | lastChar == 'E' | lastChar == 'I' | lastChar == 'O' | lastChar == 'U'
                    | lastChar == 'a' | lastChar == 'e' | lastChar == 'i' | lastChar == 'o' | lastChar == 'u') {
                ++vocals;
            }

        }
        numberpercent = (number * 100) / strlenth;
        vocalspercent = (vocals * 100) / strlenth;
        System.out.printf("Number of vowels:" + vocals);
        System.out.printf("%.2f",vocalspercent);
        System.out.println();
        System.out.printf("Number of number:" + number);
        System.out.printf("%.2f",numberpercent);
    }
}
