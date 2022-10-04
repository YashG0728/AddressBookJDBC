public class Person {
    private String firstName;
    private String lastName;
    private String phoneNUmber;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;

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

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\n' +
                ", lastName='" + lastName + '\n' +
                ", phoneNUmber='" + phoneNUmber + '\n' +
                ", address='" + address + '\n' +
                ", city='" + city + '\n' +
                ", state='" + state + '\n' +
                ", zip='" + zip + '\n' +
                ", email='" + email + '\n' +
                '}';
    }
}
