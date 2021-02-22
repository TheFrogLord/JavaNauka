package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Proxy;

public class SmsProxy implements Sms {

    private SmsSender smsSender;

    public SmsProxy() {
        this.smsSender = new SmsSender();
    }

    @Override
    public void sendSms(String number, String text) {

        if (number.length() == 9 || number.isEmpty() || text.isEmpty()) {
            smsSender.sendSms(number, text);
        } else {
            throw new RuntimeException();
        }
    }
}
