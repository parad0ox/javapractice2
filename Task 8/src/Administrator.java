import java.time.LocalDateTime;


class Administrator extends User {
    private String department;
    private LocalDateTime hireDate;

    public Administrator(String firstName, String lastName, LocalDateTime birthDate, Address address,
                         String department, LocalDateTime hireDate) {
        super(firstName, lastName, birthDate, address);
        this.department = department;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "department='" + department + '\'' +
                ", hireDate=" + hireDate +
                "} " + super.toString();
    }
}
