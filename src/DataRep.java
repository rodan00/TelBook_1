public class DataRep {

   // private static DataRep baza=null;
    private static DataRep dataRep=null;
    private int listSize=10;
    private Customer[] customerBase=new Customer[listSize];

    private DataRep(){
        for(int i=0; i< 10;  i+=2){
            this.customerBase[i]=new Person(i);
            this.customerBase[i+1]=new Company(i+1);
        }
    }

    public static DataRep getBaza(){
        if (DataRep.dataRep==null){
            DataRep.dataRep =new DataRep();
        }
        return DataRep.dataRep;
    }

    public Customer[] getAllCustomers(){
        return customerBase;
    }

    public Person[] getAllPersons(){
        Person[] allPersons=new Person[listSize];
            int i=0;
            for(Customer customer: customerBase) {
                if(customer instanceof Person){
                    allPersons[i]= (Person) customer;
                    i=i+1;
                }
            }
        return allPersons;
    }

    public Company[] getAllCompanies(){
        Company[] allComapnies=new Company[listSize];
        int i=0;
        for(Customer customer :  customerBase) {
            if(customer instanceof Company){
                allComapnies[i]= (Company) customer;
                i=i+1;
            }
        }
        return allComapnies;
    }

    public Customer[] resizeCustomerBase(){
        //System.out.println(customerBase.length);
        //System.out.println(listSize);
        Customer[] tmp=new Customer[listSize+1];
        for (int i=0; i<listSize;i++){ tmp[i]=customerBase[i];}
        customerBase=tmp;
        listSize+=1;
        //System.out.println(customerBase.length);
        //System.out.println(listSize);
        return customerBase;
    }

    public void addToCustomerBase(Customer customer){
        customerBase[listSize-1]=customer;
    };



}//eoc
