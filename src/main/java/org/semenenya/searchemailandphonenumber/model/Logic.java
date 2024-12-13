package org.semenenya.searchemailandphonenumber.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {
    private Logic(){}
    public static String choiceRegularExpression(int flag){
        String regex1 = "([a-z0-9]{1,}[\\\\-]{0,1}[a-z0-9]{1,}[\\\\.]{0,1}[a-z0-9]{1,})" +
                "+@([a-z0-9]{1,}[\\\\-]{0,1}[a-z0-9]{1,}[\\\\.]{0,1}[a-z0-9]{1,})+[\\\\.]{1}[a-z]{2,4}"
                ;
        String regex2 = "([a-z]{1,}[\\\\-]{0,1}[a-z]{1,}[\\\\.]{0,1}[0-9]{7})";

        if(flag==0)
            return regex1;

        else if (flag==1)
            return regex2;

        else
            return null;
    }
    public static List<String> searchEmailOrTelephoneNumber(String text, int flag){
        List<String> list = new ArrayList<>();

        String regularExpression= choiceRegularExpression(flag);
        if(regularExpression==null)
            return Collections.emptyList();

        Pattern pattern = Pattern.compile(regularExpression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
            list.add(matcher.group());

        return list;
    }
}