import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;

    }


    public String getBusStopName() {
        return this.name;
    }
}
