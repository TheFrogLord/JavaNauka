package Lukasz.SDA_Advanced.zajecia11.KlasyWewnetrzne.Wlasne;

public class Protector {

    private String firstName;
    private String lastName;

    public Protector(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public class Dog {

        private String type;
        private String name;

        public Dog(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public void showDogDetails() {
            System.out.println("Kind of dog: " + type);
            System.out.println("Dog name: " + name);
            System.out.println("Owner details: " + firstName + " " + lastName);

        }
    }

}
