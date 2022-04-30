package ua.lviv.iot.models;

public class IcyArena extends SportFacilities {

    private final int theNumberOfDepartmentsOfTheSportsComplex;

    public IcyArena(int capacity, String name, String typeOfGround, String typeOfSport, int theNumberOfDepartmentsOfTheSportsComplex) {

        super(capacity, name, typeOfGround, typeOfSport);

        this.capacity = capacity;

        this.name = name;

        this.typeOfGround = typeOfGround;

        this.typeOfSport = typeOfSport;

        this.theNumberOfDepartmentsOfTheSportsComplex = 8;
    }


    public int getCapacity(){
        return capacity;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }

    public int getTheNumberOfDepartmentsOfTheSportsComplex() {
        return theNumberOfDepartmentsOfTheSportsComplex;
    }


    @Override
    public String toString() {
        return "Icy_arena{" +
                "the_number_of_departments_of_the_sports_complex=" + theNumberOfDepartmentsOfTheSportsComplex +
                ", capacity=" + capacity +
                ", name='" + name + '\'' +
                ", type_of_ground='" + typeOfGround + '\'' +
                ", type_of_sport='" + typeOfSport + '\'' +
                '}';
    }
}
