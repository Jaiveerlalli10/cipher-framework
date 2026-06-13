// Jaiveer Lalli
// 4-12-26

import java.util.List;

// This class chains multiple ciphers together. It applies in order
// to encrypt and in reverse order to decrypt
public class MultiCipher extends Cipher {

    // Represents the list of ciphers to be applied
    private List<Cipher> ciphers;
    
    // Constructs a new MultiCipher with the list of ciphers
    // Parameters:
    // ciphers = represents the various ciphers of a message
    // Exceptions:
    // an IllegalArgumentException is thrown is ciphers is null
    public MultiCipher(List<Cipher> ciphers) {

        if (ciphers == null) {
            throw new IllegalArgumentException();
        }
        this.ciphers = ciphers;
    }

    // encrypts a message
    // Parameters:
    // input = represents the message being encrypted
    // Exceptions:
    // an IllegalArgumentException is thrown if input is null
    // Returns:
    // input = represents the new encrypted message of input
    public String encrypt(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        for (Cipher cipher : ciphers) {
            input = cipher.encrypt(input);
        }
    return input;

    }

    // decrypts a message
    // Parameters:
    // input = represents the message being decrypted
    // Exceptions:
    // an IllegalArgumentException is thrown if input is null
    // Returns:
    // - represents the decrypted message of input
    public String decrypt(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        for (int i = ciphers.size() - 1; i >= 0; i--) {
            input = ciphers.get(i).decrypt(input);
        }
    return input;

    }
}
