package ua.lviv.iot.models;


public abstract class SportFacilities {

    public int capacity;
    public String name;
    public String typeOfGround;
    public String typeOfSport;




    public SportFacilities(int capacity, String name, String typeOfGround, String typeOfSport){

        this.capacity = capacity;

        this.name = name;

        this.typeOfGround = typeOfGround;

        this.typeOfSport = typeOfSport;

    }
    public int getCapacity(){
        return capacity;
    }

    public String getName(){
        return name;
    }

    public String getTypeOfGround() {
        return typeOfGround;
    }


    public String getTypeOfSport() {
        return typeOfSport;
    }

    @Override
    public String toString() {
        return "Sport_facilities{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", type_of_ground='" + typeOfGround + '\'' +
                ", type_of_sport='" + typeOfSport + '\'' +
                '}';
    }
}