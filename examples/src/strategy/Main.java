package strategy;

import strategy.domain.electronic_sign.ElectronicSignature;
import strategy.domain.notification_sender.impl.SMSNotificationSender;
import strategy.domain.user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kleber");

        ElectronicSignature electronicSignature = new ElectronicSignature(user);

        electronicSignature.notifySigner(new SMSNotificationSender());
    }
}
