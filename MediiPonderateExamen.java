/**Aplicatie java pentru medii ponderate la examen
 * Autor WfmX
 * Versiune 3.0
 */
import java.util.Scanner;
public class MediiPonderateExamen {
    public static void main (double Nota1, double Nota2, double Nota3){
        System.out.println ("Notele sunt:" + System.lineSeparator() +"Nota 1 - " + Nota1 +  System.lineSeparator() + "Nota 2 - " + Nota2 + System.lineSeparator() + "Nota 3 - " + Nota3);
        double Medie;
        Medie = (double)25/100*Nota1 + (double)25/100*Nota2 + (double)50/100*Nota3; //setat (double) pentru a nu fi calculat ca int. Else, este trecut 0
        System.out.println ("Media este: " + Medie + ". " + "Este formata din 25% Nota1, 25% Nota2, 50% Nota3");

        // De aici incepe modulul de rotunjire, versiunea 4.0

        System.out.println ("Doriti sa continuati pentru rotunjirea notei? Raspundeti cu 1 pentru Da sau 2 pentru Nu.");
        Scanner input = new Scanner (System.in);
        int raspuns = input.nextInt ();
              if (raspuns == 1){
                System.out.println ("Nota trebuie rotunjita la " + Math.round (Medie));
                }
              else {
                System.out.println ("Calcul incheiat");
                }
    }
}
