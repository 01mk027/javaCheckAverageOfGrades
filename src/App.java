import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mat, phy, turk, chem, mus, numberOfValidGrades = 0, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the math grade:");
        mat = input.nextInt();
        if(mat >= 0 && mat <= 100)
        {
            total += mat;
            numberOfValidGrades++;
        }

        System.out.print("Enter the physics grade:");
        phy = input.nextInt();
        if(phy >=0 && phy <= 100)
        {
            total += phy;
            numberOfValidGrades++;
        }

        System.out.print("Enter the Turkish grade:");
        turk = input.nextInt();
        if(turk >=0 && turk <= 100)
        {
            total += turk;
            numberOfValidGrades++;
        }

        System.out.print("Enter the chemistry grade:");
        chem = input.nextInt();
        if(chem >=0 && chem <= 100)
        {
            total += chem;
            numberOfValidGrades++;
        }


        System.out.print("Enter the music grade:");
        mus = input.nextInt();
        if(mus >=0 && mus <= 100)
        {
            total += mus;
            numberOfValidGrades++;
        }

        double average = total / numberOfValidGrades;

        if(average <= 55)
        {
            System.out.println("You are FAILED. See you next year. Your average is: " + average);
        }
        else{
            System.out.println("Congratulations! You've promoted to upper class. Your average is: " + average);
        }
    }
}
