package org.trump.vincent.gof.creational.abstract_factory;

public interface AbstractFactory {

    Production factory(String production);

    String getFactoryType();

    enum Factory{

        PC_FACTORY(0,"PCFactory"),
        PHONE_FACTORY(1,"PhoneFactory")
        ;

        Factory(int type,String factoryName){
           this. type = type;
           this.name = factoryName;
        }

        public Integer getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        private Integer type;
        private String name;
    }
}
