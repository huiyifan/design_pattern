package com.yf.adapter.clazz.object;

public class MediaTest {

    public static void main(String[] args){
        MediaAdapterImpl mediaAdapter = new MediaAdapterImpl(new VideoPlayer(), new AudioPlayer());
        mediaAdapter.load("c:\\user\\desktop\\zhanshen.vip");
        mediaAdapter.play();
        mediaAdapter.stop();
        mediaAdapter.release();
    }


}
