package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "S10");
        DslrCamera dslrCamera = new DslrCamera("Nikon", "D4");
/*
        smartphone.navigate(4.321, 56.231);
        smartphone.turnOnFlash();
        smartphone.takePhoto();

        dslrCamera.turnOnFlash();
        dslrCamera.takePhoto();

 */

        PhotoCamera[] cameras = new PhotoCamera[2];
        cameras[0] = smartphone;
        cameras[1] = dslrCamera;

        for (PhotoCamera photoCamera : cameras) {
            if (photoCamera instanceof Smartphone) {
                photoCamera.turnOnFlash();
            }
            photoCamera.takePhoto();
            
        }
    }

}
