package com.jdevz.notification;

/**
 * @author zaki
 */
public class NotificationFactory {
    public static Notifier createNotifier(String channel){
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel){
            case "SMS":
                return new smsNotifer();
            case "Email":
                return new emailNotifier();
            default:
                throw new IllegalArgumentException("Unsupported chanel");
        }
    }
}
