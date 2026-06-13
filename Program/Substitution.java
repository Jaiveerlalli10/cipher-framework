// Jaiveer Lalli
// 4-12-26

// This class is a substitution cipher that maps each valid character
// to a corresponding character in a provided mapping system
public class Substitution extends Cipher {
    // Represents the string being encoded
    private String encoding;

    // Constructs a new substitution cipher with an empty encoding 
    public Substitution() {
        this.encoding = "";
    }

    // Constructs a new substitution cipher with the provided encoding
    // Parameters:
    // - encoding = represents the mapping of each character
    // Exceptions:
    // an IllegalArgumentException is thrown if encoding is null, encoded doesn't 
    // match the valid characters length, or if there are duplicate letters or invalid
    // letters in encoded
    public Substitution(String encoding) {
        if (encoding == null || encoding.length() != VALID_CHARS.length()) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < encoding.length(); i++) {
            for (int j = i + 1; j < encoding.length(); j++) {
                if (encoding.charAt(i) == encoding.charAt(j) ||
                    !isCharValid(encoding.charAt(i))) {
                throw new IllegalArgumentException();
                }
            }
        }
        this.encoding = encoding;
    }

    // Updates the encoding for each character to be mapped to another character
    // Parameters:
    // - encoding = represents how each character is mapped
    // Exceptions:
    // an IllegalArgumentException is thrown if encoding is null, encoded doesn't 
    // match the valid characters length, or if there are duplicate letters or invalid
    // letters in encoded
    public void setEncoding(String encoding) {
        if (encoding == null || encoding.length() != VALID_CHARS.length()) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < encoding.length(); i++) {
            for (int j = i + 1; j < encoding.length(); j++) {
                if (encoding.charAt(i) == encoding.charAt(j) ||
                        !isCharValid(encoding.charAt(i))) {
                    throw new IllegalArgumentException();
                }
            }
        }
        this.encoding = encoding;
    }

    // This method encrypts the input given
    // Parameters:
    // input = the message being encrypted
    // Exceptions:
    // - IllegalArgumentException is thrown if input is null
    // - IllegalStateException is thrown if encoding is empty
    // Returns:
    // an encrypted version of the input
    public String encrypt(String input) {
        String result = "";
        if (input == null) {
            throw new IllegalArgumentException();
        }

        if (encoding.isEmpty()) {
            throw new IllegalStateException();
        }
        
        for (int i = 0; i < input.length(); i++) {
            int position = VALID_CHARS.indexOf(input.charAt(i));
            if (position == -1) {
                result += input.charAt(i);
            } else {
                result += encoding.charAt(position);
            }        

        }
        return result;

    }

    // This method decrypts the input given
    // Parameters:
    // input = the message being decrypted
    // Exceptions:
    // - IllegalArgumentException is thrown if input is null
    // - IllegalStateException is thrown if encoding is empty
    // Returns:
    // a decrypted message of the input given
    public String decrypt(String input) {
        String result = "";
        if (input == null) {
            throw new IllegalArgumentException();
        }
        if (encoding.isEmpty()) {
            throw new IllegalStateException();
        }

        for (int i = 0; i < input.length(); i++) {
            int position = encoding.indexOf(input.charAt(i));
            if (position == -1) {
                result += input.charAt(i);
            } else {
                result += VALID_CHARS.charAt(position);
            }
        }

        return result;
    }


    

}
