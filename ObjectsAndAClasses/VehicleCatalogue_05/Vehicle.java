package ObjectsAndAClasses.VehicleCatalogue_05;

public class Vehicle {
    private String typeOfVehicle;
    private String model;
    private String colour;
    private int horsepower;


    public Vehicle(String typeOfVehicle, String model, String colour, int horsepower){
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.colour = colour;
        this.horsepower = horsepower;
    }

    public String getTypeOfVehicle() {
        return this.typeOfVehicle;
    }
    public String getModel(){
        return this.model;
    }
    public String getColour(){
        return this.colour;
    }
    public int getHorsepower(){
        return this.horsepower;
    }
}
