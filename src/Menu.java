
import java.util.Scanner;

public class Menu {

    public static void showMenu() {
        prl("\n   TELBOOK - Main Menu:");
        prl("   ----------------------");
        prl("1 - Show all Customers in the TelBook ");
        prl("2 - Show all Persons in the TelBook ");
        prl("3 - Show all Companies in the TelBook ");
        prl("4 - Search for ... ");
        prl("5 - Add new ...");
        prl("9 - EXIT\n");

        prl(" press number to choose action:");

        Scanner menuScanner = new Scanner(System.in);
        String choice = menuScanner.nextLine();

        switch (choice) {
            case "1":
                showAllCustomers();
                showMenu();
                break;
            case "2":
                showAllPersons();
                showMenu();
                break;
            case "3":
                showAllCompanies();
                showMenu();
                break;
            case "4":
                Search.showSearchMenu();
                showMenu();
                break;
            case "5":
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
        }
    }

    private static void showAllCustomers() {
    Customer[] allCustomers=DataRep.getBaza().getAllCustomers();
            for(Customer customer:allCustomers) {
              String infoText=customer.getInfo();
              prl(infoText);
            }
    }

    private static void showAllPersons() {
    Person[] allPersons=DataRep.getBaza().getAllPersons();
        for(Person person:allPersons) {
            if (person !=null) {
                String infoText = person.getInfo();
                prl(infoText);
            }
        }
    }

    private static void showAllCompanies() {
        Company[] allCompanies=DataRep.getBaza().getAllCompanies();
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
