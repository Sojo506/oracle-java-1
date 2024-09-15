public class Decisions {

    public static void main(String[] args) {
        int releaseDate = 1999;
        boolean isIncludedPlan = true;
        double rating = 8.2;
        var planType = "plus";

        /*if (releaseDate >= 2022) {
            System.out.println("Películas modernas populares");
        } else {
            System.out.println("Película retro populares");
        }*/

        if(isIncludedPlan && planType.equals("plus")) {
            System.out.println("Enjoy ur movie!");
        }else {
            System.out.println("Upgrade ur plan 😨😨!");
        }
    }
}
