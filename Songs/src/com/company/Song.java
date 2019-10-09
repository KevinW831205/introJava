package com.company;

public class Song {
    private String title;
    private String duration;

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String toString(){
        return this.title+" "+this.duration;
    }
}
