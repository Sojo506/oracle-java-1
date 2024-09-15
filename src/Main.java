public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Scree Match!");
        System.out.println("Movie: Matrix");

        int releaseDate = 1999;
        boolean isIncludedPlan = true;
        double rating = 8.2;

        double average = (8.2 + 9.0 + 6.9 + 7.4) / 4;
        System.out.println("average = " + average);

        String synopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fue lanzada en: %s 
                """.formatted(releaseDate);

        System.out.println("synopsis = " + synopsis);

        int clasification = (int) average / 2;

        System.out.println("clasification = " + clasification);

    }
}