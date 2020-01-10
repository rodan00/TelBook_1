import java.util.Scanner;

public class Add {

    public static void showAddMenu() {
        prl("\n   TELBOOK - Add new Customer:");
        prl("     ---------------------------");
        prl("1 - Add Person");
        prl("2 - Search Company");
        prl("9 - Exit Search (back to Main Menu)");
        prl(" press number to choose action:");

        Scanner menuScanner = new Scanner(System.in);
        String choice = menuScanner.nextLine();

        switch(choice) {
            case "1":
                addPerson();
                showAddMenu();
                break;
            case "2":
                addCompany();
                showAddMenu();
            case "9":
                break;
            default:
                prl("\n\n");
                prl("choice out of menu list - try again");
                prl("\n");
        }
    }

        private static void addPerson(){
        prl("page under cosnstruction");
        }
        private static void addCompany(){
             prl("page under cosnstruction");
         }
        public static void prl(Object o){
        System.out.println(o);
    }










}
