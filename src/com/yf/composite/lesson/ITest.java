package com.yf.composite.lesson;

import com.yf.composite.lesson.color.DefaultColor;
import com.yf.composite.lesson.color.RedColor;
import com.yf.composite.lesson.color.WhiteColor;
import com.yf.composite.lesson.product.*;

public class ITest {

    public static void main(String[] args){
        // 大袋子
        Pocket bigPocket = new Pocket(PocketEnum.BIG);
        bigPocket.color(new DefaultColor());
        bigPocket.count(1);
        bigPocket.unit("个");

        // 小红色袋子
        Pocket smallRedPocket = new Pocket(PocketEnum.SMALL);
        smallRedPocket.color(new RedColor());
        smallRedPocket.count(1);
        smallRedPocket.unit("个");

        // 两包婺源特产
        IProduct wytechan = new Product("婺源特产");
        wytechan.price(7.9);
        wytechan.color(new DefaultColor());
        wytechan.count(2);
        wytechan.unit("包");

        // 1张婺源地图
        IProduct wyditu = new Product("婺源地图");
        wyditu.price(9.9);
        wyditu.color(new DefaultColor());
        wyditu.count(1);
        wyditu.unit("张");

        smallRedPocket.add(wytechan);
        smallRedPocket.add(wyditu);

        // 白色小袋子
        Pocket whitePocket = new Pocket(PocketEnum.SMALL);
        whitePocket.color(new WhiteColor());
        whitePocket.count(1);
        whitePocket.unit("个");

        IProduct sgxiangji = new Product("韶关香藉");
        sgxiangji.price(68);
        sgxiangji.color(new DefaultColor());
        sgxiangji.count(2);
        sgxiangji.unit("包");

        IProduct sghongcha = new Product("韶关红茶");
        sghongcha.price(180);
        sghongcha.color(new DefaultColor());
        sghongcha.count(3);
        sghongcha.unit("包");

        whitePocket.add(sgxiangji);
        whitePocket.add(sghongcha);

        // 中袋
        Pocket middlePocket = new Pocket(PocketEnum.MIDDLE);
        middlePocket.color(new DefaultColor());
        middlePocket.count(1);
        middlePocket.unit("个");

        IProduct jdzciqi = new Product("景德镇瓷器");
        jdzciqi.price(380);
        jdzciqi.color(new DefaultColor());
        jdzciqi.count(1);
        jdzciqi.unit("个");

        middlePocket.add(jdzciqi);
        middlePocket.add(smallRedPocket);

        IProduct lnyundongxie = new Product("李宁牌运动鞋");
        lnyundongxie.price(198);
        lnyundongxie.color(new DefaultColor());
        lnyundongxie.count(1);
        lnyundongxie.unit("双");

        bigPocket.add(middlePocket);
        bigPocket.add(whitePocket);
        bigPocket.add(lnyundongxie);

        bigPocket.operate();

    }

}
