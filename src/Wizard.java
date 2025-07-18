public class Wizard extends Character{
    private int mp;
    public void setMp(int mp) {
        this.mp = mp;
    }
    public int getMp(){
        return mp;
    }
    public Wizard(String name, int hp, int mp){
        super(name,hp);
    }
    public void attack(Creature target){
        System.out.println(getName() + "は火の玉を放った!" + target.getName() + "に3のダメージを与えた!");
        setMp(getMp()-1);
        if (target.getHp() - 3 <= 0) {
            target.setHp(0);
        } else {
            target.setHp(target.getHp()-3);
        }
    }
}
