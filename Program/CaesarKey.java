// Jaiveer Lalli
// 4-12-26

import java.util.*;

// Represents a substiution cipher where a key determines the beginning
// of the encoding, and then the rest of the valid characters.
public class CaesarKey extends Substitution {

    // Constructs a new cipher with the given key. 
    // Parameters:
    // - key: The letters that will be in the front of the encoding
    // Exceptions:
    // - an IllegalArgumentException is thrown if key is null, or duplicate letters
    // are used in key, or invalid characters are used
    public CaesarKey(String key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        String result = key;
        for (int i = 0; i < VALID_CHARS.length(); i++) {
            String testChar = "" + VALID_CHARS.charAt(i);
            if (!result.contains(testChar)) {
                result += VALID_CHARS.charAt(i);
            }
        }
        setEncoding(result);



    }
}
