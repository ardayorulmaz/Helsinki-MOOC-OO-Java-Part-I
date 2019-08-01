
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());
        // BoundedCounter minutes = new BoundedCounter(59);
        // BoundedCounter hours = new BoundedCounter(23);

        //int i = 0;
        //  while (i < 121) {
        //      System.out.println(hours + ":" + minutes);
        //   if (minutes.getValue() == 59) {
        //        hours.next();
        //   }
        //  minutes.next();// the current time printed
        //   advance minutes
        //  if minutes 
        //       become 
        //   zero, advance hours i
        //  ++;
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        int i = 0;
        while (i < 112) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();

            if (seconds.getValue() == 00) {
                minutes.next();
                if (minutes.getValue() == 00) {
                    hours.next();
                }
            }

            i++;
        }

    }

}
