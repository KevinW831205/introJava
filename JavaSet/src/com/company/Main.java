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

        /*
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
        temp.addSatellites(tempMoon);

        temp = new HeavenlyBody("somePlanet", 424);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Moon1", 25);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellites(tempMoon);
//        tempMoon = new HeavenlyBody("Moon1",27);
//        temp.addMoon(tempMoon);


        tempMoon = new HeavenlyBody("Moon2", 26);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellites(tempMoon);



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

         */


        HeavenlyBody temp = new Planet("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new Planet("Venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new Planet("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        HeavenlyBody tempMoon = new Moon("Moon",28);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellites(tempMoon);

        temp = new Planet("Mars",560);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

//        temp = new Star("Mars",560);
//        solarSystem.put(temp.getName(),temp);
//        planets.add(temp);


        temp = new Planet("SomePlanet",864);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        tempMoon = new Moon("Moon1",66);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addSatellites(tempMoon);


        System.out.println("Planets");
        for(HeavenlyBody planet:planets){
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("SomePlanet");
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

        for(HeavenlyBody planet:planets){
//            System.out.println("\t" + planet.getName() + planet.getOrbitalPeriod());
            System.out.println(planet);
        }

        HeavenlyBody earth1 = new Planet("Earth1",365);
        HeavenlyBody earth2 = new Planet("Earth1",365);

        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(temp));

    }
}

