import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	Bike rizerPhantom_3 = new Bike(32,2,"USA");// Ввести передачу и время(ч)

        rizerPhantom_3.calculationParametrs();

        System.out.println(rizerPhantom_3.toString());

        rizerPhantom_3.allSpeedsBike();

        System.out.println("");


        Bike arrayWay = new Bike(33,1,"USA");

        arrayWay.allWay();

        System.out.println("");

        arrayWay.sortArray();

        System.out.println("");

        arrayWay.standartSort();

        System.out.println("");

        arrayWay.foreach();

        System.out.println("_________");
// 8 пункт


        System.out.println(Bike.countryMade); //статик

//      System.out.println(Bike.type); non static

        System.out.println(rizerPhantom_3.type);

        Bike.brend();

        Bike zaskar_GT = new Bike(21,99,"USA"); // time - final

        zaskar_GT.calculationParametrs();

        System.out.println(zaskar_GT.toString());

        zaskar_GT.changeNumberOfSpeed();// non static field

        System.out.println(zaskar_GT.toString());

        Bike.changeCountryMade(); // change static field

        System.out.println(Bike.countryMade);

        Bike avalanche_GT = new Bike(28,1.5,"USA");

        avalanche_GT.changeNumberOfSpeed();

        System.out.println(avalanche_GT.toString());



    }
}
