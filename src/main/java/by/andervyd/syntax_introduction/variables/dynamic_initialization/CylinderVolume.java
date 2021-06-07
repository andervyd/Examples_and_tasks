package by.andervyd.syntax_introduction.variables.dynamic_initialization;

public class CylinderVolume {
    public static void main(String[] args) {

        double radius = 4;
        double height = 5;

        double volume = Math.PI * (radius * radius) * height;

        System.out.printf("Volume cylinder: %.2f", volume);
        // >> Volume cylinder: 251.33
    }
}
