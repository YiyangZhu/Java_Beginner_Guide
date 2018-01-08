/*This program demonstrates a conversion table of gallons to liters
 * Call it GalToLitTable.java
 */

public class GalToLitTable{
    public static void main(String[] args){
        double gallon, liter;

        for(gallon = 1; gallon <= 20; gallon++){
            liter = gallon * 3.7854;
            System.out.println(gallon+" gallons equals to "+liter+" liters.");
        }
        
        gallon = 0;
    }
}