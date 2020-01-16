import java.util.ArrayList;
import java.util.Scanner;

public class Show {

    public static void showShowMenu() {
        prl("\n   TELBOOK - Search Menu:");
        prl("     ----------------------");
        prl("1 - Show all Customers in TelBook ");
        prl("2 - Show all Persons in TelBook ");
        prl("3 - Show all Companies in TelBook ");
        prl("9 - Exit Search (back to Main Menu)");

        prl(" press number to choose action:");

        Scanner menuScanner = new Scanner(System.in);
        String choice = menuScanner.nextLine();

        switch(choice) {
            case "1":
                showAllCustomers();
                showShowMenu();
                break;
            case "2":
                showAllPersons();
                showShowMenu();
                break;
            case "3":
                showAllCompanies();
                showShowMenu();
                break;
            case "9":
                break;
            default:
                prl("\n\n");
                prl("choice out of menu list - try again");
                prl("\n");
                showShowMenu();
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






    public static void prl(Object o){
        System.out.println(o);
    }
}
