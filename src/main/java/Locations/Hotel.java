package Locations;
import Interfaces.Classifiable;
import Abstract.Location;
import Interfaces.Payable;
import java.util.Map;

public class Hotel extends Location implements  Payable, Classifiable {
    private double ticketPrice;
    private String rank;

//--------------------Constructors
    public Hotel( ) {
        super();
    }
    public Hotel(String name, Map<Location, Integer> cost, double ticketPrice, String rank) {
        super( name, cost );
        this.ticketPrice = ticketPrice;
        this.rank = rank;
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

//--------------------Setters
    @Override
    public void setRank(String rank) {
        this.rank=rank;
    }
    @Override
    public void setTicketPrice(double price) {
        this.ticketPrice=price;
    }
}
