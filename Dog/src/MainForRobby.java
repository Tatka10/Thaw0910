
public class MainForRobby {
    public static void main(String[] args) {
        Robby robby = new Robby(0, 0, 0);
        robby.printState();

        robby.stepWorward();
        robby.rotateLeft();
        robby.stepWorward();
        robby.printState();
       //robby.doCommand('R');
       // robby.doCommand('R');
       // robby.doCommand('S');
       // robby.doCommand('S');
        //robby.doCommand('S');
       // robby.doCommand('S');
        // robby.doCommand('L');
       // robby.doCommand('S');
        robby.runProga("RRSSSSLS");


        //Robby robby2 = new Robby(125, 221, 180);
        //robby2.printState();

    }
}






