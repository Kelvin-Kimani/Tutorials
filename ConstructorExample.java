public class ConstructorExample {

    String firstName;
    String lastName;
    String emailAddress;
    int idNumber;
    int age;

    public ConstructorExample(){

    }
    public ConstructorExample(String firstName, String lastName, String emailAddress, int idNumber, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.idNumber = idNumber;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student{
    public static void main(String[] args) {
        ConstructorExample student = new ConstructorExample("Kelvin","Kimani","kelvin@gmail.com",35306225,50);
        student.setAge(20);
        student.setAge(15);

        System.out.println(student.getLastName());
    }
}
