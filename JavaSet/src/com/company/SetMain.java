package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i=1; i<= 100; i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("Squares "+squares.size());
        System.out.println("Cubes " + cubes.size());

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union "+union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection "+intersection.size());
        for(int i :intersection){
            System.out.println(i+" is the square of "+Math.sqrt(i) + " and cube of "+Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        for(String s : words){
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] arrayWords1 = {"all","nature","is","but","art","unknown","to","thee"};
        String[] arrayWords2 = {"to","err", "is","human","to","forgive","divine"};

        nature.addAll(Arrays.asList(arrayWords1));
        divine.addAll(Arrays.asList(arrayWords2));


        System.out.println("nature - divine: ");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature:");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> symmetricDifference = new HashSet<>(nature);
        symmetricDifference.addAll(divine);
        Set<String> intersection1 = new HashSet<>(nature);
        intersection1.retainAll(divine);

        System.out.println("Symmetric difference");
        symmetricDifference.removeAll(intersection1);
        printSet(symmetricDifference);

        if(nature.containsAll(divine)){
            System.out.println("divine is a subset of nature");
        }
        if(nature.containsAll(intersection1)){
            System.out.println("intersection1 is subset of nature ");
        }

        if(divine.containsAll(intersection1)){
            System.out.println("intersection1 is a subset of divine" );
        }

    }

    private static void printSet(Set<String> set){
        System.out.print("\t");
        for(String s : set){
            System.out.print(s+" ");
        }
        System.out.println();
    }


}
