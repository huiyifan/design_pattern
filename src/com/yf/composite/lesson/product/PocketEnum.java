package com.yf.composite.lesson.product;

public enum PocketEnum {

    SMALL(0),
    MIDDLE(1),
    BIG(2);

    int type;

    PocketEnum(int type){
        this.type = type;
    }

    public String name(int type){
        switch (type){
            case 1:
                return "中袋";
            case 2:
                return "大袋";
        }
        return "小袋";
    }

    @Override
    public String toString() {
        return "PocketEnum{" +
                "type='" + type + '\'' +
                '}';
    }
}
