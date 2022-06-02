package ua.lviv.iot.models;

public class BasketballArena extends SportFacilities {

    private final String location;

    public BasketballArena(int capacity, String name, String type_of_ground, String type_of_sport, String location) {

        super(capacity, name, type_of_ground, type_of_sport);

        this.capacity = capacity;

        this.name = name;

        this.typeOfGround = type_of_ground;

        this.typeOfSport = type_of_sport;

        this.location = "Bucha";

    }

    public int getCapacity() {
        return capacity;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }


    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "BasketballArena{" +
                "location='" + location + '\'' +
                ", capacity=" + capacity +
                ", name='" + name + '\'' +
                ", typeOfGround='" + typeOfGround + '\'' +
                ", typeOfSport='" + typeOfSport + '\'' +
                '}';
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "location";
    }

    public String toCSV() {
        return super.toCSV() + "," + location;

    }
}






