import Abstract.Location;
import java.util.ArrayList;
import java.util.List;

public class City {
    private List<Location> nodes = new ArrayList<>();
//--------------------Constructors
    public City(List<Location> nodes) {
        this.nodes = nodes;
    }

//--------------------Getters
    public List<Location> getNodes( ) {
        return nodes;
    }

//--------------------Setters
    public void setNodes(List<Location> nodes) {
        this.nodes = nodes;
    }

    public void addLocation(Location node) {
        nodes.add(node);
    }

    @Override
    public String toString( ) {
        return "City{" +
                "nodes=" + nodes +
                '}';
    }

}