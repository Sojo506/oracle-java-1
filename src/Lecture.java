import java.util.Scanner;

public class Lecture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = "";
        String releaseDate = "";
        float rating = 0.0f;

        System.out.println("Escribe el nombre de tu película favorita: ");
        movie = sc.nextLine();
        System.out.println("Escribe la fecha de lanzamiento: ");
        releaseDate = sc.nextLine();
        System.out.println("Escribe la nota de la peli: ");
        rating = sc.nextFloat();

        System.out.println("movie = " + movie);
        System.out.println("releaseDate = " + releaseDate);
        System.out.println("rating = " + rating);

        sc.close();
    }

}
