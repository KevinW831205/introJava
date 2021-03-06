package com.company;

import javax.swing.*;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Album album1 = new Album("album1", "artist1");
        Playlist playlist1 = new Playlist("playlist1");

        album1.addSong("song1", "3:33");
        album1.addSong("song1", "3:33");
        album1.addSong("song2", "3:33");
        album1.addSong("song3", "3:33");
        album1.addSong("song4", "3:33");
        album1.addSong("song5", "3:33");
        album1.addSong("song6", "3:33");


        album1.printSongs();
        album1.addToPlaylist(playlist1, "song1");
        album1.addToPlaylist(playlist1, "song2");
        album1.addToPlaylist(playlist1, "song3");
        album1.addToPlaylist(playlist1, "song4");

        playPlaylist(playlist1);


    }

    private static void playPlaylist(Playlist playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;
        boolean forward = true;
        ListIterator<Song> songListIterator = playlist.getPlaylistSongs().listIterator();
        printMenu();

        if (playlist.getPlaylistSongs().size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("playing" + songListIterator.next().toString());
        }

        while (playing) {
            int action = scanner.nextInt();

            switch (action) {
                case 0:
                    System.out.println("Exit " + playlist.getPlaylistName());
                    playing = false;
                    break;
                case 1:
                    if (!forward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        forward = true;
                    }

                    if (songListIterator.hasNext()) {
                        System.out.println("Now Playing " + songListIterator.next().toString());
                    } else {
                        System.out.println("Reached end of playlist");
                        forward = false;
                    }

                    break;
                case 2:
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        forward = false;
                    }
                    if(songListIterator.hasPrevious()){
                        System.out.println("Now Playing "+songListIterator.previous().toString());
                    } else {
                        System.out.println("Reach beginning of playlist");
                        forward = true;
                    }

                    break;
                case 3:
                    if(forward){
                        if(songListIterator.hasPrevious()){
                            System.out.println("Replaying "+songListIterator.previous().toString());
                            forward =false;
                        } else {
                            System.out.println("Beginning of list");
                        }
                    } else {
                        if(songListIterator.hasNext()){
                            System.out.println("Replaying "+songListIterator.next().toString());
                            forward=true;
                        } else {
                            System.out.println("End of list");
                        }
                    }

                    break;
                case 4:
                    playlist.printPlaylist();
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.getPlaylistSongs().size() >0){
                        songListIterator.remove();
                        if(songListIterator.hasNext()){
                            System.out.println("Now playing "+songListIterator.next().toString());
                        } else if(songListIterator.hasPrevious()){
                            System.out.println("Now playing "+songListIterator.previous().toString());
                        }else{
                            System.out.println("Empty playlist");
                        }
                    }

            }
        }
    }

    private static void printMenu(){
        System.out.println("0 - to quit\n2 - play next\n3 - play previous\n4 - printPlaylist\n5 - printMenu\n6- delete");
    }
}
