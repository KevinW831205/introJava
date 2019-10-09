package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    String playlistName;
    LinkedList<Song> playlistSongs = new LinkedList<Song>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public boolean addSong(Song song){
        if(findSong(song.getTitle()) == null){
            playlistSongs.add(song);
            System.out.println(song.getTitle() + " was added to playlist");
            return true;
        }
        System.out.println("Error song name exists");
        return false;

    }

    private Song findSong(String songName){
        for(Song checkedSong: playlistSongs){
            if(checkedSong.getTitle().equals(songName)){
                return checkedSong;
            }
        }
        return null;

    }

    public void printPlaylist(){
        for(int i=0; i<playlistSongs.size(); i++){
            System.out.println((i+1)+". " +playlistSongs.get(i).toString());
        }
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public LinkedList<Song> getPlaylistSongs() {
        return playlistSongs;
    }
}
