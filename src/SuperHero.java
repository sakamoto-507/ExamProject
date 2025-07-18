public class SuperHero extends Hero {
    public SuperHero(String name, int hp, String weaponName) {
        super(name, hp, weaponName);
    }

    public void attack(Creature target) {
        System.out.println(getName() + "は" + getWeaponName() + "で攻撃！" + target.getName() + "に25のダメージを与えた");
        if (target.getHp() - 25 <= 0) {
            target.setHp(0);
        } else {
            target.setHp(target.getHp() - 25);
        }
    }
}