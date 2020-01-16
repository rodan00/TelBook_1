import java.util.ArrayList;

public class DataRep {

   // private static DataRep baza=null;
    private static DataRep dataRep=null;
    private int listSize=10;
//!  private Customer[] customerBase=new Customer[listSize];
    private ArrayList<Customer> customerBase=new ArrayList<Customer>();

    private DataRep(){
        for(int i=0; i< 10;  i+=2){
//!            this.customerBase[i]=new Person(i);
//!            this.customerBase[i+1]=new Company(i+1);
              this.customerBase.add(new Person(i));
              this.customerBase.add(new Company(i+1));
        }
    }

    public static DataRep getBaza(){
        if (DataRep.dataRep==null){
            DataRep.dataRep =new DataRep();
        }
        return DataRep.dataRep;
    }

//!    public Customer[] getAllCustomers(){return customerBase;}
    public ArrayList<Customer> getAllCustomers(){
        return customerBase;
    }

//!    public Person[] getAllPersons(){
    public ArrayList<Person> getAllPersons(){
        ArrayList<Person> allPersons=new ArrayList<Person>();
            for(Customer customer: customerBase) {
                if(customer instanceof Person){
                    allPersons.add( (Person) customer);
                }
            }
        return allPersons;
    }

    public ArrayList<Company> getAllCompanies(){
        ArrayList<Company> allComapnies=new ArrayList<Company>();
        for(Customer customer :  customerBase) {
            if(customer instanceof Company){
                allComapnies.add((Company) customer);
            }
        }
        return allComapnies;
    }

////!    public Customer[] resizeCustomerBase(){
//       public ArrayList<Customer> resizeCustomerBase(){
//        //System.out.println(customerBase.length);
//        //System.out.println(listSize);
//        Customer[] tmp=new Customer[listSize+1];
//        for (int i=0; i<listSize;i++){ tmp[i]=customerBase[i];}
//        customerBase=tmp;
//        listSize+=1;
//        //System.out.println(customerBase.length);
//        //System.out.println(listSize);
//        return customerBase;
//    }

 //!   public void addToCustomerBase(Customer customer) {customerBase[listSize-1]=customer;};
    public void addToCustomerBase(Customer customer){
        customerBase.add(customer);
    };



}//eoc
