package Game;

public class Regen implements StatusEffect {
    private final int healPerTurn;
    private int remaining;

    public Regen(int healPerTurn, int duration) {
        this.healPerTurn = healPerTurn;
        this.remaining = duration;
    }

    @Override
    public void onTurnStart(Character self) {}

    @Override
    public void onTurnEnd(Character self) {
        if (remaining > 0 && self.isAlive()) {
            self.setHealth(self.getHealth() + healPerTurn);
            System.out.println(self.getName() + " regenerates +" + healPerTurn + " HP (" + remaining + " turn left)");
        }
        remaining--;
    }

    @Override
    public boolean isExpired() { return remaining <= 0; }
}