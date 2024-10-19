import java.util.*;

public class Grade_Calculator {
    public static void main(String x[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String student_name = scan.nextLine();
        System.out.println("Enter Assignment Marks (Under 100):");
        double assignment_scored = scan.nextDouble();
        System.out.println("Enter Mid-term Exam  Marks (Under 100):");
        double mid_term_scored = scan.nextDouble();
        System.out.println("Enter Final exam Marks(Under 100)");
        double final_scored = scan.nextDouble();

        double Total_marks = assignment_scored + mid_term_scored + final_scored;
        double average_of_total = Total_marks / 3.0;

        System.out.println("Student Name is ---" + student_name);
        System.out.println("Assignment Marks  is---" + assignment_scored);
        System.out.println("Mid-Term Exam Marks is---" + mid_term_scored);
        System.out.println("Final Exam Marks is--- " + final_scored);
        System.out.println("Total Marks ---"+Total_marks);
        System.out.println("Average of the student that he scored in year --"+average_of_total);

        if (average_of_total >= 90)
        {
            System.out.println("Grade A ");
        }
             else if (average_of_total >= 70) {
                System.out.println("Grade B");
            }
             else if (average_of_total >= 50) {
                System.out.println("Grade C");
            }
             else if (average_of_total >= 30) {
                System.out.println("Grade D");
            }
            else
         {
                System.out.println("Grade F");
            }

        }
    }