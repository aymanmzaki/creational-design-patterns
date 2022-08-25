package com.jdevz;

import com.jdevz.notification.NotificationFactory;
import com.jdevz.notification.Notifier;
import com.jdevz.shape.Circle;
import com.jdevz.shape.Rectangle;
import com.jdevz.shape.Shape;
import com.jdevz.shape.ShapeFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //Shape Factory Example
        Shape c= ShapeFactory.getShape(Circle.class);
        c.draw();
        Shape r= ShapeFactory.getShape(Rectangle.class);
        r.draw();

        //Notification factory Example
        Notifier smsNotifier = NotificationFactory.createNotifier("SMS");
        smsNotifier.notifyUser("Hello");
        Notifier emailNotifier = NotificationFactory.createNotifier("Email");
        emailNotifier.notifyUser("Hello from Email");
    }

}
