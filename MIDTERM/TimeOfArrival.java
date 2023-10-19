import java.util.Scanner;

class TimeOfArrival {

   public static void main(String[] args) {
   
  double totalDistance1 = 84.9;
  double totalDistance2 = 101.3;
  double totalDistance3 = 108;
   
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter your starting point:  ");
    String sp = s.next();
    
   System.out.println("Enter your destination:  ");
   String destination = s.next();
   
   System.out.println("Enter your route:  ");
   String route = s.next();

   System.out.println("Enter your speed:  ");
   double speed = s.nextInt();
   
   switch (route) {
   case "Route1":
   //84.9km
   System.out.println("Cebu City To Minglanilla - Route1.1");
System.out.println("Minglanilla To San Fernando - Route2");
System.out.println("San Fernando To CarCar- Route3");
System.out.println("CarCar To Barili - Route4.1");
System.out.println("Barili To Dumanjug - Route4.1.1");
System.out.println("Dumanjug To Alcantara - Route4.1.2");
System.out.println("Alcantara To Moalboal - Route4.1.3");
 
   System.out.println();
   break;
   case "Route2":
   //101.3km
    System.out.println("Cebu City To Minglanilla");
System.out.println("Minglanilla To San Fernando");
System.out.println("San Fernando To CarCar");
 System.out.println("Carcar To Sibonga");
 System.out.println("Sibonga To Dumanjug");
 System.out.println("Dumanjug To Alcantara");
System.out.println("Alcantara To Moalboal");
break;
case "Route3":
//108km
System.out.println("Cebu City To Minglanilla");
System.out.println("Minglanilla To San Fernando");
System.out.println("San Fernando To CarCar");
 System.out.println("Carcar To Sibonga");
  System.out.println("Sibonga To Argao");
 System.out.println("Argao To Ronda");
 System.out.println("Ronda To Alcantara");
 System.out.println("Alcantara To Moalboal");
break;
default:
System.out.println("Cebu City To Minglanilla");
System.out.println("Minglanilla To San Fernando");
System.out.println("San Fernando To CarCar");
System.out.println("CarCar To Barili");
System.out.println("Barili To Dumanjug");
System.out.println("Dumanjug To Alcantara");
System.out.println("Alcantara To Moalboal");
break;
}
double timeOfArrival = totalDistance1 /(double) speed;


int hours = (int)timeOfArrival;
int minutes= (int)(timeOfArrival*60) %60;
    
    
      System.out.println("Starting Point : " + sp);
    System.out.println("Destination : " + destination);
     System.out.println();
     System.out.println();
    System.out.println("Speed :  " + speed + " km/hr");
     System.out.println("Total Distance : " + totalDistance1 + " km");
     
     System.out.println(hours + " Hr."+ minutes + " mins.");
   }
}