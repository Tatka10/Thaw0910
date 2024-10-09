public class ClassicGuitar extends Guitar {
    private int strings;

    public ClassicGuitar(String name, String colour, int strings) {
        super(name, colour);
        this.strings = strings;
    }

    public  void pianoSound( ) {
        System.out.println("Piano sound is quiet, name " + name + " " + colour);

    }
    public int getStrings(){
        return strings;};

    public void setStrings(int strings) {
        this.strings = strings;
    }
}

