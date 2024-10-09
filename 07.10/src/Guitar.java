public class Guitar implements Playable {
    String name;
    String colour;
    public Guitar(String name, String colour){
        this.name = name;
        this.colour=colour;


    }


    @Override
    public void play() {
        System.out.println(name + " am playing by chords");
    }
}
