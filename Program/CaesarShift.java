// Jaiveer Lalli
// 4-12-26

import java.util.*;


// This class provides a substitution cipher and shifts the encoding
// by a certain amount
public class CaesarShift extends Substitution {

    // Constructs a new cipher that is shifted
    // Parameters:
    // - shift: represents the number of positions to shift the valid characters
    // to the left
    // Exception:
    // - an IllegalArgumentException is thrown if shift is less than 0
    public CaesarShift(int shift) {
        if (shift < 0) {
            throw new IllegalArgumentException();
        }

        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < VALID_CHARS.length(); i++) {
            q.add(VALID_CHARS.charAt(i));
        }

        for (int i = 0; i < shift; i++) {
            q.add(q.remove());
        }
        String result = "";
        int size = q.size();
        for (int i = 0; i < size; i++) {
            result += q.remove();
        }
        setEncoding(result);

    }
}
