package Game;
import java.util.*;

public class Battle {
    private final List<Character> teamA;
    private final List<Character> teamB;

    public Battle(List<Character> teamA, List<Character> teamB) {
        this.teamA = new ArrayList<>(teamA);
        this.teamB = new ArrayList<>(teamB);
    }

    private boolean anyAlive(List<Character> list) {
        return list.stream().anyMatch(Character::isAlive);
    }

    private Character highestHP(List<Character> list) {
        return list.stream().filter(Character::isAlive)
                .max(Comparator.comparingInt(Character::getHealth)).orElse(null);
    }

    private Enemy targetEnemy(List<Character> enemies) {
        return enemies.stream()
                .filter(c -> c instanceof Enemy && c.isAlive())
                .map(c -> (Enemy) c)
                .max(Comparator.comparingInt(Enemy::getThreatLevel)
                        .thenComparingInt(Enemy::getHealth))
                .orElse(null);
    }

    public void run() {
        int turn = 1;
        System.out.println("=== Battle Start ===");

        while (anyAlive(teamA) && anyAlive(teamB)) {
            System.out.println("\n-- TURN " + turn + " --");

            for (Character c : teamA) {
                if (!c.isAlive()) continue;
                Character target = targetEnemy(teamB);
                if (target == null) break;
                System.out.println("[Team A] " + c.getName() + " -> " + target.getName());
                c.performTurn(target);
                if (!anyAlive(teamB)) break;
            }

            if (!anyAlive(teamB)) {
                System.out.println("\n=== Battle End ===");
                System.out.println("Team A Wins!");
                return;
            }

            for (Character c : teamB) {
                if (!c.isAlive()) continue;
                Character target = highestHP(teamA);
                if (target == null) break;
                System.out.println("[Team B] " + c.getName() + " -> " + target.getName());
                c.performTurn(target);
                if (!anyAlive(teamA)) break;
            }

            if (!anyAlive(teamA)) {
                System.out.println("\n=== Battle End ===");
                System.out.println("Team B Wins!");
                return;
            }

            turn++;
        }

        System.out.println("\n=== Battle End ===");
        System.out.println(anyAlive(teamA) ? "Team A Wins!" : "Team B Wins!");
    }
}