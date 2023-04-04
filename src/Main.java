import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//            // to complete an infinite loop, you can add the operator "break"
////            break;
//        }

        Dimensions dimensions = new Dimensions(38.00, 48.00, 56.00);
        InfoCargoCurier infoCargoCurier = new InfoCargoCurier(dimensions,
                                                              65.00,
                                                              "г. Белгород, ул. Ленина 35",
                                                              true,
                                                              "А145687253",
                                                              true);
        infoCargoCurier.infoCargo();











    }
}

