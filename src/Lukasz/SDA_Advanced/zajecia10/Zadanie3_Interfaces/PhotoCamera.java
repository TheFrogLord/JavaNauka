package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces;

public interface PhotoCamera {

    void takePhoto();
    default void turnOnFlash() {
        System.out.println("Flash is not available in this camera");
    }


}
