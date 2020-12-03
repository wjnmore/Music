package com.example.music;


public class Song {

    public String song;//歌曲名
    public String singer;//歌手
    public long size;//歌曲所占空间大小
    public int duration;//歌曲时间长度
    public String path;//歌曲地址
    public String album;//专辑名

    public String getPath(){
        return path;
    }
    public int getDuration(){
        return duration;
    }
}
