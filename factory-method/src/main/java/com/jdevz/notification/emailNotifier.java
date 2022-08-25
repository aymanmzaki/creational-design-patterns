package com.jdevz.notification;

/**
 * @author zaki
 */
public class emailNotifier implements Notifier {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Email Notification ..."+message);
    }
}
