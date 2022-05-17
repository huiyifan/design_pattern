package com.yf.adapter.clazz.object;

public class MediaAdapterImpl implements IMediaController{

    private AudioPlayer mAudioPlayer;
    private VideoPlayer mVideoPlayer;

    public MediaAdapterImpl(VideoPlayer videoPlayer, AudioPlayer audioPlayer){
        mVideoPlayer = videoPlayer;
        mAudioPlayer = audioPlayer;
    }

    public void loadUrl(String url){
        if (mVideoPlayer != null) {
            mVideoPlayer.loadUrl(url);
        }

        if(mAudioPlayer != null){
           mAudioPlayer.loadUrl(url);
        }
    }

    @Override
    public void load(String path) {
        if (mVideoPlayer != null) {
            mVideoPlayer.loadFile(path);
        }

        if(mAudioPlayer != null){
           mAudioPlayer.loadFile(path);
        }
    }

    @Override
    public void play() {
        if (mVideoPlayer != null) {
            mVideoPlayer.play();
        }

        if(mAudioPlayer != null){
           mAudioPlayer.play();
        }
    }

    @Override
    public void stop() {
        if (mVideoPlayer != null) {
            mVideoPlayer.stop();
        }

        if(mAudioPlayer != null){
            mAudioPlayer.stop();
        }
    }

    @Override
    public void release() {
        if (mVideoPlayer != null) {
            mVideoPlayer.release();
        }

        if(mAudioPlayer != null){
            mAudioPlayer.release();
        }
    }
}
