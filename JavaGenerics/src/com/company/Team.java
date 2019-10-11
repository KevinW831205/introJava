package com.company;

import java.util.ArrayList;

public class Team {
    private String name;
    private int played = 0;
    private int won = 0;
    private int loss = 0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player){
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

    public void matchReuslt(Team opponent, int ourScore, int opponentScore){
        if(ourScore>opponentScore){
            won ++;
        } else if(ourScore<opponentScore) {
            loss++;
        } else {

        }
        played++;
        if(opponent != null){
            opponent.matchReuslt(null, opponentScore , ourScore);
        }
    }

    public int ranking(){
        return won*2 - loss;
    }
}
