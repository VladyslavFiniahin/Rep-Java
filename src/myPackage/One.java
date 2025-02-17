package myPackage;

public class One {
    int object1;
    int object2;
    double object3;

    public One(int object1, int object2, double object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public void displayValues() {
        System.out.println("One - object1: " + object1 + ", object2: " + object2 + ", object3: " + object3);
    }

    public double calculateSum() {
        return object1 + object2 + object3;
    }

    public void useOtherClass(Two obj) {
        System.out.println("Використання даних з класу Two: " + obj.object4 + ", " + obj.object5 + ", " + obj.object6);
    }
}
