package myPackage;

public class Three {
    int object7;
    int object8;
    double object9;

    public Three(int object7, int object8, double object9) {
        this.object7 = object7;
        this.object8 = object8;
        this.object9 = object9;
    }

    public void displayValues() {
        System.out.println("Three - object7: " + object7 + ", object8: " + object8 + ", object9: " + object9);
    }

    public int calculateProduct() {
        return object7 * object8 * (int) object9;
    }
}
