package com.example.javase.designpattern.MyFactoryStudy;

//实际生产产品工厂 可以生产产品的不同系列
public class BENZCarFactory extends AbstractFactoryTest {
    @Override
    public WalkTool createCar(Class c) {
        BENZTool benzCar = null;
        try {
            benzCar = (BENZTool)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return benzCar;
    }
}
