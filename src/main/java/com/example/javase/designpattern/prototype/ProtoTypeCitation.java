package com.example.javase.designpattern.prototype;

public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(System.currentTimeMillis());
        Citation citation = new Citation("蔡伟","被评为优秀员工","成都极客通");
        citation.display();
        System.out.println(System.currentTimeMillis());
        Citation citation1 = (Citation)citation.clone();
        citation1.setName("苏贵峰");
        citation1.display();
        System.out.println(System.currentTimeMillis());
    }
}

class Citation implements Cloneable{
    private String name;
    private String info;
    private String collage;

    public Object clone() throws CloneNotSupportedException {
        System.out.println("复制奖状成功");
        return (Citation)super.clone();
    }

    public Citation(String name, String info, String collage) {
        this.name = name;
        this.info = info;
        this.collage = collage;
        System.out.println("创建奖状成功");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public void display(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Citation{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", collage='" + collage + '\'' +
                '}';
    }
}
