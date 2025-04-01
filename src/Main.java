import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    //спосіб 1
    private static final Function<Integer, String> gradeToText1 = grade -> {
        if (grade >= 90) return "Відмінно";
        if (grade >= 75) return "Добре";
        if (grade >= 60) return "Задовільно";
        return "Незадовільно";
    };

    //спосіб 2
    private static String convertGrade(Integer grade) {
        if (grade >= 90) return "Відмінно";
        if (grade >= 75) return "Добре";
        if (grade >= 60) return "Задовільно";
        return "Незадовільно";
    }

    //метод Function
    public static void testGradeFunction(Function<Integer, String> function, List<Integer> grades) {
        for (int grade : grades) {
            System.out.println("Оцінка " + grade + " -> " + function.apply(grade));
        }
    }

    //спосіб 1
    private static final Predicate<Integer> isMasterStudent1 = course -> course >= 5;

    //спосіб 2
    private static boolean isMaster(Integer course) {
        return course >= 5;
    }

    //метод Predicate
    public static void testCoursePredicate(Predicate<Integer> predicate, List<Integer> courses) {
        for (int course : courses) {
            System.out.println("Курс " + course + " -> " + (predicate.test(course) ? "Магістр" : "Бакалавр"));
        }
    }

    public static void main(String[] args) {
        List<Integer> testGrades = Arrays.asList(95, 80, 70, 50);
        System.out.println("Перевірка оцінок:");
        testGradeFunction(gradeToText1, testGrades);

        List<Integer> testCourses = Arrays.asList(1, 2, 5);
        System.out.println("\nПеревірка курсу студента:");
        testCoursePredicate(isMasterStudent1, testCourses);

        List<Integer> grades = Arrays.asList(95, 85, 75, 65, 55, 45);

        //спосіб 1 без Stream
        List<Integer> passedGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade >= 60) {
                passedGrades.add(grade);
            }
        }
        System.out.println("\nОцінки без Stream:");
        for (int grade : passedGrades) {
            System.out.println(grade + " -> " + gradeToText1.apply(grade));
        }

        //спосіб 2 з Stream
        System.out.println("\nОцінки зі Stream:");
        grades.stream()
                .filter(grade -> grade >= 60)
                .map(gradeToText1)
                .forEach(System.out::println);
    }
}
