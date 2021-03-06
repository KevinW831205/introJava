package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java","a compiled high level oo, language");
        languages.put("Python","some description of python");
        languages.put("Algol", "some description of Algol");

        System.out.println(languages.get("Java"));
        String l1 = "Python";
        System.out.println(languages.get(l1));

        languages.put("Java","Key overwritten");
        System.out.println(languages.get("Java"));
        System.out.println(languages.put("put output","what is getting"));
        System.out.println(languages.put("Algol","Key exists put"));


        String keyToAdd = "Java";
        if(languages.containsKey(keyToAdd)){
            System.out.println(keyToAdd+" is already in map");
        } else {
            languages.put(keyToAdd,"message to add");
        }
        keyToAdd = "newKey";
        if(languages.containsKey(keyToAdd)){
            System.out.println(keyToAdd+" is already in map");
        } else {
            languages.put(keyToAdd,"message to add");
        }

        System.out.println(languages.get("newKey"));



        languages.remove("Java");
        if(languages.remove("Python",123)){
            System.out.println("Python removed");
        } else {
            System.out.println("not removed");
        }
        if(languages.remove("Python","some description of python")){
            System.out.println("Python removed");
        } else {
            System.out.println("not removed");
        }

        languages.put("Java","a compiled high level oo, language");
        System.out.println(languages.replace("Java", "replace java description"));
        System.out.println(languages.replace("asdf","shouldn't be added"));

        if(languages.replace("Java","replace java description","second description of java")){
            System.out.println("java replaced 2nd time");
        } else {
            System.out.println("not replaceds");
        }


        System.out.println("================");


        for(String key: languages.keySet()){
            System.out.println(key + " : " +languages.get(key));
        }


    }
}
