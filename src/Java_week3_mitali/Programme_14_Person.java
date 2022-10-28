package Java_week3_mitali;

public class Programme_14_Person {
    //instance variables
    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Programme_14_Person person = new Programme_14_Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setFirstName("john");//first name set to john
        person.setAge(18);
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        System.out.println("smith");//Last name is set to Smith
        System.out.println("fullName=" + person.getFullName());
    }

    //Get Firstname method
    public String getFirstName() {
        return firstName;
    }

    //get lastname method
    public String getLastName() {
        return lastName;
    }

    //get age method
    public int getAge() {
        return age;
    }

    //set firstname method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //set lastname method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //set age method
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    //check is it Teen or not method
    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;

        } else {
            return false;
        }
    }

    //get full name method
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return getLastName();

        } else if (lastName.isEmpty()) {
            return getLastName();

        } else {
            return getFirstName() + " " + getLastName();
        }
    }
}
