package com.example.javase.designpattern.MyFactoryStudy;

public abstract class WalkTool {
    private String toolName;
    private int speed;

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "WalkTool{" +
                "toolName='" + toolName + '\'' +
                ", speed=" + speed +
                '}';
    }
}
