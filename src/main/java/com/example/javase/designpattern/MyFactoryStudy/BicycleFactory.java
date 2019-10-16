package com.example.javase.designpattern.MyFactoryStudy;

public class BicycleFactory  extends AbstractFactoryTest{
    @Override
    public WalkTool createCar(Class c) {
        BicyleTool bicycleTool = null;
        try {
            bicycleTool = (BicyleTool)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bicycleTool;
    }
}
