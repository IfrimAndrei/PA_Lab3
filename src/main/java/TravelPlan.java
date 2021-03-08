import Abstract.Location;
import Interfaces.Payable;
import Interfaces.Visitable;
import Locations.Church;
import Locations.Hotel;
import Locations.Museum;
import Locations.Restaurant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TravelPlan {
    public static void execute() {
        City myCity = new City();
        boolean[][] pref=new boolean[6][6];//daca pref[v1][v2]=true <=> v1->v2 este una din preferinte

        int numberOfLocations=6;
        initCity( myCity,pref);
        shortestPath( myCity,pref,numberOfLocations);
    }
    public static void initCity(City myCity,boolean[][] pref)
    {

        Hotel v1 =new Hotel();
        Museum v2 = new Museum();
        Museum v3 = new Museum();
        Church v4 = new Church();
        Church v5 = new Church();
        Restaurant v6 = new Restaurant();
        v1.setCost(v2,10  );
        v1.setCost( v3,50 );
        v2.setCost( v3,20 );
        v2.setCost( v4,20 );
        v3.setCost( v4, 20 );
        v4.setCost( v5,30 );
        v4.setCost( v6,10 );
        v5.setCost( v4, 30);
        v5.setCost( v6,20 );
        v1.setName( "v1" );
        v2.setName("v2");
        v3.setName("v3");
        v4.setName("v4");
        v5.setName("v5");
        v6.setName("v6");
        myCity.addLocation( v1 );
        myCity.addLocation( v2 );
        myCity.addLocation( v3 );
        myCity.addLocation( v4 );
        myCity.addLocation( v5 );
        myCity.addLocation( v6 );

    }
    public static void shortestPath(City myCity,boolean[][] pref,int numberOfLocations) {
        int[][] costPath = new int[numberOfLocations][numberOfLocations];
        String[][] namePath = new String[numberOfLocations][numberOfLocations];
        final int INFINITY = 100_000_000;

        for ( Location i : myCity.getNodes() ) {
            for ( Location j : myCity.getNodes() ) {
                if ( i.getCost().get( j ) != null ) {
                    int x=myCity.getNodes().indexOf( i );
                    int y=myCity.getNodes().indexOf( j );
                    costPath[x][y] = i.getCost().get( j );
                    namePath[x][y] = (myCity.getNodes().get( x )).getName()  + "->" + (myCity.getNodes().get( y )).getName();
                }
                else
                    costPath[myCity.getNodes().indexOf( i )][myCity.getNodes().indexOf( j )] = INFINITY;
            }
        }

        /* Parcurgere pentru verificarea matricei
        for ( int i = 0 ; i < numberOfLocations ; i++ )
        {
            for ( int j = 0 ; j < numberOfLocations ; j++ )
                System.out.print( costPath[i][j] + " ");
            System.out.println();
        }*/

        for ( int i = 0 ; i < numberOfLocations ; i++ )
            for ( int j = 0 ; j < numberOfLocations ; j++ )
                for ( int k = 0 ; k < numberOfLocations ; k++ )
                    if ( i != j && i != k && j != k )
                        if ( costPath[i][j] > costPath[i][k] + costPath[k][j] ) {
                            costPath[i][j] = costPath[i][k] + costPath[k][j];
                            namePath[i][j] = namePath[i][k] + "\n" + namePath[k][j];

                        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti numele nodului din care vreti sa porniti : ");
        String inputFirstValue = myObj.nextLine();
        System.out.println("Introduceti numele nodului din care vreti sa ajungeti : ");
        String inputSecondValue = myObj.nextLine();

        int loc1=0,loc2=0;
        for ( Location i : myCity.getNodes() )
            if ( i.getName().equals( inputFirstValue ) )
                loc1= myCity.getNodes().indexOf( i );
            else if ( i.getName().equals( inputSecondValue ) )
                loc2 = myCity.getNodes().indexOf( i );

        if( costPath[loc1][loc2] == INFINITY )
            System.out.println("Nu exista drum intre cele doua locatii.");
        else
        {
            System.out.println("Drumul minim de la " + inputFirstValue + " la " +inputSecondValue + " este :\n" + namePath[loc1][loc2]);
            System.out.println("Costul drumului este : " + costPath[loc1][loc2]);
        }

    }
}
