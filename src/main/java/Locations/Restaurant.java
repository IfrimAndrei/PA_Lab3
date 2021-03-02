package Locations;
import Abstract.Location;
import Interfaces.Classifiable;
import Interfaces.Payable;
import Interfaces.Visitable;
import java.time.LocalTime;
import java.util.Map;

public class Restaurant extends Location implements Payable, Classifiable, Visitable {
    private double ticketPrice;
    private String rank;
    private LocalTime openingTime, closingTime;

    //--------------------Constructors
    public Restaurant( ) {
        super();
    }
    public Restaurant(String name, Map<Location, Integer> cost, double ticketPrice, String rank, LocalTime openingTime, LocalTime closingTime) {
        super( name, cost );
        this.ticketPrice = ticketPrice;
        this.rank = rank;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    //--------------------Getters
    @Override
    public String getRank( ) {
        return rank;
    }
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
    public void setRank(String rank) {
        this.rank=rank;
    }
    @Override
    public void setTicketPrice(double price) {
        this.ticketPrice=price;
    }
    @Override
    public void setOpeningTime(LocalTime time) {
        this.openingTime=time;
    }
    @Override
    public void setClosingTime(LocalTime time) {
        this.closingTime=time;
    }
}