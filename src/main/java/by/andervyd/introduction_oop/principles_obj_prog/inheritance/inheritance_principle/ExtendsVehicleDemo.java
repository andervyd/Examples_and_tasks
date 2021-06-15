package by.andervyd.introduction_oop.principles_obj_prog.inheritance.inheritance_principle;

public class ExtendsVehicleDemo {
    public static void main(String[] args) {

        Auto bmw = new Auto();
        bmw.setSunRoof(true);

        bmw.setMaxSpeed(120);
        bmw.distance(1.5);

        System.out.println("BMW have sunroof is: " + bmw.isSunRoof());
    }
}
