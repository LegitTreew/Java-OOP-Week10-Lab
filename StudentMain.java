import java.util.ArrayList;

public class StudentMain {

    public static void main(String[] args) {

        ArrayList<Student> cls = new ArrayList<>();

        // Add students
        Student a = new Student();
        a.name = "Denis";
        a.score = 85;
        cls.add(a);

        Student b = new Student();
        b.name = "Nathanael";
        b.score = 72;
        cls.add(b);

        Student c = new Student();
        c.name = "Handy";
        c.score = 55;
        cls.add(c);

        Student d = new Student();
        d.name = "Andre";
        d.score = 90;
        cls.add(d);

        // List students
        System.out.println("=== STUDENT LIST ===");
        for (Student s : cls) {
            s.print();
        }

        // Calculate average
        int sum = 0;
        for (Student s : cls) {
            sum += s.score;
        }

        double average = (double) sum / cls.size();
        System.out.println("\nAverage score: " + average);

        // Sort students from highest to lowest
        for (int i = 0; i < cls.size() - 1; i++) {
            for (int j = 0; j < cls.size() - 1 - i; j++) {
                if (cls.get(j).score < cls.get(j + 1).score) {
                    Student t = cls.get(j);
                    cls.set(j, cls.get(j + 1));
                    cls.set(j + 1, t);
                }
            }
        }

        System.out.println("\n=== SORTED STUDENTS ===");
        for (Student s : cls) {
            s.print();
        }

        // Search student
        String target = "Nathanael";
        boolean found = false;

        for (int i = 0; i < cls.size(); i++) {
            if (cls.get(i).name.equals(target)) {
                System.out.println("\nFound student:");
                cls.get(i).print();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nStudent not found.");
        }
    }
}
