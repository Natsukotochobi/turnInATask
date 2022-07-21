package com.adventure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hero heroTaro = new Hero("タロウ", 100, 100);
        Hero heroJiro = new Hero("ジロウ", 150, 150);
        Hero heroIchiro = new Hero("イチロー", 200, 200);
        LittleGhost littleGhost1 = new LittleGhost();

        // 生成したHeroオブジェクトをListに追加
        List<Hero> heroList = new ArrayList<>();
            heroList.add(heroTaro);
            heroList.add(heroJiro);
            heroList.add(heroIchiro);

        System.out.println("-----------------------------------------------------");
        System.out.println("Heroのステータス");
        System.out.println("-----------------------------------------------------");
        // Heroオブジェクトの各フィールドを表示
        heroList.forEach(hero -> {
            System.out.println("ヒーロー名: " + hero.getName()+"\n"+"最大HP："+hero.getMaxHp()+"\n"+"現在HP："+hero.getTmpHp());
        });
        System.out.println("-----------------------------------------------------");
        System.out.println("戦闘開始！");
        System.out.println("-----------------------------------------------------");

        // リトルゴーストに攻撃、リトルゴーストからの反撃の処理を行う
        heroList.forEach(hero -> {
           hero.swingTheSword(littleGhost1);
           littleGhost1.attack(hero);
           hero.rest(5);
        });
        System.out.println("-----------------------------------------------------");
        System.out.println("戦闘終了");
        System.out.println("-----------------------------------------------------");

        // 戦闘後のHeroオブジェクトの各フィールドを表示
        heroList.forEach(hero -> {
            System.out.println("ヒーロー名: " + hero.getName()+"\n"+"最大HP："+hero.getMaxHp()+"\n"+"現在HP："+hero.getTmpHp());
        });

        System.out.println("-----------------------------------------------------");

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
