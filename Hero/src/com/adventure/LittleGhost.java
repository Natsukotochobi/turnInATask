package com.adventure;

public class LittleGhost {
    protected int hp = 50;

    public void attack(Hero hero){
        System.out.println("リトルゴーストは体当たりを繰り出した！");
        hero.hp -= 20;
        System.out.println("体力が20減った！");
    }
}
