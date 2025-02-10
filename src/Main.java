//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1.1");
        for (int a =500; a <=650; a +=10) {
            System.out.println(a);
        }

        System.out.println("Task1.2");
        int b =500;
        while (b <= 650) {
            System.out.println(b);
            b += 10;
        }

        System.out.println("Task1.3");
        int c = 500;
        do {
            System.out.println(c);
            c +=10;
        }
        while (c <=650);

        //Task2
        System.out.println("Task2");
        int d =2;
        while (d < 5000) {
            System.out.println(d);
            d = 2 * d -1;
        }

        //Task3
        System.out.println("Task3");
        for (int e =1; e <=10; e++) {
            if (10% e ==0){
                System.out.println(e);
            }
        }

        //Task4
        System.out.println("Task4.1");
        long factorial = 1;
        for (int f =1; f <=10; f++) {
            factorial *= f;
        }
        System.out.println(factorial);

        System.out.println("Task4.2");
        factorial = 1;
        int f = 1;
        while (f <=10) {
            factorial *= f;
            f++;
        }
        System.out.println(factorial);

        //Task5
        System.out.println("Task5");
        int count = 0;
        for (int h =0; h <24; h++) {
            for (int m =0; m <60; m++) {
                String time = String.format("%02d:%02d", h, m);
                if (time.charAt(0) == time.charAt(4) && time.charAt(1) == time.charAt(3)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}