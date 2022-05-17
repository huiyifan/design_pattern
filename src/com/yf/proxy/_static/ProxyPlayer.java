package com.yf.proxy._static;

import com.yf.proxy.IGamePlayer;
import com.yf.proxy.HonourPlayer;

public class ProxyPlayer implements IGamePlayer {

    private HonourPlayer mHonourPlayer;

    public ProxyPlayer(){
        mHonourPlayer = new HonourPlayer();
    }

    @Override
    public void login(String account, String pwd) {
        System.out.println("登录前: 代理检查登录环境");
        mHonourPlayer.login(account, pwd);
        System.out.println("登录后: 代理检查登录环境");
    }

    @Override
    public void play() {
        System.out.println("运行前: 代理检查运行环境");
        mHonourPlayer.play();
        System.out.println("运行后: 代理检查运行环境");
    }
}
