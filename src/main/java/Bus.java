import java.util.ArrayList;

public class Bus {

    private String name;
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String name, String destination, int capacity){
        this.name = name;
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getName() {
        return this.name;
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int numberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (numberOfPassengers() < this.capacity ){
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }
}
