/*Challenge

You're creating a simple role-playing game character class system. Create a switch statement that determines a character's special ability and starting stats based on their class number.

Character Classes and their abilities:

Warrior (Class 1):
Special Ability: "Sword Master"
Health: 100
Power: 8
Mage (Class 2):
Special Ability: "Spell Caster"
Health: 70
Power: 10
Archer (Class 3):
Special Ability: "Sharp Shooter"
Health: 80
Power: 9
Healer (Class 4):
Special Ability: "Life Giver"
Health: 60
Power: 7
Knight (Class 5):
Special Ability: "Shield Bearer"
Health: 90
Power: 8
For any invalid class number, set:

Special Ability: "Unknown"
Health: 50
Power: 5 */

public class Main {
    public static void main(String[] args) {
        // Don't modify these lines
        int classNumber = 3; // This will be different in each test
        String ability = "";
        int health = 0;
        int power = 0;

        // Write your switch statement here

        switch (classNumber) {
            case 1:
                ability = "Sword Master";
                health = 100;
                power = 8;
                break;
            case 2:
                ability = "Spell Caster";
                health = 70;
                power = 10;
                break;
            case 3:
                ability = "Sharp Shooter";
                health = 80;
                power = 9;
                break;
            case 4:
                ability = "Life Giver";
                health = 60;
                power = 7;
                break;
            case 5:
                ability = "Shield Bearer";
                health = 90;
                power = 8;
                break;
            default:
                ability = "Unknown";
                health = 50;
                power = 5;
        }

        // Don't modify the code below
        System.out.println("Character Creation:");
        System.out.println("-----------------");
        System.out.println("Class Number: " + classNumber);
        System.out.println("Special Ability: " + ability);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
    }
}