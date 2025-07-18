public class Hero extends Character {
    private String weapon;

    public void setWeapon(String weaponName) {
        weapon = weaponName;
    }

    public String getWeaponName() {
        return weapon;
    }
    public Hero(String name, int hp, String weaponName) {
        super(name, hp);
        setWeapon(weaponName);
    }

    public void attack(Creature target) {
        System.out.println(getName() + "は" + getWeaponName() + "で攻撃！" + target.getName() + "に10のダメージを与えた");
        if (target.getHp() - 10 <= 0) {
            target.setHp(0);
        } else {
            target.setHp(target.getHp() - 10);
        }
    }
}