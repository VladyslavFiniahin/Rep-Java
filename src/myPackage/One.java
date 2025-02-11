package myPackage;

public class One {
    //змінні екземплярів класу
    int object1;
    int object2;
    double object3;

    //конструктор
    public One(int object1, int object2, double object3){
        this.object1=object1;
        this.object2=object2;
        this.object3=object3;
    }

    public void result() {
        System.out.println("FirstClass - Object1: " + object1 + ", Object2: " + object2 + ", Object3: " + object3);
    }

}