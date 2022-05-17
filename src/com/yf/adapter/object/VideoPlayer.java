package com.yf.adapter.clazz.object;

// 视频播放器
public class VideoPlayer {

    public void loadFile(String path) {
        System.out.println(VideoPlayer.class.getSimpleName() + " 加载本地文件 " + path);
    }

    public void loadUrl(String path){
        System.out.println(VideoPlayer.class.getSimpleName() + " 加载远程文件 " + path);
    }

    public void play(){
        System.out.println(VideoPlayer.class.getSimpleName() + " 播放视频内容: ");
    }

    public void stop(){
        System.out.println(VideoPlayer.class.getSimpleName() + " 暂停播放视频: ");
    }

    public void release(){
        System.out.println(VideoPlayer.class.getSimpleName() + " 释放了: ");
    }

}
