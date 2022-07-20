package com.adventure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("タロウ");
        LittleGhost littleGhost1 = new LittleGhost();

        System.out.println(hero1.getName());

        hero1.swingTheSword(littleGhost1);
        hero1.rest(5);
        System.out.println(hero1.hp);
        littleGhost1.attack(hero1);

        for (int i = 1; i < 11; i++) {
            System.out.println("勇者は" + i + "回剣を振った！");
        }

        List<String> playerList = new ArrayList<String>();
            playerList.add("山田太郎");
            playerList.add("田中花子");
            playerList.add("斉藤次郎");
        System.out.println(playerList);

        for (String player : playerList ){
            System.out.println("プレイヤーは" + player + "です。");
        }

    }
}
