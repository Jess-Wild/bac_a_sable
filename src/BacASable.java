public class BacASable {
public static void main(String... args){
    System.out.println("Hello !!!!");
    Animaux canard = new Animaux();
    canard.nom = "Donald";
    canard.couleur = "Blanc";
    canard.nbPattes = 2;
    System.out.println("C'est moi : " + canard.nom + ", je suis " + canard.couleur + " et je tiens sur " + canard.nbPattes + " pattes.");
    canard.parler();

    double pi = 0;

    for(int i = 1; i <= 1000000; i++){
        if (i % 2 == 1){
            pi += 4.0 / (2 * i - 1);
        }else {
            pi -= 4.0 / (2 * i - 1);
        }
    }
    System.out.println("La valeur de pi est : " + pi);

}
}
