import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Bike {

    public final String OWNER = "xCompany";
    public final  double DIAMETROFWHEEL = 27.5;
    public final double TIME=1.5;
    public static String countryMade;
    public int numberOfSpeeds;
    public String type = "mountain";
    static public double way;
    static private double speed;





    Bike(int numberOfSpeeds, double time, String countryMade) {
        if (numberOfSpeeds >= 34 || numberOfSpeeds < 0) {
            System.out.println("введите допустимое значение передачи в интервале от 0 до 33");
            return;
        }
        this.numberOfSpeeds = numberOfSpeeds;

        Bike.countryMade = countryMade;

    }

    public void calculationParametrs() {
        speed = numberOfSpeeds * 1.7;
        way = TIME * speed;
    }
// 1-2 пункт
    public void allSpeedsBike() {
        speed = 0;
        numberOfSpeeds = 0;
        while (numberOfSpeeds < 34) {
            speed = +numberOfSpeeds * 1.7;

            System.out.printf("на передаче " + numberOfSpeeds + " скорость равна - " + "%.1f", speed);
            numberOfSpeeds++;
            System.out.println("");
//             speed = 0;
//             numberOfSpeeds = 0;
//        do {
//
//            speed = +numberOfSpeeds * 1.7;
//
//            System.out.printf("на передаче " + numberOfSpeeds + " скорость равна - " + "%.1f", speed);
//            numberOfSpeeds++;
//            System.out.println("");
//        }while (numberOfSpeeds<34);


        }
    }

    @Override
    public String toString() {
        return "Bike{" +
                "numberOfSpeeds=" + numberOfSpeeds +
                ", speed=" + speed +
                ", time=" + TIME +
                ", way=" + way +
                '}';
    }
// 3 пункт
    double[] arrayWay = new double[13];

    public void allWay() {

        for (int i = 0; i < arrayWay.length; i++) {
//            arrayWay[i] =  (Math.random() * 100);
              arrayWay[i]= new Random().nextDouble()*100;
              System.out.printf("%.2f", arrayWay[i]);
              System.out.println("");
//            DecimalFormat x = new DecimalFormat("##.##");
//            System.out.println(x.format(arrayWay[i]));



        }
    }
// 4 пункт
    public void sortArray() {
        boolean sorted = false;
        double temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrayWay.length - 1; i++) {
                if (arrayWay[i] > arrayWay[i + 1]) {
                    temp = arrayWay[i];
                    arrayWay[i] = arrayWay[i + 1];
                    arrayWay[i + 1] = temp;
                    sorted = false;

                }
            }
        }
        String arrayValue = Arrays.toString(arrayWay);
        System.out.println(arrayValue);
    }
// 5 пункт
public void standartSort(){
        Arrays.sort(arrayWay);
    String arrayValue = Arrays.toString(arrayWay);
    System.out.println(arrayValue);
}//6 пункт
public void foreach (){
        for(double i: arrayWay);
    String arrayValue = Arrays.toString(arrayWay);
    System.out.println(arrayValue);
}//7 пункт
       int [] arrayWay1 = {12,14,54,2,5,77};
    String [] brendOfBike = {"GT","Cannondale","Giant","Colnago","Pinarello","Electra"};
    int [][] timeWay = new int [3][3];
    double[][][] speedTimeWay = new double[5][4][];

// 8 - 9 пункт
public static void  brend(){
    System.out.println("Необходим бренд байка - GT");
}

public  void changeNumberOfSpeed(){
    numberOfSpeeds+=5;
}
public static void changeCountryMade(){
    countryMade = "India";

}
//    public void changeFinal(){ не возможно изменить TIME = 3.14}


}