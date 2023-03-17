public class Main {
    public static void main(String[] args) {

            Person p1=new Person("Zikoo","Camp Cesar","01123822336","mohamedzakariaali@gmail.com");
            System.out.println(p1.toString());


            Student s1=new Student("aly","sidi gabir","01014465638","aly@gmail.com","Junior");
            System.out.println(s1.toString());


            Employee emp1=new Employee("basmala","ibrahimia","01154567214","Basmala@yahoo.com","402",1000,"15/7/2002");
            System.out.println(emp1.toString());

            Faculty f1=new Faculty("jana","Camp Cesar","01122336392","jana@gmail.com","702",20000,"04/12/2005","from 1 to 5","Assistant");
            System.out.println(f1.toString());

            Staff staff1=new Staff("gehan","miami","01154567214","gehan@gmail.com","800",10000,"04/12/2005","Helper");
            System.out.println(staff1.toString());


    }
}