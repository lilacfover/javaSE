package com.example.javase.designpattern.MyFactoryStudy;

public class CreateWalkTool extends AbstractFactoryTest {
    @Override
    public WalkTool createCar(Class c) {
        WalkTool walkTool =null;
        try {
            walkTool = (WalkTool)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return walkTool;
    }
}
