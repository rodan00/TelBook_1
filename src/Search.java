import java.util.Scanner;

class Search {


    public static void showSearchMenu() {
        prl("\n   TELBOOK - Search Menu:");
        prl("     ---------------------_-");
        prl("1 - Search phone number - by Person first name ");
        prl("2 - Search phone number - by Person surname name ");
        prl("3 - Search phone number - by Company name ");
        prl("4 - Search Customer by phone number ");
        prl("9 - Exit Search (back to Main Menu)");

        prl(" press number to choose action:");

        Scanner menuScanner = new Scanner(System.in);
        String choice = menuScanner.nextLine();

        switch(choice) {
            case "1":
                findByFirstName();
                showSearchMenu();
                break;
            case "2":
                findBySurName();
                showSearchMenu();
                break;
            case "3":
                findByCompanyName();
                showSearchMenu();
                break;
            case "4":
                findByNumber();
                showSearchMenu();
            case "9":
                 break;
            default:
                prl("\n\n");
                prl("choice out of menu list - try again");
                prl("\n");
          }
}

static void findByFirstName() {
        prl(" Search: Please enter Person first Name:");
        boolean isfound = false;
        int counter = 1;
        String search = getInput();
        Person[] allPersons = DataRep.getBaza().getAllPersons();
        prl(" Searching for: " + search);
        for (Person person : allPersons) {
            if (person != null) {
                String text = person.getFirstName();
                if (search.equals(text)) {
                    prl("Following match has been found:");
                    prl(counter + ". " + person.getInfo());
                    isfound = true;
                    counter++;
                }
            }
        }
        if (!isfound) prl(" No such Company in TelBooK");
    }


    static void findBySurName() {
        prl(" Search: Please enter Person surname:");
        boolean isfound = false;
        int counter = 1;
        String search = getInput();
        Person[] allPersons = DataRep.getBaza().getAllPersons();
        prl(" Searching for: " + search);
        for (Person person : allPersons) {
            if (person != null) {
                String text = person.getSurName();
                if (search.equals(text)) {
                    prl("Following match has been found:");
                    prl(counter + ". " + person.getInfo());
                    isfound = true;
                    counter++;
                }
            }
        }
        if (!isfound) prl(" No such Company in TelBooK");
    }

    static void findByNumber() {
        prl(" Search: Please enter phone number:");
        boolean isfound=false;
        int counter=1;
        String search = getInput();
        Customer[] allCustomers = DataRep.getBaza().getAllCustomers();
        prl(" Searching for: "+search);
        for (Customer customer : allCustomers) {
            if(customer!=null){
            String text = customer.getPhoneNumber();
                if (search.equals(text)) {
                    prl("Following match has been found:");
                    prl(counter +". "+customer.getInfo());
                    isfound=true;
                    counter++;
                }
            }
        }
        if(!isfound) prl(" No such phone number in TelBooK");
    }


    static void findByCompanyName() {
        prl(" Search: Please enter Company came:");
        boolean isfound=false;
        int counter=1;
        String search = getInput();
        Company[] allCompanies = DataRep.getBaza().getAllCompanies();
        prl(" Searching for: "+search);
        for (Company company : allCompanies) {
            if(company!=null){
                String text = company.getCompanyName();
                if (search.equals(text)) {
                    prl("Following match has been found:");
                    prl(counter +". "+company.getInfo());
                    isfound=true;
                    counter++;
                }
            }
        }
        if(!isfound) prl(" No such Company in TelBooK");
    }


    public static String getInput () {
        Scanner scanner = new Scanner(System.in);
        String inText = scanner.nextLine();
        return inText;
    }

    public static void prl(Object o){
        System.out.println(o);
    }
}