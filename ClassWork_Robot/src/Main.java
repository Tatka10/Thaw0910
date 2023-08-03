public class Main {
    public static void main(String[] args) {
/*
сделать Робота
робот бегает по плоской координатной сетке
он знает в какой клетке находится сейчас (x,y)
робот изначально оказывается в центре - в точке (0,0)
у робота есть метод двигаться вперед на 1 шаг
метод повернуть налево на 90 градусов
метод повернуть направо на 90 градусов
 */
        Robot r = new Robot();
        printState(r);
        r.move(); printState(r);
        r.rotateRight(); printState(r);
        r.move(); printState(r);
        r.rotateRight(); printState(r);
        r.move(); printState(r);
        r.move(); printState(r);
        r.rotateLeft(); printState(r);
        r.move(); printState(r);
    }

    private static void printState(Robot r) {
        System.out.println("местоположение " + r.x + " " + r.y + ",  направление " + r.direction);
    }
}