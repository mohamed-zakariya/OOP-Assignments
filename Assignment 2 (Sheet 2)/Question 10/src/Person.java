public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public String toString() {
        return "the person name is "+name+" the address is "+address+
                "the phoneNumber is "+phoneNumber+
                "the emailAddress is "+email;
    }
}
