public class User {

    public String firstName;
    public String lastName;
    private String fullName;

    public String getfullName() {
        return firstName + " " +lastName;
    }

}
