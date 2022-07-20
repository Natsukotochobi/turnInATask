package com.adventure;

public class Hero {
    private String name;
    protected int hp = 80;
    private final int MAX_HP = 100;

    public Hero(String name){
        this.name = name;
    }

    public void swingTheSword(LittleGhost e){
        System.out.println(this.name + "は、剣を振った！");
        e.hp -= 10;
        System.out.println("リトルゴーストに、10のダメージを与えた！");
    }

    public void rest(int sec){
        System.out.println(this.name + "は、" + sec + "秒間休憩した！");
        this.hp += sec * 2;
        if(hp > 100){
            this.hp = MAX_HP;
            System.out.println("体力が全回復した！");
        }else{
            System.out.println("体力が" + sec * 2 + "回復した！");
        }

    }

    public String getName() {
        return name;
    }



}
