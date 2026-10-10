import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] consoleMatrix = new int [4][4];

        System.out.println("Enter matrix values: ");
        for (int i = 0; i <= consoleMatrix.length - 1; i++) {
            for (int j = 0; j <= consoleMatrix[0].length - 1; j++)
                consoleMatrix[i][j] = scanner.nextInt();
        }

        System.out.println("Enter value you search for: ");
        int value = scanner.nextInt();

        for (int i = 0; i <= consoleMatrix.length - 1; i++) {
            for (int j = 0; j <= consoleMatrix[0].length - 1; j++) {
                if (value == consoleMatrix[i][j]) {
                    System.out.println("Value is on " + (i + 1) + " row and " + (j + 1) + " column");
                    return;
                }
            }
        }


//        System.out.println("Enter your password: ");
//        String password = scanner.nextLine();
//        System.out.println(isValidPassword(password));

    }

    public static String isValidPassword(String password) {
//        System.out.println("Enter your password: ");
//        String password = scanner.nextLine();

        if (password.length() < 8) {
            System.out.println("Password must has at least 8 symbols!");
            return "Password is invalid!";
        }

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpace = false;
        boolean hasSpecial = false;

        for (int i = 0; i <= password.length() - 1; i++) {
            if (myIsDigit(password.charAt(i))) {
                hasDigit = true;
            }
            if (myIsUpper(password.charAt(i))) {
                hasUpper = true;
            }
            if (myIsLower(password.charAt(i))) {
                hasLower = true;
            }
            if (myIsSpace(password.charAt(i))) {
                hasSpace = true;
            }
            if (myIsSpecial(password.charAt(i))) {
                hasSpecial = true;
            }
        }
        if (!hasDigit) {
            System.out.println("Password must has at least one digit!");
            //return "Password is invalid!";
        }
        if (!hasUpper) {
            System.out.println("Password must has at least one upper letter!");
            //return "Password is invalid!";
        }
        if (!hasLower) {
            System.out.println("Password must has at least one lower letter!");
            //return "Password is invalid!";
        }
        if (hasSpace) {
            System.out.println("Password cannot have space!");
            //return "Password is invalid!";
        }
        if (!hasSpecial) {
            System.out.println("Password must has at least one special symbol!");
            //return "Password is invalid!";
        }
        if (hasDigit && hasLower && !hasSpace && hasSpecial && hasUpper) {
            return "Your password is valid!";
        }
        return "Password is invalid!";
    }

    public static boolean myIsDigit (char symbol) {
        return (symbol == '0') || (symbol == '1') || (symbol == '2') || (symbol == '3') || (symbol == '4') ||
                (symbol == '5') || (symbol == '6') ||(symbol == '7') ||(symbol == '8') || (symbol == '9');
    }

    public static boolean myIsSpace (char symbol){
        return (symbol == ' ');
    }

    public static boolean myIsUpper (char symbol){
        return (symbol >= 'A' && symbol <= 'Z');
    }

    public static boolean myIsLower(char symbol){
        return (symbol >= 'a' && symbol <= 'z');
    }

    public static boolean myIsLetter (char symbol){
        return (myIsLower(symbol) || myIsUpper(symbol));
    }

    public static boolean myIsSpecial (char symbol){
        return (!(myIsDigit(symbol) || myIsLetter(symbol) || myIsSpace(symbol)));
    }
}