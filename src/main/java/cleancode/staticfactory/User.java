package cleancode.staticfactory;

public class User {

    private final String name;
    private final String email;
    private final String country;

    public User(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public static User createWithDefault() {
        return new User("John Doe", "John Doe@aol.com", "United States");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}