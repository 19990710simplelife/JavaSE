package cn.simplelife.homework._04_neibunei;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class TestDemo {
    public static void main(String[] args) {
        /**
         * 动物类的匿名内部类
         */
        Animal animal = new Animal() {
            private String brand;

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            @Override
            public String toString() {
                return "$classname{" +
                        "brand='" + brand + '\'' +
                        '}';
            }
        };

        IUSB iusb = new IUSB() {
            @Override
            public void getNew() {
                System.out.println("新的设备");
            }
        };
        animal.setName("11");
        System.out.println(animal.getName());
        iusb.getNew();
    }
}
