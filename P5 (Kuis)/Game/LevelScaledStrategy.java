package Game;
public class LevelScaledStrategy implements AttackStrategy {
    private final int bonusPerLevel;
    public LevelScaledStrategy(int bonusPerLevel) { this.bonusPerLevel = bonusPerLevel; }

    @Override
    public int computeDamage(Character self, Character target) {
        if (self instanceof Player p)
            return p.getAttackPower() + p.getLevel() * bonusPerLevel;
        return self.getAttackPower();
    }
}