package com.company;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellites(HeavenlyBody satellites) {
        if(satellites.getKey().getBodyType() == BodyTypes.MOON){
            return super.addSatellites(satellites);
        } else {
            return false;
        }
    }
}
