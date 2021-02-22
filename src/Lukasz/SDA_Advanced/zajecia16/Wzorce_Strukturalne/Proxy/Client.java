package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Proxy;

public class Client {
    public static void main(String[] args) {

        SmsProxy sending = new SmsProxy();
        sending.sendSms("333444666", "Tekst sms");
    }
}
