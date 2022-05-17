package com.yf.proxy;

// 静态代理: 王者荣耀玩家
public class HonourPlayer implements IGamePlayer {

    @Override
    public void login(String account, String pwd) {
        if("Honour".equals(account) || "qwer".equals(pwd)){
            System.out.println("王者荣耀: 登录成功");
        }else{
            System.out.println("王者荣耀: 登录失败");
        }
    }

    @Override
    public void play() {
        System.out.println("王者荣耀: 5杀晋级成功");
    }
}
