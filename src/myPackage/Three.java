package myPackage;

public class Three {
    //змінні екземплярів класу
    int object7;
    int object8;
    double object9;

    //конструктор
    public Three(int object7, int object8, double object9){
        this.object7=object7;
        this.object8=object8;
        this.object9=object9;
    }

    public void result() {
        System.out.println("ThirdClass - Object7: " + object7 + ", Object8: " + object8 + ", Object9: " + object9);
    }
}
