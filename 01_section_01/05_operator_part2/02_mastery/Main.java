/*Challenge


You're creating a game character status system. The character has various status conditions that need to be checked using logical operators.

Start with these status conditions:
hasShield is true
hasWeapon is true
isInjured is false
hasPotion is false

Create these boolean conditions using logical operators:
canFight: True if character has weapon AND is not injured
needsHealing: True if character is injured OR doesn't have shield
isVulnerable: True if character doesn't have shield AND doesn't have weapon
shouldUsePotion: True if character has potion AND is injured
isReadyForBattle: True if character has weapon AND has shield AND is not injured */

public class Main {
    public static void main(String[] args) {
        // Initial status conditions - don't modify these!
        boolean hasShield = true;
        boolean hasWeapon = true;
        boolean isInjured = false;
        boolean hasPotion = false;

        // Create your boolean conditions below
        boolean canFight = hasWeapon && !isInjured;
        boolean needsHealing = isInjured || !hasShield;
        boolean isVulnerable = !hasShield && !hasWeapon;
        boolean shouldUsePotion = hasPotion && isInjured;
        boolean isReadyForBattle = hasWeapon && hasShield && !isInjured;

        // Don't modify the code below
        System.out.println("Character Status Check:");
        System.out.println("---------------------");
        System.out.println("Can Fight: " + canFight);
        System.out.println("Needs Healing: " + needsHealing);
        System.out.println("Is Vulnerable: " + isVulnerable);
        System.out.println("Should Use Potion: " + shouldUsePotion);
        System.out.println("Ready for Battle: " + isReadyForBattle);
    }
}
