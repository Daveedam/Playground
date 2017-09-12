package Playground;

public class MassOnMoon {
    public static void main(String[] args) {
        double massEa, massMoo, grEa, grMoo;

        massEa = 75;
        grEa = 9.807;

        grMoo = (grEa * 17)/ 100;
        massMoo = (massEa * grMoo)/grEa;

        System.out.println("Ваша масса на Земле: " + massEa);
        System.out.println("Ваша масса на Луне: " + massMoo);
    }
}
