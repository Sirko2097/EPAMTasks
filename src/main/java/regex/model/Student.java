package regex.model;

public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phoneNumber;
    private String address;

    public Student() {
    }


    public Student addFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Student addLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student addDateOfBirth(String date) {
        this.dateOfBirth = date;
        return this;
    }

    public Student addPhoneNumber(String number) {
        this.phoneNumber = number;
        return this;
    }

    public Student addAddress(String address) {
        this.address = address;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(5);
        return stringBuffer.append(getFirstName()).append(" ").append(getLastName()).append(" ")
                .append(getDateOfBirth()).append(" ").append(getAddress()).append(" ")
                .append(getPhoneNumber()).toString();
    }
}
