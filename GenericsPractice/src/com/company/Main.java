package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        League<ATeam> L1 = new League<>("L1");
        ATeam A1 = new ATeam("A1");
        A1.setScore(10);
        ATeam A2 = new ATeam("A2");
        A2.setScore(40);
        ATeam A3 = new ATeam("A3");
        A3.setScore(17);
        ATeam A4 = new ATeam("A4");
        A4.setScore(34);

        L1.addTeam(A1);
        L1.addTeam(A2);
        L1.addTeam(A3);
        L1.addTeam(A4);

        BTeam B1 = new BTeam("B1");
//        B1.setScore(32);
//        L1.addTeam(B1);
        L1.printTeamRanking();


    }
}
