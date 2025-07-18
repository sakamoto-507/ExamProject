final public class Goblin extends Monster {
    public Goblin(int hp, char suffix) {
        super(hp, suffix,"ゴブリン");
    }
    public void Goblin(int hp, char suffix){}
    public void attack(Creature target){
        System.out.println("ゴブリン" + getsuffix() + "はナイフで切りつけた！" + target.getName() + "に8のダメージを与えた！");
        if (target.getHp() - 8 <= 0) {
            target.setHp(0);
        } else {
            target.setHp(target.getHp() - 8);
        }
    }
}
