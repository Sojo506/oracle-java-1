import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double note = 0.0;
        double notesAverage = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa la nota que le das a Matrix: ");
            note = sc.nextDouble();
            notesAverage += note;
        }

        System.out.printf("notesAverage = %.2f", (notesAverage / 3));
    }

}
