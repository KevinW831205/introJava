package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0,"location 1"));
        locations.put(1, new Location(1,"location 2"));
        locations.put(2, new Location(2,"location 3"));
        locations.put(3, new Location(3,"location 4"));
        locations.put(4, new Location(4,"location 5"));
        locations.put(5, new Location(5,"location 6"));

        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if(loc==0){
                break;
            }

            loc = scanner.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("Cannot go to that location");
            }
        }


    }
}
