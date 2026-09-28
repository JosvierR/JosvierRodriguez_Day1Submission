public class Student {

    private String studentId;
    private String name;

    private double[] grades;
    private int gradeCount;

    public Student(
            String studentId,
            String name
    ) {

        this.studentId = studentId;
        this.name = name;

        grades = new double[10];

        gradeCount = 0;
    }

    public void addGrade(double grade) {

        if (grade < 0 || grade > 100) {

            System.out.println(
                    "Grade must be between 0 and 100."
            );

            return;
        }

        if (gradeCount >= grades.length) {

            System.out.println(
                    "No more grade space available."
            );

            return;
        }

        grades[gradeCount] = grade;

        gradeCount++;
    }

    public double calculateGPA() {

        if (gradeCount == 0) {
            return 0;
        }

        double total = 0;

        for (int i = 0; i < gradeCount; i++) {
            total += grades[i];
        }

        double average =
                total / gradeCount;

        return average / 25;
    }

    public static boolean isHonorStudent(double gpa) {

        return gpa >= 3.5;
    }

    public static void main(String[] args) {

        Student student =
                new Student(
                        "S1001",
                        "Josvier"
                );

        student.addGrade(95);
        student.addGrade(90);
        student.addGrade(88);
        student.addGrade(92);

        double gpa =
                student.calculateGPA();

        System.out.printf(
                "GPA: %.2f%n",
                gpa
        );

        System.out.println(
                "Honor Student: "
                        + isHonorStudent(gpa)
        );
    }
}
