package Game;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player extends Character {
    private final int level;
    private AttackStrategy strategy;
    private final List<Skill> skills = new ArrayList<>();

    public Player(String name, int hp, int ap, int level, AttackStrategy strategy) {
        super(name, hp, ap);
        if (level <= 0) throw new IllegalArgumentException("Level must be positive");
        this.level = level;
        this.strategy = strategy;
    }

    public int getLevel() { return level; }
    public void addSkill(Skill s) { if (s != null) skills.add(s); }
    public void setStrategy(AttackStrategy s) { if (s != null) strategy = s; }

    @Override
    public void attack(Character target) {
        Random r = new Random();
        int dmg = strategy.computeDamage(this, target);

        for (Skill s : skills)
            if (s instanceof PiercingStrike ps && r.nextBoolean()) {
                s.apply(this, target);
                dmg = (int) (dmg * ps.getMultiplier());
            }

        System.out.println(getName() + " strikes dealing " + dmg);
        target.takeDamage(dmg);
    }

    public void heal(int amount) {
        int before = getHealth();
        setHealth(before + amount);
        System.out.println(getName() + " heals " + (getHealth() - before) + " HP (" + getHealth() + "/" + maxHealth + ")");
    }
}
