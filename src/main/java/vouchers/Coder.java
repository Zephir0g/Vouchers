package vouchers;

import java.util.Base64;

public class Coder {

    public String decode(String text) {
        byte[] decodedBytes = Base64.getDecoder().decode(text);
        return new String(decodedBytes);
    }

    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

}
