public class Faculty extends Employee{
    private String officeHours;
    private  String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String dateHired, String officeHours,String rank){
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() +
                "the officeHours is "+ officeHours+
                "the rank is "+ rank;
    }
}
