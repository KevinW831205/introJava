package com.company;

public abstract class Team implements Comparable<Team> {
    private String name;
    private int score;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Team team) {
        if(this.getScore() > team.getScore()){
            return -1;
        } else if(this.getScore() < team.getScore()) {
            return 1;
        } else {
            return 0;
        }
    }


}
