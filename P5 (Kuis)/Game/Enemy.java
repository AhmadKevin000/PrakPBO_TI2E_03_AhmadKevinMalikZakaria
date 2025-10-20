package Game;
public abstract class Enemy extends Character {
    private int threatLevel;
    protected AttackStrategy strategy;

    protected Enemy(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap);
        if (threatLevel < 1 || threatLevel > 5)
            throw new IllegalArgumentException("ThreatLevel must be 1–5");
        if (strategy == null)
            throw new IllegalArgumentException("Strategy cannot be null");
        this.threatLevel = threatLevel;
        this.strategy = strategy;
    }

    public int getThreatLevel() { return threatLevel; }
    public void setStrategy(AttackStrategy s) { if (s != null) this.strategy = s; }
}
