package org.trump.vincent.gof.factorypatterns.abstractfactory;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class FactoryProducter {
    public static AbstractFactory getFactory(String factoryName){
        if(null == factoryName){
            return null;
        }
            AbstractFactory factory = null;
            try {
                factory = (AbstractFactory) Class.forName(factoryName).newInstance();
            }catch (ClassNotFoundException e){
                System.out.printf("Load Factory["+factoryName+"] occurs Exception:"+e);
            }catch (IllegalAccessException e){
                System.out.printf("Load Factory["+factoryName+"] occurs Exception:"+e);
            }catch (InstantiationException e){
                System.out.printf("Load Factory["+factoryName+"] occurs Exception:"+e);
            }
            return factory;
        }
}
