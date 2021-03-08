import Abstract.Location;
import Interfaces.Payable;
import Interfaces.Visitable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {
    private List<Location> nodes = new ArrayList<>();
//--------------------Constructors
    public City(){}
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

    public void displayFreeVisit()
    {
        List<Location> freeNodes = new ArrayList<>();
        for(Location i : nodes)
        {
            if( i instanceof Visitable && !(i instanceof Payable) )
            {
                freeNodes.add(i);
            }
        }

        for(Location i: freeNodes)
            for(Location j : freeNodes)
            {
                if(((Visitable)i).getOpeningTime().compareTo(((Visitable)j).getOpeningTime()) > 0)
                {
                    Collections.swap(freeNodes,freeNodes.indexOf(i),freeNodes.indexOf(j));
                }
            }

        System.out.println(freeNodes);
    }


    @Override
    public String toString( ) {
        return "City{" +
                "nodes=" + nodes +
                '}';
    }

}