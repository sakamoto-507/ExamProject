public abstract class Character implements Creature {
    private String name;
    private int hp;

    public Character(String n, int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        setName(n);
        setHp(hp);
    }

    final public boolean isAlive() {
        if (this.hp > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void showStatus() {
        System.out.println(getName() + ":HP " + getHp());
    }
    public void setHp(int hp){
        if (hp < 0) {
            throw new IllegalArgumentException("負の値はsetHpできないよエラー");
        }else{
            this.hp = hp;
        }
    }
    public int getHp(){
        return hp;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void attack(Character target){}
}