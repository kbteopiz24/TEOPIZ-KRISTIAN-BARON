import java.util.Scanner;

class Student {
    String firstName, middleName, lastName, suffix;

    Student() {}

    String getFirstName() {
        return this.firstName;
    }

    String getMiddleName() {
        return this.middleName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSuffix() {
        return this.suffix;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public static void main(String[] args) {
        Student s = new Student();
        Scanner studentinput = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = studentinput.next();
        s.setFirstName(firstName);

        System.out.println("Enter Middle Name: ");
        String middleName = studentinput.next();
        s.setMiddleName(middleName);

        System.out.println("Enter Last Name: ");
        String lastName = studentinput.next();
        s.setLastName(lastName);

        System.out.println("Enter Suffix: ");
        String suffix = studentinput.next();
        s.setSuffix(suffix);

        System.out.println("First Name: " + s.getFirstName());
        System.out.println("Middle Name: " + s.getMiddleName());
        System.out.println("Last Name: " + s.getLastName());
        System.out.println("Suffix: " + s.getSuffix());
    }
}
