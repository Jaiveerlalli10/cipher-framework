# Cipher Framework

A Java cryptography framework that implements multiple types of substitution 
ciphers with support for encryption and decryption of both strings and files.

## Ciphers Implemented

- **Substitution** — maps each character to a corresponding character via a 
  custom encoding string
- **CaesarKey** — builds an encoding where a keyword appears first, followed 
  by the remaining valid characters
- **CaesarShift** — shifts the entire character set left by a given number 
  of positions
- **MultiCipher** — chains multiple ciphers together, applying them in 
  sequence to encrypt and in reverse to decrypt

## How to Run
1. Compile all files: `javac *.java`
2. Run the client: `java Client`
3. Choose to encode/decode a string or a file
4. To swap ciphers, edit the `CHOSEN_CIPHER` line in `Client.java`

## Project Structure
| File | Description |
|------|-------------|
| `Cipher.java` | Abstract base class (course-provided) |
| `Substitution.java` | Core substitution cipher implementation |
| `CaesarKey.java` | Keyword-based cipher extending Substitution |
| `CaesarShift.java` | Shift-based cipher extending Substitution |
| `MultiCipher.java` | Chains multiple ciphers together |
| `Client.java` | Interactive CLI for encrypting/decrypting |
| `Testing.java` | JUnit test suite |

## Concepts Used
- Object-oriented programming and inheritance
- Polymorphism and abstract classes
- Exception handling
- Queue-based character shifting
- JUnit testing
- File I/O
