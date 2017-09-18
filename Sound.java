package Playground;
/*
Расчитать расстояние до места вспышки молнии, звук от которого
доходит до наблюдателя за 7.2 секунды
(скорость звука приблизительно 340 м/с).
*/
public class Sound {
    public static void main(String[] args) {
        double dist;

        dist = 340 * 7.2;

        System.out.println("Расстояние до места вспышки молнии " + "составляет " + dist + " метров");
    }
}

/*
Расчитать расстояние до крупного объекта по времени прихода эхо
 */

class SoundRock {
    public static void main(String[] args) {
        double dist;

        dist = (340 * 5) / 2;
        System.out.println("Расстояние до объекта составляет " + dist + " метров");
    }

}