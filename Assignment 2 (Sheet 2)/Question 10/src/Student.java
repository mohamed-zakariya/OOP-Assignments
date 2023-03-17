public class Student extends Person{
    private final String status;

    public Student(String name, String address, String phoneNumber, String email, String status){
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() +
                "the student status is "+status;
    }
}
