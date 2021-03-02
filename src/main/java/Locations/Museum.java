package Locations;
import Interfaces.Visitable;
import Abstract.Location;
import Interfaces.Payable;
import java.time.LocalTime;
import java.util.Map;

public class Museum extends Location implements Visitable, Payable {
    private LocalTime openingTime, closingTime;
    private double ticketPrice;

//--------------------Constructors
    public Museum( ) {
        super();
    }
    public Museum(String name, Map<Location, Integer> cost, LocalTime openingTime, LocalTime closingTime, double ticketPrice) {
        super( name, cost );
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.ticketPrice = ticketPrice;
    }

//--------------------Getters
    @Override
    public double getTicketPrice( ) {
        return ticketPrice;
    }
    @Override
    public LocalTime getOpeningTime( ) {
        return openingTime;
    }
    @Override
    public LocalTime getClosingTime( ) {
        return closingTime;
    }

//--------------------Setters
    @Override
    public void setOpeningTime(LocalTime time ) {
        this.openingTime=time;
    }
    @Override
    public void setClosingTime(LocalTime time ) {
        this.closingTime=time;
    }
    @Override
    public void setTicketPrice(double price ) {
        this.ticketPrice=price;
    }

}

