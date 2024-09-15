import java.util.Scanner;

public class Evaluations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double note = 0.0;
        double notesAverage = 0.0;
        int aux = 0;

        while (note != -1) {
            System.out.println("Ingresa la nota que le das a Matrix: ");
            note = sc.nextDouble();

            if (note >= 0) {
                notesAverage += note;
                aux++;
            }
        }

        System.out.printf("notesAverage = %.2f", (notesAverage / aux));
    }

}
