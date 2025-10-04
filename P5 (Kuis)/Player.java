public class Player extends Character {
    private int level;
    private int maxHealth;

    public Player(String name, int health, int attackPower, int level) {
        super(name, health, attackPower);
        this.level = level;
        this.maxHealth = health;
    }

    public void heal(int amount) {
        int oldHealth = getHealth();
        int newHealth = oldHealth + amount;

        if (newHealth > maxHealth) {
            newHealth = maxHealth;
        }

        setHealth(newHealth);
        System.out.println(getName() + " heals for " + (newHealth - oldHealth) + " HP! Current health: " + getHealth());
    }

    @Override
    public void attack(Character target) {
        int damage = (int)(super.getHealth() * 0.1) + level;
        System.out.println(getName() + " attacks with sword! Damage: " + damage);
        target.takeDamage(damage);
    }
}
