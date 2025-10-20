package Game;

public class PiercingStrike implements Skill {
    private final double multiplier;
    public PiercingStrike(double multiplier) { this.multiplier = multiplier; }
    public double getMultiplier() { return multiplier; }

    @Override
    public String name() { return "PiercingStrike(x" + multiplier + ")"; }

    @Override
    public void apply(Character self, Character target) {
        System.out.println(self.getName() + " uses Piercing Strike!");
    }
}