final public class Matango extends Monster{
    public Matango(int hp, char suffix) {
        super(hp, suffix, "マタンゴ");
    }

    public void attack(Creature target){
        System.out.println("マタンゴ" + getsuffix() +  "は体当たり攻撃！" + target.getName() + "に6のダメージを与えた!");
        if (target.getHp() - 6 <= 0) {
            target.setHp(0);
        } else {
            target.setHp(target.getHp() - 6);
        }
    }
}