package Lukasz.HomeWork.Advanced.Zajecia15_Wzorce.Zadanie1;

import java.util.List;

public class Profile {

    private String firstName;
    private String lastName;
    private String nick;
    private String email;
    private String phoneNumber;
    private int age;
    private String facebookAddress;
    private String city;
    private List<String> interests;

    public Profile(ProfileBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nick = builder.nick;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
        this.facebookAddress = builder.facebookAddress;
        this.city = builder.city;
        this.interests = builder.interests;
    }

    public String getNick() {
        return nick;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + '\n' +
                "lastName: " + lastName + '\n' +
                "nick: " + nick + '\n' +
                "email: " + email + '\n' +
                "phoneNumber: " + phoneNumber + '\n' +
                "age: " + age + '\n' +
                "facebookAddress: " + facebookAddress + '\n' +
                "city: " + city + '\n' +
                "interests: " + interests;
    }

    public static class ProfileBuilder {

        private String firstName;
        private String lastName;
        private String nick;
        private String email;
        private String phoneNumber;
        private int age;
        private String facebookAddress;
        private String city;
        private List<String> interests;

        public ProfileBuilder(String nick, String email) {
            this.nick = nick;
            this.email = email;
        }

        public ProfileBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ProfileBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ProfileBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ProfileBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public ProfileBuilder setFacebookAddress(String facebookAddress) {
            this.facebookAddress = facebookAddress;
            return this;
        }

        public ProfileBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public ProfileBuilder setInterests(List<String> interests) {
            this.interests = interests;
            return this;
        }

        public Profile build() {
            return new Profile(this);
        }
    }
}
