import java.time.LocalDateTime;

class User {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private Address address;

    public User(String firstName, String lastName, LocalDateTime birthDate, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                '}';
    }
}
