package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Builder;

public class UserProfile {

    private final String nick;
    private final String email;
    private final String password;
    private int age;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public UserProfile(UserProfileBuilder builder) {
        this.nick = builder.nick;
        this.email = builder.email;
        this.password = builder.password;
        this.age = builder.age;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getNick() {
        return nick;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return  "nick: " + nick + '\n' +
                "email: " + email + '\n' +
                "password: " + password + '\n' +
                "age: " + age +
                "firstName: " + firstName + '\n' +
                "lastName: " + lastName + '\n' +
                "phoneNumber: " + phoneNumber;
    }

    public static class UserProfileBuilder {

        private final String nick;
        private final String email;
        private final String password;
        private  int age;
        private  String firstName;
        private  String lastName;
        private  String phoneNumber;

        public UserProfileBuilder(String nick, String email, String password) {
            this.nick = nick;
            this.email = email;
            this.password = password;
        }

        public UserProfileBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserProfileBuilder setFirstName(String name) {
            this.firstName = name;
            return this;
        }

        public UserProfileBuilder setLastName(String lastName) {
            this.firstName = lastName;
            return this;
        }

        public UserProfileBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this);
        }

    }
}
