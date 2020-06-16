public class Bus {

    private String name;
    private String destination;
    private int capacity;

    public Bus(String name, String destination, int capacity){
        this.name = name;
        this.destination = destination;
        this.capacity = capacity;
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
}

