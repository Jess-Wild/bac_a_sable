import java.math.BigDecimal;

public class ParadoxeZenon {
    public static void main(String... args){
        float distanceAParcourirFloat = 8f;
        int nbDivision = 0;

        while(distanceAParcourirFloat != 0){
            nbDivision++;
            distanceAParcourirFloat = distanceAParcourirFloat/2;
        }
        System.out.println("Il va falloir diviser " + nbDivision + " fois le trajet pour parcourir 8 mètres.");


        double distanceAParcourirDouble = 8.0;
        int nbDivision2 = 0;

        while(distanceAParcourirDouble != 0){
            nbDivision2++;
            distanceAParcourirDouble = distanceAParcourirDouble/2;
        }
        System.out.println("Il va falloir diviser " + nbDivision2 + " fois le trajet pour parcourir 8 mètres.");

        BigDecimal distanceAParcourirBigDecimal = new BigDecimal(8);
        int nbDivisionBigDecimal = 0;

        while(distanceAParcourirBigDecimal != 0){
            nbDivision2++;
            distanceAParcourirBigDecimal = distanceAParcourirBigDecimal/2;
        }
    }


}
