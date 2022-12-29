import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("Андрей", "Викторов", "БУТ1901", 5));
        studentList.add(new Student("Мария", "Первезенцева", "БАП1901", 4.9));
        studentList.add(new Student("Александра", "Овечкина", "БУТ1901", 3.2));
        studentList.add(new Aspirant("Вячеслав", "Воронцов", "А111", 3.9));
        studentList.add(new Aspirant("Данил", "Кушаков", "А111", 5));
        studentList.add(new Aspirant("Анна", "Прохорова", "А234", 4));
    }

    public static void main(String[] args) {

        for (Student student : studentList) {
            System.out.println("Имя, фамилия: " + student.getFirstName() + " " + student.getLastName()
                    + "\n\tГруппа: " + student.getGroup()
                    + "\n\tСредний балл: " + student.getAverageMark()
                    + "\n\tРазмер стипендии: " + student.getScholarship());
        }
    }
}
