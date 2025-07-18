public class Slime extends Monster{
    public Slime(int hp, char suffix) {
        super(hp, suffix,"スライム");
    }

    public void Slime(int hp, char suffix){}
    public void attack(Creature target){
        System.out.println("スライム" + getsuffix() +  "は体当たり攻撃！" + target.getName() + "に5のダメージを与えた!");
        if (target.getHp() - 5 <= 0) {
            target.setHp(0);
        } else {
            target.setHp(target.getHp() - 5);
        }
    }
}