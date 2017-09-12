package Playground;

public class MetToIn {
    public static void main(String[] args) {
        double met, inch;
        int counter;

        counter = 0;

        for(inch = 1; inch <= 144; inch++){
            met = inch * 39.37 / 100;
            System.out.println(inch + " inch = " + met + " met");
            counter++;
            if(counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}
