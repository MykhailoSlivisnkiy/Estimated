//import Commands.*;
//import Saver.*;
//
//public class Main {
//    public static void main(String argsp[]){
//        Controller controller = new Controller();
//
//        Derevatuv.add(new UsualVehicle(5));
//        Derevatuv.add(new Invenstution(10));
//        Derevatuv.add(new UnfortunatelyCase(2));
//        Derevatuv.add(new UsualVehicle(3));
//        Derevatuv.add(new LifeSaver(1));
//        Derevatuv.add(new HealthAndSick(3));
//
//        System.out.println("Deruvatuv ");
//        Derevatuv.show();
//
//        System.out.println();
//        controller.setCommand(new Price());
//
//        controller.setCommand(new Sort());
//
//        System.out.println();
//        System.out.println("Derevatuv sort");
//        Derevatuv.show();
//
//        System.out.println();
//        controller.setCommand(new FindByParametr(60, 130));
//
//        System.out.println();
//        controller.setCommand(new FindByParametr("document for save from damage from usual vehicle"));
//
//        Derevatuv.delete(25);
//    }
//}


import Commands.*;
import Saver.*;

import java.util.Scanner;

public class Main {
    public static void main(String argsp[]) {
        Controller controller = new Controller();

        Derevatuv.add(new UsualVehicle(5));
        Derevatuv.add(new Invenstution(10));
        Derevatuv.add(new UnfortunatelyCase(2));
        Derevatuv.add(new UsualVehicle(3));
        Derevatuv.add(new LifeSaver(1));
        Derevatuv.add(new HealthAndSick(3));


        while (true) {
            System.out.println("1 - показати дереватив\n2 - вивести ціну\n3 - відсортувати\n4 - знайти по параметру чисел\n5 - знайти по параметру імені");
            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();

            if (c == 1) {
                System.out.println("Deruvatuv ");
                Derevatuv.show();
                System.out.println();
            }
            if (c == 2) {
                System.out.println();
                controller.setCommand(new Price());
                System.out.println();
            }
            if (c == 3) {
                controller.setCommand(new Sort());
                System.out.println();
            }
            if (c == 4) {
                System.out.println("Веддіть мінімальне");
                int n1 = scanner.nextInt();
                System.out.println("Введіть максимальне значення");
                int n2 = scanner.nextInt();

                System.out.println();
                controller.setCommand(new FindByParametr(n1, n2));
                System.out.println();
            }
            if (c == 5) {
                System.out.println();
                controller.setCommand(new FindByParametr("document for save from damage from usual vehicle"));
                System.out.println();
            }
        }
    }
}

