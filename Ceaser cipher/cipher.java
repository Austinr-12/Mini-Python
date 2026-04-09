import java.util.Scanner;


// method that will do the encrypting
public String encrypt(String text, int shift) {
    StringBuilder result = new StringBuilder();

    // for-each loop
    for (char character : text.toCharArray()) {
        if (Character.isLetter(character)) {
        char shifted = (char) ((character - base + shift) % 26 + base);
            result.append(shifted);
        } else {
            result.append(character);
        }
    }

}

