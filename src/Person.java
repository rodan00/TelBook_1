public class Person extends Customer {

    private String firstName="Jan";
    private String surName="Kowalski";

    public Person(){
        super();
        idtype="PERSON";
    }

    public Person(int nr){
        this();
        firstName=firstName +"_"+nr;
        surName=surName +"_"+nr;
        nr=(600+nr)*1000000;
        phoneNumber=Integer.toString(nr);
    }

    public Person(String firstName,
                  String surName,
                  String phoneNumber,
                  String street,
                  String homeNumber,
                  String zipCode,
                  String city,
                  String country) {
        super(phoneNumber, street, homeNumber, zipCode, city, country);
        idtype="Person";
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(idtype)
                .append(": firstName=").append(firstName)
                .append(", surName=").append(surName)
                .append(", phoneNumber=").append(phoneNumber);

        String info = builder.toString() + getAddress();
        return info;
    }

}//eoc
