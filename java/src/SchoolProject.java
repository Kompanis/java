import java.util.*;

class School {
    private final Map<String, List<Student>> classes;

    public School() {
        this.classes = new HashMap<>();
    }

    public void addStudentToClass(String className, Student student) {
        classes.computeIfAbsent(className, k -> new ArrayList<>()).add(student);
    }

    public void displayStudentsInClass(String className) {
        List<Student> students = classes.getOrDefault(className, new ArrayList<>());
        if (!students.isEmpty()) {
            System.out.println("Students in class " + className + ":");
            for (Student student : students) {
                System.out.println(student.getName());
            }
        } else {
            System.out.println("Class " + className + " does not exist or has no students.");
        }
    }
}

class Student {
    private final String name;
    private final String className;
    private final Admin admin;

    public Student(String name, String className, Admin admin) {
        this.name = name;
        this.className = className;
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public Admin getAdmin() {
        return admin;
    }
}

class Admin {
    private final String username;
    private final String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

public class SchoolProject {
    public static void main(String[] args) {
        School school = new School();

        Admin admin = new Admin("admin", "adminpassword");

        Student student1 = new Student("John Doe", "Class A", admin);
        Student student2 = new Student("Jane Smith", "Class B", admin);

        school.addStudentToClass("Class A", student1);
        school.addStudentToClass("Class B", student2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter admin username:");
        String adminUsername = scanner.nextLine();
        System.out.println("Enter admin password:");
        String adminPassword = scanner.nextLine();

        if (admin.authenticate(adminUsername, adminPassword)) {
            System.out.println("Admin authenticated.");

            school.displayStudentsInClass("Class A");
            school.displayStudentsInClass("Class B");
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }
}
