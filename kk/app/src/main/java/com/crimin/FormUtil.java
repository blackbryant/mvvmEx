package com.crimin;

/**
 * Created by bryant on 2016/12/28.
 */
public class FormUtil {
    public static String ID_EXPRESSION = "\\d{6,}";

    public boolean checkPassword(String password){
        if(password.matches(ID_EXPRESSION)){
            return true ;
        }
        return false ;
    }

    public boolean checkAgeGreaterThanTeenage(String age){
        if(Integer.valueOf(age)>=18){
            return true;
        }

        return false ;
    }

}
