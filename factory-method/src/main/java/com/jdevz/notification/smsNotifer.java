package com.jdevz.notification;

/**
 * @author zaki
 */
public class smsNotifer implements Notifier {
    @Override
    public void notifyUser(String message) {
        if (message.length()>140){
            throw new IllegalArgumentException("Message Greater than 140 Character");
        }else{
            System.out.println("Sending ..."+message+" Over SMS");
        }
    }
}
