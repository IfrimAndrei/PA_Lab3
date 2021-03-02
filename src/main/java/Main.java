import Interfaces.Visitable;
import Locations.Church;
import Locations.Hotel;
import Locations.Museum;
import Locations.Restaurant;

import java.time.LocalTime;


public class Main {
    public static void main(String arggs[]) {
        Hotel v1 =new Hotel();
        Museum v2 = new Museum();
        Museum v3 = new Museum();
        Church v4 = new Church();
        Church v5 = new Church();
        Restaurant v6 = new Restaurant();

        Museum m = new Museum();
        m.setOpeningTime( LocalTime.of(9, 30)); //9:30
        m.setClosingTime(LocalTime.parse("17:00"));
        m.setTicketPrice(20);

        System.out.println("Opening time: " + m.getOpeningTime() + "\nClosing time: " + m.getClosingTime() + "\nTicket price: " + m.getTicketPrice());

        Church c = new Church();
        c.setOpeningTime(LocalTime.of(7, 0));
        c.setClosingTime(LocalTime.MIDNIGHT);
        Visitable[] arr = {m, c};
    }
}