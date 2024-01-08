import java.util.Scanner;

class Grade {
    public String grade(int avgp) {
        switch (avgp / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C+";
            case 5:
                return "C";
            case 4:
                return "D";
            default:
                return "Fail";
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Subjects");
        int tsub = sc.nextInt();
        int tmarks = 0;
        for (int i = 0; i < tsub; i++) {
            System.out.println("Enter the marks obtained in each Subject" + (i + 1));
            int marks = sc.nextInt();
            tmarks += marks;

        }
        int avgp = tmarks / tsub;
        String Grade = g.grade(avgp);
        System.out.println("Total Marks Obtained:" + tmarks);
        System.out.println("Percenatage Obtained:" + avgp + "%");
        System.out.println("Grade Obtained:" + Grade);
        sc.close();
    }
}
