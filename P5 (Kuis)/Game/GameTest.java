package Game;
import java.util.List;

public class GameTest {
    public static void main(String[] args) {
        Player p = new Player("Golden Knight", 120, 25, 5, new LevelScaledStrategy(2));
        p.addSkill(new HealSkill(15));
        p.addSkill(new PiercingStrike(1.2));
        p.addEffect(new Shield(10, 3));
        p.addEffect(new Regen(8, 4));

        Enemy boss = new BossMonster("Kraken", 150, 28, 5, new FixedStrategy());
        Enemy goblin = new Monster("Goblin", 80, 12, 2, new FixedStrategy());

        Battle battle = new Battle(List.of(p), List.of(boss, goblin));
        battle.run();
    }
}