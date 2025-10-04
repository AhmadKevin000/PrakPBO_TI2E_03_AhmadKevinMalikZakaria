public class BossMonster extends Monster {

    public BossMonster(String name, int health, int attackPower, String type) {
        super(name, health, attackPower, type);
    }

    @Override
    public void attack(Character target) {
        int damage = ((int)(Math.random() * 10) + 5) * 2;
        System.out.println(getName() + " (" + getType() + ") unleashes a SPECIAL ATTACK! Damage: " + damage);
        target.takeDamage(damage);
    }
}