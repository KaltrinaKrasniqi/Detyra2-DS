import java.util.Scanner;

public class ConsoleExecute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for plainText and diameter (number of columns)
        System.out.print("Enter plainText: ");
        String plainText = scanner.nextLine();
        System.out.print("Enter diameter: ");
        int diameter = scanner.nextInt();

        // Encrypt the plainText using the specified diameter
        String cipherText = ScytaleCipher.encrypt(plainText, diameter);
        System.out.println("Encrypted text: " + cipherText);

        // Decrypt the cipherText back to plainText using the same diameter
        String decryptedText = ScytaleCipher.decrypt(cipherText, diameter);
        System.out.println("Decrypted plainText: " + decryptedText);

        scanner.close();
    }
}
