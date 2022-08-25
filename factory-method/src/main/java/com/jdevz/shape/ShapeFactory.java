package com.jdevz.shape;

/**
 * @author zaki
 */
public class ShapeFactory {
    public static Shape getShape(Class aClass){
        if (aClass.getCanonicalName().contains("Rectangle")){
            return new Rectangle();
        }else if (aClass.getCanonicalName().contains("Circle")){
            return new Circle();
        }else {
            throw new IllegalArgumentException("Unknown Class");
        }
    }
}
