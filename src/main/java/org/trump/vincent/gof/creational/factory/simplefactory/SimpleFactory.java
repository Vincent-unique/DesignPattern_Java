package org.trump.vincent.gof.creational.factory.simplefactory;

import org.trump.vincent.gof.creational.factory.simplefactory.products.Strawberry;
import org.trump.vincent.util.LoggerUtil;
import org.trump.vincent.gof.creational.factory.simplefactory.exceptions.BadProductException;
import org.trump.vincent.gof.creational.factory.simplefactory.products.Apple;

/**
 * Created by Administrator on 2017/5/22 0022.
 */

/**
 * 简单工厂模式，提出工厂出产
 * 而不再由产品负产出的职能
 */
public class SimpleFactory extends LoggerUtil {
    /**
     * 产出工厂遵循单例设计模式
     */
    public static SimpleFactory factory;
    private SimpleFactory(){
        logger.debug("Construct SimpleFactory instance in Simple Pattern.");
    }

    static {
        factory = new SimpleFactory();
    }

    public static SimpleFactory getFactory(){
        if (factory==null){
            factory = new SimpleFactory();
        }
        return factory;
    }

    /** 工厂模型的核心业务**/
    public static AbstractProduct factory(String productName)throws BadProductException{
        if("Apple".equals(productName)){
            return new Apple();
        }else if("Strawberry".equals(productName)){
            return new Strawberry();
        }else {
            throw new BadProductException("Not Found the product["+productName+"]");
        }
    }


    public static AbstractProduct create(String productName)throws BadProductException{
        String className = "org.vincent.factory.simplefactory.products."+productName;
        try {
            java.lang.Class productClass = Class.forName(className);
            if(productClass!=null){
                return (AbstractProduct) productClass.newInstance();
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            throw new BadProductException("Not Found this type product.");
        }catch (IllegalAccessException ie){
            ie.printStackTrace();
            throw new BadProductException("Invalid product type.");
        }catch (InstantiationException ne){
            ne.printStackTrace();
            throw new BadProductException("Invalid product.");
        }
        return null;
    }
}
