package Game;
import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private final String name;
    protected final int maxHealth;
    private int health;
    private final int attackPower;
    private final List<StatusEffect> effects = new ArrayList<>();

    protected Character(String name, int health, int attackPower) {
        if (health < 0 || attackPower < 0)
            throw new IllegalArgumentException("Health/Attack Power cannot be negative");
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.attackPower = attackPower;
    }

    public final String getName() { return name; }
    public final int getAttackPower() { return attackPower; }
    public final int getHealth() { return health; }

    protected final void setHealth(int value) {
        if (value < 0) value = 0;
        if (value > maxHealth) value = maxHealth;
        this.health = value;
    }

    protected int onIncomingDamage(int base) {
        int dmg = base;
        for (StatusEffect e : effects)
            if (!e.isExpired() && e instanceof Shield s)
                dmg = s.reduceDamage(dmg);
        return dmg;
    }

    public final boolean isAlive() { return health > 0; }

    public final void takeDamage(int dmg) {
        dmg = onIncomingDamage(dmg);
        setHealth(health - Math.max(0, dmg));
        System.out.println(name + " took " + dmg + " dmg (HP: " + health + "/" + maxHealth + ")");
    }

    public final void addEffect(StatusEffect e) {
        if (e != null) effects.add(e);
    }

    public final void performTurn(Character target) {
        for (StatusEffect e : effects) e.onTurnStart(this);
        if (isAlive()) attack(target);
        for (StatusEffect e : effects) e.onTurnEnd(this);
        effects.removeIf(StatusEffect::isExpired);
    }

    public abstract void attack(Character target);
}
