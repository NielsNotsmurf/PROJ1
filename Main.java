import Examenpackage.Gebruiker;
import Examenpackage.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Examens
        Examen examen = new Examen("Nederlands", 10);

        //Gebruikers
        Gebruiker gebruiker = new Gebruiker("Luc", 21095582, "Wachtwoord", true);
        Gebruiker gebruiker2 = new Gebruiker("Daniel", 21137943, "Wachtwoord", true);
        Gebruiker gebruiker3 = new Gebruiker("Bram", 21113653, "Wachtwoord", true);
        Gebruiker gebruiker4 = new Gebruiker("Rick", 20112602, "Wachtwoord", true);
        examen.setStudentGeslaagd(gebruiker.getGebruikersLijst());

        Inlog(scanner, gebruiker);

        //Vragen
        Vraag vraag = new Vraag("Wat is de bijnaam voor Roy?", "D");
        Vraag vraag1 = new Vraag("Hoevaak is Roy opkomen dagen?", "C");
        Vraag vraag2 = new Vraag("Hoeveel heeft Roy aan dit project gedaan?", "A");
        Vraag vraag3 = new Vraag("Houd Daniels moeder van Daniel?", "C");
        Vraag vraag4 = new Vraag("Hoeveel likes heeft Daniel op Tinder?", "B");
        
        Gebruiker ingelogdeUser = Inlog(scanner, gebruiker);

        while (true) {
            String menu = """
                    Menu
                    1) Lijst met examens
                    2) Lijst met gebruikers
                    3) Nieuwe student inschrijven
                    4) Student verwijderen
                    5) Examen afnemen
                    6) Is student geslaagd voor test?
                    7) Welke examens heeft student gehaald?
                    8) Welke student heeft de meeste examens gehaald?
                    0) Exit
                    Uw keuze:""";
            int menuInput = 11;
            while (menuInput > 8 || menuInput < 0) {
                try {
                    System.out.println(menu);
                    menuInput = scanner.nextInt();  // Read user input
                } catch (InputMismatchException e) {
                    System.out.println("\nGraag cijfers invoegen\n");
                    scanner.next();
                }
            }
            if (menuInput == 1) {
                for (int i = 0; i < Examen.getExamenlijst().size(); i++) {
                    System.out.println(Examen.getExamenlijst().get(i));
                }

            } else if (menuInput == 2) {
                for (int i = 0; i < gebruiker.getGebruikersLijst().size(); i++) {
                    System.out.println(gebruiker.getGebruikersLijst().get(i));
                }

            } else if (menuInput == 3) {
                menuOptieDrie(scanner);

            } else if (menuInput == 4) {
                menuOptieVier(scanner, gebruiker);

            } else if (menuInput == 5) {
                MenuOptieVijf();

            } else if (menuInput == 6) {
                studentGeslaagd(scanner);

            } else if (menuInput == 7) {
                menuOptieZeven();

            } else if (menuInput == 8) {
                menuOptieAcht();

            } else if (menuInput == 0) {
                System.out.println("Programma sluit af...");
                break;
            }
        }
    }

    private static Gebruiker Inlog(Scanner scanner, Gebruiker gebruiker) {
        int gebruikerNummer = 0;
        while (true) {
            try {
                System.out.println("Wat is je studentnummer?");
                gebruikerNummer = scanner.nextInt();
                System.out.println("Wat is je wachtwoord?");
                scanner.nextLine();
                String wachtwoordInput = scanner.nextLine();
                if (gebruiker.getGebruikerOnGebruikerNummer(gebruikerNummer).getWachtwoord().equals(wachtwoordInput)) {
                    break;
                } else {
                    System.out.println("Verkeerder inlog probeer opnieuw!\n");

                }
            } catch (Exception e) {
                System.out.println("Graag alleen cijfers gebruiken\n");
                scanner.next();
            }

        }
        return gebruiker.getGebruikerOnGebruikerNummer(gebruikerNummer);
    }

    private static void menuOptieDrie(Scanner scanner) {
        System.out.println("Geef de naam: ");
        scanner.nextLine();
        String naamInput = scanner.nextLine();
        while (true){
            try{
                System.out.println("Geef het studentennummer: ");
                int stNmrInput = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Geef het wachtwoord: ");
                String stWwInput = scanner.nextLine();
                boolean adminChoise = false;
                while (true) {
                    System.out.println("Is dit een docent (y/n)");
                    String adminInput = scanner.nextLine().toUpperCase();
                    if (adminInput.equals("Y") || adminInput.equals("N")){
                        if (adminInput.equals("Y")) {
                            adminChoise = true;
                        }
                        break;
                    } else {
                        System.out.println("Graag een 'y' of 'n' geven");
                    }
                }
                Gebruiker gebruiker = new Gebruiker(naamInput, stNmrInput,stWwInput, adminChoise);
                break;
            } catch (Exception e) {
                System.out.println("Graag cijfers gebruiken");
                scanner.next();
            }
        }
    }
    private static void menuOptieVier(Scanner scanner, Gebruiker gebruiker) {
        scanner.nextLine();
        while (true) {
            try {
                System.out.println("Welke student wilt u verwijderen?");
                String studentNaam = scanner.nextLine();
                if (gebruiker.verwijderStudent(studentNaam)) {
                    System.out.println(studentNaam + " is succesvol verwijderd");
                    break;
                } else {
                    System.out.println("Er is iets fout gegaan, check uw spelling, druk op enter en probeer het " +
                            "opnieuw");
                }
            }
            catch (Exception e) {
                System.out.println(e);
                scanner.next();
            }
        }
    }
    private static void MenuOptieVijf(){
        System.out.println("hallo");
    }
    private static void studentGeslaagd(Scanner scanner){
        //nog afmaken
        scanner.nextLine();
        while (true) {
            try {
                System.out.println("Van welke student wilt u nagaan of hij is geslaagd voor een test?");
                String inputNaam = scanner.nextLine();
                //if (gebruiker.)
                break;
            }
            catch(Exception e){
                System.out.println("Graag een naam invoeren!");
                scanner.next();
            }
        }
    }
    private static void menuOptieZeven(){
        System.out.println("hallo");
    }
    private static void menuOptieAcht(){
        System.out.println("hallo");
    }
}