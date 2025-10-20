package Game;

public class BossMonster extends Enemy {
    private int turnCounter = 0;

    public BossMonster(String name, int hp, int ap, int threat, AttackStrategy strategy) {
        super(name, hp, ap, threat, strategy);
    }

    @Override
    public void attack(Character target) {
        turnCounter++;
        int dmg = strategy.computeDamage(this, target);
        boolean rage = getHealth() < (maxHealth / 2) || turnCounter % 3 == 0;
        if (rage) {
            dmg *= 2;
            System.out.println(getName() + " enters RAGE STRIKE! (x2 dmg)");
        } else {
            System.out.println(getName() + " attacks normally.");
        }
        target.takeDamage(dmg);
    }
}