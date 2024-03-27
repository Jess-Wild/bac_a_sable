public class Calculette {
    public static void main(String... args){
    Calcules monAddition = new Calcules();
    int resultat = monAddition.addition(6,5);
    System.out.println("Le résultat est de : " + resultat);
    int maDivision = monAddition.division(-745,360);
        System.out.println("Résultat de ma division : " + maDivision);

    }

}
