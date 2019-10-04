package com.company;

public class Wall {
    private String dircetion;
    private String Wallpaper;

    public Wall(String dircetion, String wallpaper) {
        this.dircetion = dircetion;
        Wallpaper = wallpaper;
    }

    public String getDircetion() {
        return dircetion;
    }

    public String getWallpaper() {
        return Wallpaper;
    }
}
