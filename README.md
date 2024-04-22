# Detyra2-DS


This project was made for assignment in Data Security class 2024

## How to execute the program

1. ScytaleCipher
   * Run the program on IntelliJ or any other compiler for java&javafx
   * Enter the plaintext
   * Enter the diamter of the stick
   * Then you'll see the encrypted&decrypted text

2. Pigpen
   * Run the program on IntelliJ or any other compiler for java&javafx
   * Enter the plaintext
   * Enter one of these symbols "#, #., X, X."
   * Then you'll see the encrypted&decrypted text

   





## Description of the algorithm

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

### With interface

![Webp net-resizeimage (3)](https://github.com/KaltrinaKrasniqi/Detyra2-DS/assets/116883212/8e63d471-cf78-4a49-a15d-e2bf557b1e35)



## Description of the algorithm

2.PigPen(Encryption)

Pigpen encryption, also known as the Freemason's cipher or the Tic-tac-toe cipher, is a simple substitution cipher used for encrypting messages. It was popular among Freemasons during the 18th and 19th centuries, but it's also commonly used for educational purposes and in puzzle solving today.


* Encrypts a plaintext using the Pigpen cipher , taking a plaintext and Optional key used to configure the Pigpen cipher symbols.
* Key Configuration: The method configures the cipher symbols based on the provided key using a predefined PigPen.keyConfig() method.If no key is provided, it uses default symbols.
* Symbol Mapping: Maps each character of the plaintext to its corresponding Pigpen symbol based on the configured symbols that are a path in Symbol Images.
     *Lowercase letters are mapped to symbols using the ASCII value difference from 'a'.
     * Uppercase letters are mapped similarly using the ASCII value difference from 'A'.
     * Non-letter characters are replaced with a placeholder symbol (e.g., space).
* Returns an array of strings (imagesPath) representing the paths to images of the encrypted symbols.The length of imagesPath is equal to the length of the plaintext.

PigPen(keyConfig)

* Method Purpose: Configures Pigpen cipher symbols based on the provided key string used to configure the symbols. It should be in the format "#.-#-X-X."
* Symbol Configuration:Initializes an empty HashMap<Integer, String> to store the configured symbols.Validates the length of the key string. If it's not equal to 9, an error message is printed.
* Splitting Key:Splits the key string into substrings using the delimiter -.
* Symbol Mapping:For each substring:
  * If the substring is #, maps the symbols 1 to 9.
  * If the substring is #., maps the symbols 10 to 18.
  * If the substring is X, maps the symbols 19 to 22.
  * If the substring is X., maps the symbols 23 to 26.
  * Increments the counter based on the number of symbols added.
* Space Symbol:Maps the space symbol (27) to its corresponding image path.
* Returns the configured symbols as a HashMap, where the key represents the position of the symbol in the Pigpen grid and the value represents the image path of the symbol.




## Example from execution

![pigpen (1)](https://github.com/KaltrinaKrasniqi/Detyra2-DS/assets/116883212/85eb0c9e-5c1e-4df0-a8be-a9635485ba51)









   

