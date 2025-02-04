package mypackage;

public class Two {
    //змінні екземплярів класу
    int object4;
    int object5;
    double object6;

    //конструктор
    public Two(int object4, int object5, double object6){
        this.object4=object4;
        this.object5=object5;
        this.object6=object6;
    }

    public void result() {
        System.out.println("SecondClass - Object4: " + object4 + ", Object5: " + object5 + ", Object6: " + object6);
    }

}