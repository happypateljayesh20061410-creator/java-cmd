class Car
{
    String carName;
    String brand;
    int price;

// Default Constructor
 Car()
 {
 this.carName = "Unknown";
this.brand = "Unknown";
this.price = 0;
}
 // Parameterized Constructor (Car Name, Brand, Price)
 Car(String carName, String brand, int price)
 {
this.carName = carName;
this.brand = brand;
this.price = price;
}
// Constructor with only Car Name
Car(String carName)
{
this(carName, "kia", 2000000);
}
// Method to display details
 void display()
{
 System.out.println("Car Name : " + carName);
 System.out.println("Brand    : " + brand);
  System.out.println("Price    : ₹" + price);
System.out.println();
}
 public static void main(String[] args)
 {
Car c1 = new Car();                     // Default constructor
Car c2 = new Car("GLC", "mercedes", 1500000); // Parameterized constructor
 Car c3 = new Car("carnival");           // Constructor using this()
 c1.display();
 c2.display();
c3.display();
}
}
