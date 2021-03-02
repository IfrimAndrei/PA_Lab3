package Interfaces;
import java.time.LocalTime;

public interface Visitable {
    LocalTime getOpeningTime();
    LocalTime getClosingTime();

    void setOpeningTime(LocalTime time);
    void setClosingTime(LocalTime time);

}
