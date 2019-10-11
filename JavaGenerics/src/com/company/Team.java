package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int loss = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName()+" is already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName()+" is added to "+getName());
            return true;
        }
    }

    public int numberOfPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int opponentScore){
        String message = "";
        if(ourScore>opponentScore){
            won ++;
            message = " won ";
        } else if(ourScore<opponentScore) {
            loss++;
            message = " loss ";
        } else {

        }
        played++;
        if(opponent != null){
            System.out.println(getName() + message + opponent.getName());
            opponent.matchResult(null, opponentScore , ourScore);
        }
    }

    public int ranking(){
        return won*2 - loss;
    }
}
