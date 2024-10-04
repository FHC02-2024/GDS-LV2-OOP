public class PersonDemoApp {

    public static void main(String[] args) {

        Person max = new Person();
        max.firstname = "Max";
        max.lastname = "Mustermann";
        max.age = 29;

        Person susi = new Person();
        susi.firstname = "Susi";
        susi.lastname = "Sorglos";
        susi.age = 40;

        //System.out.println(max.firstname + " " + max.lastname + " " + max.age);
        //System.out.println(susi.firstname + " " + susi.lastname + " " + susi.age);

        max.print();
        susi.print();

        susi.getOlder();

        susi.print();

    }
}
