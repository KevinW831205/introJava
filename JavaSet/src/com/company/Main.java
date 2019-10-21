package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
	// write your code here

        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("earth", 365.24);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("somePlanet", 424);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Moon1", 25);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
//        tempMoon = new HeavenlyBody("Moon1",27);
//        temp.addMoon(tempMoon);


        tempMoon = new HeavenlyBody("Moon2", 26);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);



        System.out.println("Planets");
        for(HeavenlyBody planet:planets){
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("somePlanet");
        System.out.println("moons of "+body.getName());
        for(HeavenlyBody moons : body.getSatellites()){
            System.out.println("\t" + moons.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet:planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody moon: moons){
            System.out.println("\t"+moon.getName());
        }

        HeavenlyBody somePlanet = new HeavenlyBody("somePlanet",324);   // .equals of hashset only checks for same reference
        planets.add(somePlanet);
        for(HeavenlyBody planet:planets){
            System.out.println("\t" + planet.getName() + planet.getOrbitalPeriod());
        }




    }
}

