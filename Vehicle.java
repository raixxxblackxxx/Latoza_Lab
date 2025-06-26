import java.util.Scanner;
 
 class Vehicle {
    private String brand;
    private String fuelType;
    private int speed;

    public Vehicle (String brand, String fuelType, int speed) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.speed = speed;

    }

    public String getBrand(){
        return this.brand;
    }
    public String getfuelType(){
        return this.fuelType;
    }
    public int getspeed(){
        return this.speed;
    }
 
        public void displayInfo(){
            
            System.out.println("Brand: " + brand);
            System.out.println("Fuel Type: " + fuelType);
            System.out.println("Speed: " + speed);
        
        }
    
}
class VehicleDoors extends Vehicle{
    private int numDoors;

    public VehicleDoors (String brand, String fuelType, int speed, int numDoors){
        super ( brand,  fuelType,  speed);
        this.numDoors = numDoors;
    
        }
        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Number of Doors " + numDoors);
    }
}
class Motorcycle extends Vehicle {
    private boolean hasSidecar = false;

    public Motorcycle (String brand, String fuelType, int speed, boolean hasSidecar){
        super ( brand,  fuelType,  speed);
        this.hasSidecar = hasSidecar;
    }
    @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Motorcycle have a side car? " + hasSidecar);
    }
    
    public static void main (String[] args){
     Scanner scanner = new Scanner(System.in);   
        
        System.out.println("Please define your car:");

        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Fuel Type: ");
        String fuelType= scanner.nextLine();
        System.out.print("Speed: ");
        int speed = scanner.nextInt();
        System.out.print("Number of Doors: ");
        int numberOfDoors = scanner.nextInt();

        System.out.println("Your car is: " + brand);
        System.out.println("With a Fuel Type of: " + fuelType);
        System.out.println("Reaching speed of: " + speed + "km");
        System.out.println("You have a " + numberOfDoors + " doors");

    }
}



