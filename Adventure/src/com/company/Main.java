package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0,"location 0 (exit)"));
        locations.put(1, new Location(1,"location 1"));
        locations.put(2, new Location(2,"location 2"));
        locations.put(3, new Location(3,"location 3"));
        locations.put(4, new Location(4,"location 4"));
        locations.put(5, new Location(5,"location 5"));

        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);
//        locations.get(1).addExit("Q",0);

        locations.get(2).addExit("N",5);
//        locations.get(2).addExit("Q",0);

        locations.get(3).addExit("W",1);
//        locations.get(3).addExit("Q",0);

        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);
//        locations.get(4).addExit("Q",0);

        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);
//        locations.get(5).addExit("Q",0);


        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if(loc==0){
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit+", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            direction = directionFromString(direction);
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }


//        String[] x = "a s d".split(" ");
//        for(String i : x){
//            System.out.println(i);
//        }

    }

    public static String directionFromString(String string){
        String[] s = string.split(" ");
        for(String i: s){
            switch (i.toUpperCase()){
                case "NORTH":
                case "N":
                    return "N";
                case "SOUTH":
                case "S":
                    return "S";
                case "EAST":
                case "E":
                    return "E";
                case "WEST":
                case "W":
                    return "W";
                case "Q":
                    return "Q";
                default:
                    break;
            }
        }
        return "";
    }

}

