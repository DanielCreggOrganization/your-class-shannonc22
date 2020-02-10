public class Main {

    public static void main(String[] args) {

        Car carObject1 = new Car();
        carObject1.manufacturer = "Audi";
        System.out.println(carObject1.manufacturer);

         Car carObject2 = new Car();
         carObject2.colour = "red";
         System.out.println(carObject2.colour);

         Car carObject3 = new Car();
         carObject3.seats = 5;
         System.out.println(carObject3.seats);

         Car carObject4 = new Car();
         carObject4.year = 2001;
         System.out.println(carObject4.year);


         Car carObject21 = new Car();
         carObject21.manufacturer = "mercedes";
         System.out.println(carObject21.manufacturer);

        Car carObject22 = new Car();
         carObject22.colour = "blue";
         System.out.println(carObject22.colour);

         Car carObject23 = new Car();
         carObject23.seats = 2;
         System.out.println(carObject23.seats);

         Car carObject24 = new Car();
         carObject24.year = 2018;
         System.out.println(carObject24.year);

       carObject3.reduceSeats();
       System.out.println(carObject3.seats);
             
         
    }
    
}