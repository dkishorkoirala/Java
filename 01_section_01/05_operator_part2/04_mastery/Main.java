/*Challenge


You're creating a security system with multiple sensors. Calculate if the system should trigger an alarm based on different sensor combinations.

Start with these sensor states:

motionDetected is true
doorOpen is false
windowOpen is true
systemArmed is true
Create these security conditions using logical operators:

alarmTrigger1: True if system is armed AND (motion is detected OR door is open)
alarmTrigger2: True if system is armed AND window is open AND NOT door is open
alarmTrigger3: True if NOT system is armed OR (NOT motion is detected AND NOT window is open)*/
public class Main {
    public static void main(String[] args) {
        boolean motionDetected = true;
        boolean doorOpen = false;
        boolean windowOpen = true;
        boolean systemArmed = true;

        boolean alarmTrigger1 = systemArmed && (motionDetected || !(doorOpen));
        boolean alarmTrigger2 = systemArmed && windowOpen && !doorOpen;
        boolean alarmTrigger3 = !systemArmed || (!motionDetected && !windowOpen);

        System.out.println("Security System Status:");
        System.out.println("---------------------");
        System.out.println("Alarm Trigger 1: " + alarmTrigger1);
        System.out.println("Alarm Trigger 2: " + alarmTrigger2);
        System.out.println("Alarm Trigger 3: " + alarmTrigger3);
    }
}
