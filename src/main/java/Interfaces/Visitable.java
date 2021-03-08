package Interfaces;
import Abstract.Location;

import java.time.Duration;
import java.time.LocalTime;

public interface Visitable {

    LocalTime getOpeningTime();
    LocalTime getClosingTime();

    void setOpeningTime(LocalTime time);
    void setClosingTime(LocalTime time);

    static Duration getVisitingDuration(Visitable obj)
    {
        return (Duration.between(obj.getClosingTime(),obj.getOpeningTime()));
    }

    default LocalTime defaultOT()
    {
        return ( LocalTime.of(9, 30));
    }

    default LocalTime defaultCT()
    {
        return ( LocalTime.of(20, 00));
    }

}
