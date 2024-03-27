public class Pi {
    public static void main(String... args){
        //  -----EXERCICE PI-----
        double pi = 0;

            for (int i = 1; i <= 1000000; i++) {
                if (i % 2 == 1) {
                   pi += 4.0 / (2 * i - 1);
                } else {
                    pi -= 4.0 / (2 * i - 1);
                }
            }

        System.out.println("La valeur de pi est : " + pi);
    }
}
