public class Company extends Customer{

    private String companyName="ItCamp";

    public Company(){
        super();
        idtype="COMPANY";
    };

    public Company(int nr){
        this();
        companyName=companyName;
        nr=(700+nr)*1000000;
        phoneNumber=Integer.toString(nr);
    }

    public Company (
                    String companyName,
                    String phoneNumber,
                    String street,
                    String homeNumber,
                    String zipCode,
                    String city,
                    String country) {
        super(phoneNumber,street,homeNumber,zipCode,city,country);
        idtype="CUSTOMER";
        this.companyName = companyName;
    }

    public Company (
            String companyName,
            String phoneNumber)
    {
        super();
        idtype="CUSTOMER";
        this.companyName = companyName;
    }


    public String getInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(idtype)
                .append(": companyName=").append(companyName)
                .append(", phoneNumber=").append(phoneNumber);
        String info = builder.toString() + getAddress();
        return info;
    }

    public String getCompanyName() {
        return companyName;
    }

}//eoc
