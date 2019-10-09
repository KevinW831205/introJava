package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;
    private String artist;
    private ArrayList<Song> albumSongs = new ArrayList<Song>();

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Album(String title) {
        this.title = title;
        this.artist = "unknown";
    }

    public boolean addSong(String songName, String duration){
        if(findSong(songName) == null){
            albumSongs.add(new Song(songName, duration));
            System.out.println(songName + " was added to album");
            return true;
        }
        System.out.println("Error song name exists");
        return false;
    }

    private Song findSong(String songName){

        for(Song checkedSong: albumSongs){
            if(checkedSong.getTitle().equals(songName)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(Playlist playlistToAdd, String songToAdd){
        if( findSong(songToAdd) != null){
            playlistToAdd.addSong(findSong(songToAdd));
            return true;
        } else {
            System.out.println("Error Album doesn't contain song");
            return false;
        }
    }

    public void printSongs(){
        for(int i =0; i<albumSongs.size();i++){
            System.out.println((i+1)+ ". "+albumSongs.get(i).toString());
        }
    }

}
