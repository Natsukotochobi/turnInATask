package com.adventure;

import org.w3c.dom.html.HTMLTableRowElement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("タロウ");
        Hero hero2 = new Hero("ハナコ");
        LittleGhost littleGhost1 = new LittleGhost();

        System.out.println(hero1.getName());

        hero1.swingTheSword(littleGhost1);
        hero1.rest(5);
        System.out.println(hero1.hp);
        littleGhost1.attack(hero1);

        for (int i = 1; i < 11; i++) {
            System.out.println("勇者は" + i + "回剣を振った！");
        }

        List<Hero> heroList = new ArrayList<Hero>();
            heroList.add(hero1);
            heroList.add(hero2);
            //playerList.add("斉藤次郎");
        System.out.println(heroList);

        for (Hero hero : heroList ){
            System.out.println("誕生した勇者は" + hero + "です。");
        }

    }
}
