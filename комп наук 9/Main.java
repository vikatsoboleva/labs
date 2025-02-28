import java.util.ArrayList;
import java.util.Scanner;

class NotCorrectAgeException extends Exception {
    public NotCorrectAgeException(String message) {
        super(message);
    }
}

class Student {
    private int age;
    private String gender;
    private String firstName;
    private String lastName;
    private String middleName;
    private int course;
    private double averageGrade;

    public Student() {}

    public Student(int age, String gender, String firstName, String lastName, String middleName, int course, double averageGrade) throws NotCorrectAgeException {
        setAge(age);
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NotCorrectAgeException {
        if (age < 16 || age > 60) {
            throw new NotCorrectAgeException("Возраст должен быть в диапазоне от 16 до 60");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}

class Group {
    private final int MAX_STUDENTS = 15;
    private final int MIN_STUDENTS = 3;
    private ArrayList<Student> students;

    public Group() {
        students = new ArrayList<>();
    }

    public void addStudent() {
        if (students.size() >= MAX_STUDENTS) {
            System.out.println("группа переполнена");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("возраст:");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("пол:");
            String gender = scanner.nextLine();
            System.out.println("имя:");
            String firstName = scanner.nextLine();
            System.out.println("фамилию:");
            String lastName = scanner.nextLine();
            System.out.println("отчество:");
            String middleName = scanner.nextLine();
            System.out.println("курс:");
            int course = scanner.nextInt();
            System.out.println("средний балл:");
            double averageGrade = scanner.nextDouble();

            Student student = new Student(age, gender, firstName, lastName, middleName, course, averageGrade);
            students.add(student);
        } catch (NotCorrectAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void addStudent(Student student) {
        if (students.size() >= MAX_STUDENTS) {
            System.out.println("группа переполнена");
            return;
        }
        students.add(student);
    }

    public void removeStudent(int index) {
        if (index < 0 || index >= students.size()) {
            System.out.println("Неверный индекс");
            return;
        }
        if (students.size() <= MIN_STUDENTS) {
            System.out.println("группа должна содержать минимум " + MIN_STUDENTS + " студента");
            return;
        }
        students.remove(index);
    }

    public Student getStudent(int index) {
        if (index < 0 || index >= students.size()) {
            System.out.println("Неверный индекс");
            return null;
        }
        return students.get(index);
    }

    public void displayGroup() {
        if (students.isEmpty()) {
            System.out.println("Группа пуста.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                System.out.println((i + 1) + ". " + student.getFirstName() + " " + student.getLastName() + ", возраст: " + student.getAge());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        group.addStudent();
        try {
            group.addStudent(new Student(20, "муж", "Иван", "Иванов", "Иванович", 2, 4.5));
            group.addStudent(new Student(20, "муж", "Аким", "Савельев", "Ака чурка", 2, 4.5));
        } catch (NotCorrectAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        group.displayGroup();
    }
}
