package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class League<T extends Team>{
    private String name;
    private ArrayList<T> leagueTeams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if(leagueTeams.contains(team)){
            System.out.println("Team already in league");
            return false;
        } else {
            leagueTeams.add(team);
            System.out.println(team.getName() +" was added to the "+this.name+" league");
            return true;
        }
    }

    public void printTeamRanking(){
        System.out.println("L1 Ranking: ");
        Collections.sort(leagueTeams);
        for(T team : leagueTeams){
            System.out.println(team.getName()+" : "+team.getScore());
        }

    }

}
