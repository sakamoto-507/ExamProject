public class Thief extends Character {
    public Thief(String name,int hp) {
        super(name,hp);
    }
    public void attack(Creature target){
        System.out.println(getName() + "は" + target.getName() + "に5のダメージを与えた!");
        if (target.getHp() - 5 <= 0) {
            target.setHp(0);
        } else {
            target.setHp(target.getHp()-5);
        }
    }
}