package myPackage;

public class MainMethod {
    public static void main(String[] args) {
        One obj1 = new One(14, 21, 27.2);
        Two obj2 = new Two(34, 44, 52.7);
        Three obj3 = new Three(24, 70, 23.1);

        obj1.displayValues();
        System.out.println("Сума чисел класу One: " + obj1.calculateSum());
        obj1.useOtherClass(obj2);

        obj2.displayValues();
        System.out.println("Середнє значення чисел класу Two: " + obj2.calculateAverage());

        obj3.displayValues();
        System.out.println("Добуток чисел класу Three: " + obj3.calculateProduct());
    }
}

