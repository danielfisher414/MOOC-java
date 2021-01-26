
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;

    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();

        //a list where it will store the exam point
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));

        //points being added to points list
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades() {
        double sumTotal = 0.0;
        double count = 0.0;
        double num2 = 0.0;

        if (this.grades.isEmpty()) {
            return -1;
        }

        for (Integer num : grades) {
            count++;
            num2 += num;

        }
        sumTotal = num2 / count;

        return sumTotal;
    }

    public double averageOfPoints() {
        double total = 0;
        double count = 0;
        double average;

        if (this.points.isEmpty()) {
            return -1;
        }

        for (Integer num : this.points) {
            count++;
            total += num;
        }
        average = total / count;

        return average;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
