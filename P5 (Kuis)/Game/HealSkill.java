package Game;

public class HealSkill implements Skill {
    private final int amount;
    public HealSkill(int amount) { this.amount = amount; }

    @Override
    public String name() { return "HealSkill(+" + amount + ")"; }

    @Override
    public void apply(Character self, Character target) {
        if (self instanceof Player p) p.heal(amount);
    }
}