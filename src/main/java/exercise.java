import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something.");
        String userInput = scanner.next();

        System.out.println(StringUtils.isNumeric(userInput));

        System.out.println(StringUtils.swapCase(userInput));

        System.out.println(StringUtils.reverse(userInput));
    }
}
