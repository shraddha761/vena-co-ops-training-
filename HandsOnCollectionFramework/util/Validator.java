package HandsOnCollectionFramework.util;

import java.util.regex.Pattern;

public class Validator {
    public static boolean isValidEmail(String email) {
        return Pattern.matches("^\\S+@\\S+\\.\\S+$", email);
    }
    public static boolean isValidId(String id) {
        return id != null && !id.trim().isEmpty();
    }
}
