

import Examenpackage.Gebruiker;
import Examenpackage.Gebruikerslijst;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                Menu
                1) Lijst met examens
                2) Lijst met studenten
                3) Nieuwe student inschrijven
                4) Student verwijderen
                5) Examen afnemen
                6) Is student geslaagd voor test?
                7) Welke examens heeft student gehaald?
                8) Welke student heeft de meeste examens gehaald?
                0) Exit
                Uw keuze:""";
        int menuInput = 11;
        while (menuInput > 8 || menuInput < 0) 
        {
            try {
                System.out.println(menu);
                menuInput = scanner.nextInt();  // Read user input
            } catch (Exception e) {
                System.out.println("\nGraag cijfers in voegen!\n");
            }
        }
        System.out.println("uw keuze is: " + menuInput);  // Output user input
        if (menuInput == 1)

        {
            
        } else if (menuInput == 2) 
        {

        } else if (menuInput == 3) 
        {
            //ArrayList<Gebruiker> lijstje = new ArrayList<Gebruiker>();
            Gebruiker gebruiker = new Gebruiker("Luc", 21095582, true);
            //lijstje.add(gebruiker);
            //Gebruikerslijst gebruikers = new Gebruikerslijst(lijstje);
            //System.out.println(gebruikers);
        } else if (menuInput == 4) 
        {

        } else if (menuInput == 5) 
        {

        } else if (menuInput == 6) 
        {

        } else if (menuInput == 7) 
        {

        } else if (menuInput == 8) 
        {

        } else if (menuInput == 0) 
        {
            System.out.println("Programma sluit af");
            System.exit(0);
        }
        scanner.close();
    }
}


