package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Builder;

public class Client {

    public static void main(String[] args) {
        UserProfile userOne = new UserProfile.UserProfileBuilder("zabson", "lll@gmail.com", "kakakaka")
                .setFirstName("Bobo").build();

        System.out.println(userOne);
    }
}
