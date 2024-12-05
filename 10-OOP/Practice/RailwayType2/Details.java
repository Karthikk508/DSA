package Practice.RailwayType2;

public class Details {

    static int id = 1;
    int pId;
    int numberOfSeats;
    String number;
    char source;
    char destination;

    Details(char source,char destination,int numberOfSeats)
    {
        this.pId = id++;
        this.number = "PNR-"+pId;
        this.source = source;
        this.destination = destination;
        this.numberOfSeats = numberOfSeats;
    }



}
