package com.rukina.fortunevasthu.utils;

/**
 * Created by Nandha on 06-12-2016.
 */

public class FortuneValidator {

    public static boolean checkNullString(String value) {
        if (value == null)
            return false;
        else
            return value.trim().length() > 0;
    }

    public static boolean checkSpinnerString(String value) {
        if ((value == "Please Select")||(value.equalsIgnoreCase("Please Select")))
            return false;
        else
            return value.trim().length() > 0;
    }

    public static boolean withinPermittedLength(String password){
        return (password.length() > 6) && (password.length() <= 200);
    }

    public static boolean isEmailValid(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
