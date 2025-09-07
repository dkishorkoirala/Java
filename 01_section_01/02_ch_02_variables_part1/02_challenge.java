/*Challenge

You're creating a weather tracking program. Initialize multiple variables to store different aspects of the weather:

Create these integer variables:
    temperature with value 28
    humidity with value 65
    windSpeed with value 15
Create these decimal (double) variables:
    morningTemp with value 22.5
    afternoonTemp with value 28.8
    eveningTemp with value 23.4
The program will automatically print all values in this format:
Current Temperature: [temperature]
Humidity Level: [humidity]
Wind Speed: [windSpeed]
Morning Temperature: [morningTemp]
Afternoon Temperature: [afternoonTemp]
Evening Temperature: [eveningTemp]*/

public class Main{
    public static void main(String[] args){
        int temperature = 28;
        int humidity = 65;
        int windSpeed = 15;

        double morningTemp = 22.5;
        double afternoonTemp = 28.8;
        double eveningTemp = 23.4;

        System.out.println("Current Temperature: " + temperature);
        System.out.println("Humidity Level: " + humidity);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Morning Temperature: " + morningTemp);
        System.out.println("Afternoon Temperature: " + afternoonTemp);
        System.out.println("Evening Temperature: " + eveningTemp);
    }
}