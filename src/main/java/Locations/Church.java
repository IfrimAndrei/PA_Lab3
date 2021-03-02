package Locations;
import Interfaces.Visitable;
import Abstract.Location;
import java.time.LocalTime;
import java.util.Map;

public class Church extends Location implements Visitable {
    private LocalTime openingTime, closingTime;

//--------------------Constructors
    public Church()  {
        super();
    }
    public Church(String name, Map<Location, Integer> cost, LocalTime openingTime, LocalTime closingTime) {
        super( name, cost );
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    //--------------------Getters
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

}
