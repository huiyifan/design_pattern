package com.yf.proxy;

import com.yf.proxy._dynamic.DHonourPlayer;
import com.yf.proxy._static.ProxyPlayer;

import java.lang.reflect.Proxy;

// 静态代理
public class ProxyTest {

    public static void main(String[] args){

        // 静态代理测试
        IGamePlayer player = new ProxyPlayer();
        player.login("Honour", "qwer");
        player.play();

        System.out.println();
        // 动态代理测试
        IGamePlayer _player = new HonourPlayer();
        // _player.getClass().getInterfaces()
        IGamePlayer proxyPlayer = (IGamePlayer) Proxy.newProxyInstance(_player.getClass().getClassLoader(), new Class[]{IGamePlayer.class}, new DHonourPlayer(_player));
        proxyPlayer.login("Honour", "qwer");
        proxyPlayer.play();
    }

}
