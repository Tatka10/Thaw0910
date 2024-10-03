public class Robby {
    int x, y;
    int angle = 0;

    public void printState() {
        System.out.println("x= " + x + " y " + y + " angle " + angle);
    }

    public Robby(int startX, int startY, int startAngle) {
        x = startX;
        y = startY;
        if (startAngle == 0 || startAngle == 90 || startAngle == 180 || startAngle == 270)
            angle = startAngle;
    }


    public void stepWorward() {
        System.out.println("Надо идти вперед");
        switch (angle) {
            case 0:
                y++;
                break;
            case 180:
                y--;
                break;
            case 90:
                x--;
                break;
            case 270:
                x++;
                break;
        }
    }

    public void rotateLeft() {
        System.out.println("Надо повернуться на 90% влево");
        angle += 90;
        if (angle >= 360) angle -= 360;

    }

    public void rotateRight() {
        System.out.println("Надо повернуться на 90% вправо");
        angle -= 90;

        if (angle < 0) angle += 360;
    }

    public void doCommand(char cmd) {
        System.out.println("обрабатываю команду " + cmd);
        switch (cmd) {
            case 'S':
                stepWorward();
                break;
            case 'L':
                rotateLeft();
                break;
            case 'R':
                rotateRight();
                break;
            default:
                System.out.println("Сбой программы:неизвестная команда");

        } printState();
    }

    // Внутри класса Robby добавить метод, который принимает в качестве аргумента (входного параметра) строку и для каждого символа в ней выполняет метод doCommand
    public void runProga(String proga) {
        for (int i = 0; i < proga.length(); i++) {
            char cmd = proga.charAt(i);
            doCommand(cmd);
        }
    }

}





