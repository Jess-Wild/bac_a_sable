public class Distributeur {
    public static void main(String... args){
        float prixBoisson=2.5f;
        float montantIntroduit=10.0f;

        float restantARendre=montantIntroduit-prixBoisson;

        int nbPieces2Rendues = 0;
        int nbPieces1Rendues = 0;
        int nbPieces50Rendues = 0;
        int nbPieces20Rendues = 0;

        while(restantARendre !=0f){
            if(restantARendre >= 2){
                nbPieces2Rendues = nbPieces2Rendues+1;
                restantARendre = restantARendre-2;
            } else if (restantARendre >= 1) {
                nbPieces1Rendues = nbPieces1Rendues+1;
                restantARendre = restantARendre-1;
            } else if (restantARendre >= 0.5f) {
                nbPieces50Rendues = nbPieces50Rendues+1;
                restantARendre = restantARendre-0.5f;
            } else if (restantARendre >= 0.2f) {
                nbPieces20Rendues = nbPieces20Rendues+1;
                restantARendre = restantARendre-0.2f;
            }else {
                System.out.println("Il n'y a pas assez d'argent pour rendre la monnaie");
            }
        }
        System.out.println("Le nombre de pieces de 2 rendues est de : " + nbPieces2Rendues);
        System.out.println("Le nombre de pieces de 1 rendues est de : " + nbPieces1Rendues);
        System.out.println("Le nombre de pieces de 0.50 rendues est de : " + nbPieces50Rendues);
        System.out.println("Le nombre de pieces de 0.20 rendues est de : " + nbPieces20Rendues);

    }
}
