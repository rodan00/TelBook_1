public class Customer {

    private String idtype;
    private String phoneNumber="997";
    private String street="Java";
    private String homeNumber="1.8";
    private String zipCode="11-111";
    private String city="Cracow";
    private String country="Poland";

    public Customer(){
        idtype="CUSTOMER";
    }

    Customer (String phoneNumber,
              String street,
              String homeNumber,
              String zipCode,
              String city,
              String country){

        this.idtype=idtype;
        this.phoneNumber=phoneNumber;
        this.street=street;
        this.homeNumber=homeNumber;
        this.zipCode=zipCode;
        this.city=city;
        this.country=country;
    }

    public String getIdtype() {return idtype;}

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public String getInfo(){
        StringBuilder builder = new StringBuilder();
        builder.append(idtype)
                .append(": phoneNumber=").append(phoneNumber);
        String info=builder.toString()+getAddress();
        return info;
    }

    public String getAddress () {
            StringBuilder builder = new StringBuilder();
            builder.append("    Adres: street=").append(street)
                    .append(", homeNumber=").append(homeNumber)
                    .append(", zipCode=").append(zipCode)
                    .append(", city=").append(city)
                    .append(", country=").append(country);
            String address= builder.toString();
            return address;
    }



        public static void prl (Object obj){
            System.out.println(obj);
        }
    }
