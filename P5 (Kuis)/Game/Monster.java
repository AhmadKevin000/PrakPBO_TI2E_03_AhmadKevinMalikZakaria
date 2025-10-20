package Game;
public class Monster extends Enemy {
    private String type;

    public Monster(String name, int hp, int ap, int threat, AttackStrategy strategy) {
        super(name, hp, ap, threat, strategy);
        this.type = "Monster";
    }

    public void setType(String t) { this.type = t; }
    public String getType() { return type; }

    @Override
    public void attack(Character target) {
        int dmg = strategy.computeDamage(this, target);
        System.out.println(getName() + " (" + type + ") attacks ferociously for " + dmg);
        target.takeDamage(dmg);
    }
}