public class Telephone {
  String brand;
  double resolution;
  int number;

  Telephone(String brand, double resolution, int number) {
    this.brand = brand;
    this.resolution = resolution;
    this.number = number;
  }

  String sendMessage(String sms, int number){
    return  "Send message: "  + sms  + " to " + number;

  }
}
