package com.example.javase.designpattern.MyFactoryStudy;


public class Test {
    public void showCar(WalkTool walkTool){
        System.out.println(walkTool.getToolName()+":"+ walkTool.getSpeed());
    }
    public static void main(String[] args) {
        Test test = new Test();
        AbstractFactoryTest abstractFactoryTest = new BMWCarFactory();
        WalkTool walkTool = abstractFactoryTest.createCar(BMWWalkTool750.class);
        test.showCar(walkTool);
        walkTool = abstractFactoryTest.createCar(BMWWalkTool740.class);
        test.showCar(walkTool);
        AbstractFactoryTest abstractFactoryTest1 = new BENZCarFactory();
        walkTool = abstractFactoryTest1.createCar(BENZWalkTool123.class);
        test.showCar(walkTool);

        AbstractFactoryTest abstractFactoryTest2 = new BicycleFactory();
        walkTool = abstractFactoryTest2.createCar(BicycleFH.class);
        test.showCar(walkTool);

        CreateWalkTool createWalkTool = new CreateWalkTool();
        walkTool =createWalkTool.createCar(BicycleMB.class);
        test.showCar(walkTool);
    }
}
