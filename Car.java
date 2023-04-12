class Car {

  String colour;
  String brand;
  double engineCapacity;

  Car(String colour, String brand, double engineCapacity) {
    this.colour = colour;
    this.brand = brand;
    this.engineCapacity = engineCapacity;
  }

  public String getBrand(){
    return this.brand;
  }
 public String getColour(){
    return this.colour;
 }
 public void setEngineCapacity (double engineCapacity){
    this.engineCapacity = engineCapacity;
 }



  public void isEngineHighSpeed(){
   if (this.engineCapacity >= 2){
     System.out.println("Engine is high-speed");
   } else {
     System.out.println("Engine is low-speed");
   }
 }
}
