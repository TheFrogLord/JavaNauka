package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Proxy;

public class SmsSender implements Sms {

    @Override
    public void sendSms(String number, String text) {
        System.out.println("Tekst sms: " + text);
    }
}
