package strategy.domain.notification_sender.impl;

import strategy.domain.notification_sender.NotificationSenderStrategy;
import strategy.domain.user.User;

public class SMSNotificationSender implements NotificationSenderStrategy {
    @Override
    public void notifyPendingSign(User user) {
        System.out.printf("Sending SMS notification of pending sign for user: %s\n", user.getUsername());
    }
}
