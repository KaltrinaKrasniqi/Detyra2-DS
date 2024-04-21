# Detyra2-DS


This project was made for assignment in Data Security class 2024

## How to execute the program

1. ScytaleCipher
   * Run the program on IntelliJ or any other compiler for java
   * Enter the plaintext
   * Enter the diamter of the stick
   * Then you'll see the encrypted&decrypted text

2. Pigpen
   * Run the program on IntelliJ or any other compiler for java
   * Enter the plaintext
   * 
   * Then you'll see the encrypted&decrypted text

   





## Description of the algorithms

1. ScytaleCipher(Encryption)

The encrypt method method implements a basic form of Scytale encryption in java, a method historically used for transposition cipher. This encryption technique involves rearranging characters of a plaintext message by arranging them in a matrix and then reading them out in a specific order.
Detailed description:

* First we give as a parameter the plaintext message to be encrypted.
* We also need the diameter or width of the cylindrical matrix used for encryption as a parameter.
* Calculate the number of rows needed in the matrix based on the length of the plaintext and the specified diameter.
* Create a 2D cipherMatrix with rows and diameter(columns), populate the matrix by placing characters from the plainText into the matrix row by row.
* If the plaintext does not perfectly fill the matrix, pad the remaining spaces with a placeholder character (e.g., space).
* Construct the ciphertext by reading characters from the cipherMatrix column by column.
* Append characters from each column of the matrix to form the encrypted message.
* Return the final cipherText as a string representing the encrypted message.

ScytaleCipher(Decryption)

The decrypt method is designed to reverse the process of Scytale encryption by rearranging characters from a given ciphertext that was encrypted using the same specific diameter (width) of a cylindrical matrix.
Detailed description:

* First we give as a parameter the ciphertext to be decrypted.
* Also give the diameter used during encryption to form the cylindrical matrix.
* Calculate the number of rows based on the length of the cipherText and the specified diameter.
* Create a 2D cipherMatrix with rows and diameter columns and fill the cipherMatrix by placing characters from the cipherText column by column.
* Construct the plaintext by reading characters from the cipherMatrix row by row.
* Append characters from each row of the matrix to reconstruct the original plaintext.
* Return the final plainText as a string representing the decrypted message.

## Examples from execution

### Encryption&Decryption

![scy](https://github.com/KaltrinaKrasniqi/Detyra2-DS/assets/116883212/577dec28-2688-4b0d-baff-8f96f79e5e66)


2.PigPen(Encryption)

Pigpen encryption, also known as the Freemason's cipher or the Tic-tac-toe cipher, is a simple substitution cipher used for encrypting messages. It was popular among Freemasons during the 18th and 19th centuries, but it's also commonly used for educational purposes and in puzzle solving today.









   

