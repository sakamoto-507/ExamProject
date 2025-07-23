import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        party.add(new Hero("勇者", 100, "剣"));
        party.add(new Wizard("魔法使い", 60, 20));
        party.add(new Thief("盗賊", 70));
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Matango(45, 'A'));
        monsters.add(new Goblin(50, 'A'));
        monsters.add(new Slime(40, 'A'));
        System.out.println("---味方パーティ---");
        for (int i = 0; i <= party.size() - 1; i++) {
            party.get(i).showStatus();
        }
        System.out.println("---敵グループ---");
        for (int i = 0; i <= monsters.size() - 1; i++) {
            monsters.get(i).showStatus();
        }
        System.out.println("\n味方の総攻撃!");
        for (int i = 0; i <= party.size() - 1; i++) {
            for (int j = 0; j <= monsters.size() - 1; j++) {
                party.get(i).attack(monsters.get(j));
            }
        }
        System.out.println("\n敵の総攻撃!");
        for (int i = 0; i <= monsters.size() - 1; i++) {
            for (int j = 0; j <= party.size() - 1; j++) {
                monsters.get(i).attack(party.get(j));
            }
        }
        System.out.println("\nダメージを受けたヒーローが突然光りだした!\n勇者はスーパーヒーローに進化した!");
        party.set(0, new SuperHero("勇者", party.get(0).getHp(), "剣"));
        for (int i = 0; i <= monsters.size() - 1; i++) {
            party.get(0).attack(monsters.get(i));
        }
        System.out.println("\n---味方パーティ最終ステータス---");
        for (int i = 0; i <= party.size() - 1; i++) {
            party.get(i).showStatus();
            System.out.print("生存状況:");
            if (party.get(i).isAlive() == true) {
                System.out.println("生存");
            }else{
                System.out.println("死亡");
            }
        }
        System.out.println("\n---敵グループ最終ステータス---");
        for (int i = 0; i <= monsters.size() - 1; i++) {
            monsters.get(i).showStatus();
            System.out.print("生存状況:");
            if (monsters.get(i).isAlive() == true) {
                System.out.println("生存");
            }else{
                System.out.println("死亡");
            }
        }
    }
}