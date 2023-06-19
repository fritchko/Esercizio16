public class House {
    private String address;
    private int numberOfFloors;

    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("House object was created.\nAddress is: " + address + ". The house has " + numberOfFloors + " floors.\n");
    }


}
