package strategy.domain.notification_sender;

import strategy.domain.user.User;

public interface NotificationSenderStrategy {
    void notifyPendingSign(User user);
}
