/*Challenge

You're building a system status dashboard. Create multiple boolean variables to track different system states:

Create these boolean variables with the specified values:
    isServerOnline with value true
    isMaintenanceMode with value false
    hasBackup with value true
    isUpdating with value false
    isDatabaseConnected with value true
    needsRestart with value false
Pay attention to:
    Correct variable names (exactly as shown)
    Using only true or false values
    Proper boolean declaration syntax
The program will display the system status using these variables. */

public class Main{
    public static void main(String[] args){
        boolean isServerOnline = true;
        boolean isMaintenanceMode = false;
        boolean hasBackup = true;
        boolean isUpdating = false;
        boolean isDatabaseConnected = true;
        boolean needsRestart = false;

         System.out.println("Server Status:");
        System.out.println("-------------");
        System.out.println("Server Online: " + isServerOnline);
        System.out.println("Maintenance Mode: " + isMaintenanceMode);
        System.out.println("Backup Available: " + hasBackup);
        System.out.println("Update in Progress: " + isUpdating);
        System.out.println("Database Connected: " + isDatabaseConnected);
        System.out.println("Restart Required: " + needsRestart);
    }
}