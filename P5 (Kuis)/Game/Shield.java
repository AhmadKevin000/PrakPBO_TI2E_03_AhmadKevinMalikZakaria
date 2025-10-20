package Game;

public class Shield implements StatusEffect {
    private final int reduce;
    private int remaining;

    public Shield(int reduce, int duration) {
        this.reduce = reduce;
        this.remaining = duration;
    }

    public int reduceDamage(int base) {
        return Math.max(0, base - reduce);
    }

    @Override
    public void onTurnStart(Character self) {}

    @Override
    public void onTurnEnd(Character self) {
        remaining--;
        if (remaining >= 0)
            System.out.println(self.getName() + "'s shield absorbs " + reduce + " dmg (" + remaining + " left)");
    }

    @Override
    public boolean isExpired() { return remaining <= 0; }
}