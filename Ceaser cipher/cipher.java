import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.outprint("Enter text to encrypt: ");
    String inputText = scanner.nextLine();

    
}

// method that will do the encrypting
public static String encrypt(String text, int shift) {
    StringBuilder result = new StringBuilder();

    for (char character : text.toCharArray()) {
        if (Character.isLetter(character)) {
            char base = Character.isLowerCase(character) ? 'a' : 'A';
            char shifted = (char) ((character - base + shift) % 26 + base);
            result.append(shifted);
        } else {
            result.append(character);
        }
    }

    return result.toString();
}

