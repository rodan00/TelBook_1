
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void showMenu() {
        prl("\n   TELBOOK - Main Menu:");
        prl("   ----------------------");
        prl("1 - Show ...  ");
        prl("2 - Search for ... ");
        prl("3 - Add new ...");
        prl("9 - EXIT\n");

        prl(" press number to choose action:");

        Scanner menuScanner = new Scanner(System.in);
        String choice = menuScanner.nextLine();

        switch (choice) {
            case "1":
                Show.showShowMenu();
                showMenu();
                break;
            case "2":
                Search.showSearchMenu();
                showMenu();
                break;
            case "3":
                Add.showAddMenu();
                showMenu();
                break;
            case "9":
                prl("Thank you for choosing Star Alliance Airlines\n\n");
                break;
            default:
                prl("\n\n");
                prl("choice out of menu list - try again");
               prl("\n");
               showMenu();
        }
    }

    private static void showAllCustomers() {
//!    Customer[] allCustomers=DataRep.getBaza().getAllCustomers();
        ArrayList<Customer> allCustomers=DataRep.getBaza().getAllCustomers();
        for(Customer customer:allCustomers) {
            String infoText=customer.getInfo();
            prl(infoText);
        }
    }

        private static void showAllPersons() {
//!    Person[] allPersons=DataRep.getBaza().getAllPersons();
            System.out.println("tu jestem1");
            ArrayList<Person> allPersons=DataRep.getBaza().getAllPersons();
            System.out.println("tu jestem2");
            for(Person person:allPersons) {
                if (person !=null) {
                    String infoText = person.getInfo();
                    prl(infoText);
                }
            }
        }

        private static void showAllCompanies() {
//!        Company[] allCompanies=DataRep.getBaza().getAllCompanies();
        ArrayList<Company> allCompanies=DataRep.getBaza().getAllCompanies();
        for(Company company : allCompanies) {
            if (company !=null) {
                prl(company.getInfo());
            }
        }
    }


    private static void addCustomer() {
    }

    public static void prl(Object o) {System.out.println(o);}


}// eoc
