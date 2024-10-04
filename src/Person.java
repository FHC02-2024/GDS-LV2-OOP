public class Person {

    public String firstname;
    public String lastname;
    private int age;

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void print() {
        System.out.println(firstname + " " + lastname + " " + age);
    }

    public void getOlder() {
        age = age + 1;
    }
}
