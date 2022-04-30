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

    public int getCapacity(){
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
        return "Basketball_arena{" +
                "location='" + location + '\'' +
                ", capacity=" + capacity +
                ", name='" + name + '\'' +
                ", type_of_ground='" + typeOfGround + '\'' +
                ", type_of_sport='" + typeOfSport + '\'' +
                '}';
    }
}
