public class Mole extends Animal{
    private String eyes;

    public Mole(String name, String colour, double weight, String eyes) {
        super(name, colour, weight);
        this.eyes=eyes;
    }

    @Override
    public void run() {
        System.out.println("Крот "+name+ " подпрыгивает и бежит ");
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getEyes() {
        return eyes;
    }


    }

