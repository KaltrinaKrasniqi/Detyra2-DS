import java.util.Scanner;

public class ScytaleCipher {

    // Encrypts the plainText using scytale transposition cipher
    public static String encrypt(String plainText, int diameter) {
        int rows = (int) Math.ceil((double) plainText.length() / diameter);

        // Create a 2D matrix (cipherMatrix) to hold the characters in cylindrical way
        char[][] cipherMatrix = new char[rows][diameter];
        int index = 0;

        // Place the plainText into the cipherMatrix with rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < diameter; j++) {
                if (index < plainText.length()) {
                    cipherMatrix[i][j] = plainText.charAt(index);
                    index++;
                } else {
                    cipherMatrix[i][j] = ' '; // Add space if character is missing
                }
            }
        }

        // Read the cipherText from the columns of the cipherMatrix
        StringBuilder cipherText = new StringBuilder();
        for (int j = 0; j < diameter; j++) {
            for (int i = 0; i < rows; i++) {
                cipherText.append(cipherMatrix[i][j]);
            }
        }

        return cipherText.toString();
    }

    // Decrypts the cipherText back to plainText using scytale transposition cipher
    public static String decrypt(String cipherText, int diameter) {
        int length = cipherText.length();
        int rows = length / diameter;

        // Create a 2D matrix (cipherMatrix) to hold the characters
        char[][] cipherMatrix = new char[rows][diameter];
        int index = 0;

        // Fill the cipherMatrix with characters from the cipherText
        for (int j = 0; j < diameter; j++) {
            for (int i = 0; i < rows; i++) {
                cipherMatrix[i][j] = cipherText.charAt(index);
                index++;
            }
        }

        // Read the plainText from the cipherMatrix row by row
        StringBuilder plainText = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < diameter; j++) {
                plainText.append(cipherMatrix[i][j]);
            }
        }

        return plainText.toString().trim();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for plainText and diameter (number of columns)
        System.out.print("Enter plainText: ");
        String plainText = scanner.nextLine();
        System.out.print("Enter diameter: ");
        int diameter = scanner.nextInt();

        // Encrypt the plainText using the specified diameter
        String cipherText = encrypt(plainText, diameter);
        System.out.println("Encrypted text: " + cipherText);

        // Decrypt the cipherText back to plainText using the same diameter
        String decryptedText = decrypt(cipherText, diameter);
        System.out.println("Decrypted plainText: " + decryptedText);

        scanner.close();
    }
}
