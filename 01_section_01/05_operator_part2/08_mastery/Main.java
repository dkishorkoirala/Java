/*Challenge

You're creating a smart home security system. The system needs to use De Morgan's Law to evaluate different security conditions properly.

Initialize these variables:
motionDetected = true
doorLocked = false
windowsClosed = true
alarmActive = true
nightTime = true

Create these security conditions (some using De Morgan's Law):
isSecure: Home is secure if NOT (door is unlocked AND motion is detected)
needsAttention: Home needs attention if NOT (windows are closed OR alarm is active)
isHighRisk: High risk if NOT (door is locked AND windows are closed) AND it's night time
shouldAlert: We should alert if the home is NOT secure OR it needs attention*/
public class Main {
    public static void main(String[] args) {
        boolean motionDetected = true;
        boolean doorLocked = false;
        boolean windowsClosed = true;
        boolean alarmActive = true;
        boolean nightTime = true;

        boolean isSecure = !(!doorLocked && motionDetected);
        boolean needsAttention = !(windowsClosed || alarmActive);
        boolean isHighRisk = !(doorLocked && windowsClosed) && nightTime;
        boolean shouldAlert = !(isSecure || needsAttention);

        System.out.println("Smart Home Security Status:");
        System.out.println("-------------------------");
        System.out.println("Home is Secure: " + isSecure);
        System.out.println("Needs Attention: " + needsAttention);
        System.out.println("High Risk Situation: " + isHighRisk);
        System.out.println("Alert Required: " + shouldAlert);
    }
}
