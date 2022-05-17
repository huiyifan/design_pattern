package com.yf.proxy._dynamic;

import com.yf.proxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 动态代理: 王者荣耀玩家
public class DHonourPlayer implements InvocationHandler {

    private IGamePlayer mIGamePlayer;

    public DHonourPlayer(IGamePlayer player){
        mIGamePlayer = player;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if (mIGamePlayer != null && method != null) {
            method.setAccessible(true);

            if("login".equals(method.getName()) && objects != null && objects.length > 0){
                System.out.println("登录前: 动态代理检查登录环境");
                Object obj = method.invoke(mIGamePlayer, objects);
                System.out.println("登录后: 动态代理检查登录环境");
                return obj;
            }else if("play".equals(method.getName())){
                System.out.println("运行前: 动态代理检查运行环境");
                Object obj = method.invoke(mIGamePlayer, objects);
                System.out.println("运行后: 动态代理检查运行环境");
                return obj;
            }
        }
        return method.invoke(o, objects);
    }
}
