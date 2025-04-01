public class Main {
    public static void main(String[] args) {
        //завдання 1
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Electronics("Смартфон", 29000));
        cart.addProduct(new Clothing("Штани", 100));
        cart.showCart();

        //завдання 2
        GradeBook gradeBook = new GradeBook();
        Student student1 = new Undergraduate("Роман");
        student1.addGrade("Java", 75);
        student1.addGrade("ОШІ", 55);
        gradeBook.addStudent(student1);

        Student student2 = new Graduate("Нікіта");
        student2.addGrade("ОТ", 90);
        gradeBook.addStudent(student2);

        System.out.println("Перездача:");
        for (Student student : gradeBook.getFailedStudents()) {
            System.out.println(student.name);
        }

        //завдання 3
        CustomerDatabase customerDB = new CustomerDatabase();
        Customer c1 = new Customer("Роман", "roman@email.com", "09674738");
        Customer c2 = new Customer("Нікіта", "nikita@email.com", "096457383");
        Customer c3 = new Customer("Настя", "nastya@email.com", "096647483");

        customerDB.addCustomer(c1);
        customerDB.addCustomer(c2);
        customerDB.addCustomer(c3);

        System.out.println("Роман в базі " + customerDB.containsCustomer(c1));
    }
}