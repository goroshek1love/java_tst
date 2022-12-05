package ru.stqa.pft.sandbox;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] langs = new String[]{"Java", "C#", "Python", "PHP"};

        for (int i = 0; i < langs.length; i++) {
            System.out.println("I want to learn " + langs[i]);
        }
        for (String l : langs) {
            System.out.println("I want to learn " + l);
        }

        List<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");

        for (String l : languages) {
            System.out.println("I want  to learn " + l);
        }

        List<String> languages1 = Arrays.asList("C", "JavaScript", "Python", "C++");

        for (int i = 0; i < languages1.size(); i++) {
            System.out.println("I want to learn " + languages1.get(i));
        }
        System.out.println();
        for (String l : languages1) {
            System.out.println("I want to forget " + l);
        }
    }
}
