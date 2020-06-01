package com.company;

/*
2202 Find a substring

The getPartOfString method should return a substring starting from the character after the 1st space to the end of the word,
which follows after the 4th space.
Example:
"JavaRush is the best Java learning service."
Result:
"- the best training service"
Throw a TooShortStringException exception on invalid data (make an exception).

Requirements:
1. The TooShortStringException class must be a descendant of the RuntimeException class.
2. The getPartOfString method should take a string as a parameter.
3. In the event that the string passed to the getPartOfString method contains less than 4 spaces, a TooShortStringException shall occur.
4. The getPartOfString method should return a substring starting from the character after the 1st space to the end of the word that follows after the 4th space.

*/

import java.util.TooManyListenersException;

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) throw new TooShortStringException();
        int findSpace = string.indexOf(" ");
        for (int i = 1; i < 4; i++) {
            if ((findSpace = string.indexOf(" ", findSpace + 1)) == -1)
                throw new TooShortStringException();
        }
        String s[] = string.split(" ");
        return s[1] + " " + s[2] + " " + s[3] + " " +  s[4];
    }

    public static class TooShortStringException extends RuntimeException{
    }
}

