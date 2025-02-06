class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String houseNumber;
    private String additionalNotes;

    public Address(String country, String region, String city, String street,
                   String houseNumber, String additionalNotes) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.additionalNotes = additionalNotes;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", additionalNotes='" + additionalNotes + '\'' +
                '}';
    }
}
