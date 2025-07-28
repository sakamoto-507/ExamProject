public abstract class Monster implements Creature {
    private String name;
    private int hp;
    private char suffix;

    public Monster(int hp, char suffix, String name) {
        setSuffix(suffix);
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        setName(name);
        setHp(hp);
    }

    final public boolean isAlive() {
        if (this.hp > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
    public char getsuffix(){
        return suffix;
    }
    public void showStatus() {
        System.out.println(this.name + this.suffix +  ":HP " + this.hp);
    }
    public void attack(Monster target){}
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
}