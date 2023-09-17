import java.util.Scanner;

public class studentgradecalculator {

    public static void main(String[] args) {

        float totalSubcount, totalMarks = 0, averagepct;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the total number of subjects: ");
        totalSubcount = scn.nextFloat();
        for (int i = 1; i <= totalSubcount; i++) {
            // System.out.println("Enter the name for subject " + subname);

            // subname = scn.nextLine();
            System.out.println("Enter the marks for subject " + i);
            totalMarks += scn.nextFloat();
        }
        averagepct = (totalMarks / (totalSubcount * 100)) * 100;

        if (averagepct >= 97) {
            System.out.println("Total marks: " + totalMarks + ",Percentage : " + averagepct + ", Grade A+");
        } else if (averagepct >= 93) {
            System.out.println("Total marks: " + totalMarks + ", Percentage : " + averagepct + ", Grade A");
        } else if (averagepct >= 90) {
            System.out.println("Total marks: " + totalMarks + ", Percentage : " + averagepct + ", Grade A-");
        } else if (averagepct >= 87) {
            System.out.println("Total marks: " + totalMarks + ", Percentage : " + averagepct + ", Grade B+");
        } else if (averagepct >= 83) {
            System.out.println("Total marks: " + totalMarks + ", Percentage : " + averagepct + ", Grade B");
        } else if (averagepct >= 80) {
            System.out.println("Total marks: " + totalMarks + ", Percentage : " + averagepct + ", Grade B-");
        } else if (averagepct >= 77) {
            System.out.println("Total marks: " + totalMarks + ", Percentage : " + averagepct + ", Grade C+");
        } else if (averagepct >= 73) {
            System.out.println("Total marks: " + totalMarks + ", Percentage : " + averagepct + ", Grade C");
        } else if (averagepct >= 70) {
            System.out.println("Total marks: " + totalMarks + ", Percentage : " + averagepct + ", Grade C-");
        } else if (averagepct >= 67) {
            System.out.println("Total marks: " + totalMarks + ",Percentage : " + averagepct + ", Grade D+");
        } else if (averagepct >= 65) {
            System.out.println("Total marks: " + totalMarks + ", Percentage : " + averagepct + ", Grade D");
        } else {
            System.out.println("Total marks: " + totalMarks + " Percentage : " + averagepct + ", Grade E");
        }

    }

}
