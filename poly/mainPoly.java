package poly;

class Animal{
    String name;
    String sound;
    void makesound(){
        System.out.println("This is Animal Class");
    }
     void makesound(){
        Sting result=String.format("Name=%s and Sound=%s",name,sound);
        System.out.println("Name");
    }

    void makesound(){
        Sting result=String.format("Name=%s and Sound=%s",name,sound);
        System.out.println("Name");
    }
}

class Cat extends Animal{
    int legs;
    Cat(String name, String sound, int legs){
        super.name=name;
        super.sound=sound;
        this.legs=legs;
    }

    void makesound(){
        System.out.println("This is Animal Class");
    }
}

public class mainPoly{
    public static void main(String[] args){
    Animal n1=new Animal();
    n1.makesound();
    n1.makesound("Dog","Bark");
    n1.makesound();
    }

}