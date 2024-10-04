public class Person {

    public String firstname;
    public String lastname;
    public int age;

    public void print() {
        System.out.println(firstname + " " + lastname + " " + age);
    }

    public void getOlder() {
        age = age + 1;
    }
}
