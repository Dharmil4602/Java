package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String name = new String("Dharmil");
        String name1 = new String("          Dharmil Shah         ");

        // Method 1: Finding The Length Of String.

        int val = name.length();
        System.out.println("Length Of Given String Is: " + val);

        // Method 2: Converting String to lowercase
        String s1 = name.toLowerCase();
        System.out.println(s1);

        // Method 3: Converting String to uppercase
        String s2 = name.toUpperCase();
        System.out.println(s2);

        // Method 4: using trim() to remove whitespaces
        String s3 = name1.trim();
        System.out.println(s3);

        // Method 5: using substring to get part of the string.
        String s4 = name.substring(2);
        System.out.println(s4);

        // Method 6: Replacing the character.
        String s5 = name.replace('l', 'k');
        System.out.println(s5);

        String s0 = name1.replace(" ", "_");
        System.out.println(s0);

        String s6 = name.replace("Dha", "The");
        System.out.println(s6);

        // Method 7: Checks whether particular string starts with given characters or not.
        System.out.println(name.startsWith("Dha"));
        System.out.println(name.startsWith("Had"));
        System.out.println(name.endsWith("mil"));
        System.out.println(name.endsWith("Mil"));

        // Method 8: Finding character at particular position.
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("arm"));
        System.out.println(name.indexOf("mil", 1));

        // Method 9: Equals method.
        System.out.println(name.equals("Dharmil"));
        System.out.println(name.equalsIgnoreCase("dharmil"));
        System.out.println(name.equalsIgnoreCase("dHArmil"));
    }
}


