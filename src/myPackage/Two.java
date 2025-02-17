package myPackage;

public class Two {
    int object4;
    int object5;
    double object6;

    public Two(int object4, int object5, double object6) {
        this.object4 = object4;
        this.object5 = object5;
        this.object6 = object6;
    }

    public void displayValues() {
        System.out.println("Two - object4: " + object4 + ", object5: " + object5 + ", object6: " + object6);
    }

    public double calculateAverage() {
        return (object4 + object5 + object6) / 3.0;
    }
}
