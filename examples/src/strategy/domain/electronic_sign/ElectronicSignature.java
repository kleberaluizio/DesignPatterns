package strategy.domain.electronic_sign;

import strategy.domain.notification_sender.NotificationSenderStrategy;
import strategy.domain.user.User;

public class ElectronicSignature {

    User user;

    public ElectronicSignature(User user) {
        this.user = user;
    }

    public void notifySigner(NotificationSenderStrategy notificationStrategy) {
        notificationStrategy.notifyPendingSign(this.user);
    }
}
