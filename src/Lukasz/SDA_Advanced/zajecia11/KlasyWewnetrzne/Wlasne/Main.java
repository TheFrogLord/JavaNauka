package Lukasz.SDA_Advanced.zajecia11.KlasyWewnetrzne.Wlasne;

public class Main {

    public static void main(String[] args) {

//wykorzystuję klasę niestatyczną
        Protector owner = new Protector("Joachim", "Konewka");
        Protector.Dog dog = owner.new Dog("Spaniel", "Dingo");
        dog.showDogDetails();

    }
}
