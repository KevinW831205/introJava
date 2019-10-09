package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Album album1 = new Album("album1","artist1");
        Playlist playlist1 = new Playlist("playlist1");

        album1.addSong("song1", "3:33");
        album1.addSong("song1", "3:33");
        album1.addSong("song2", "3:33");

        album1.printSongs();
        album1.addToPlaylist(playlist1,"song2");
        playlist1.printPlaylist();


    }
}
