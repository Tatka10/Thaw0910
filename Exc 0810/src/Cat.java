public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override // перераспределим метод туСтринг
    public String toString(){
        return this.getClass()+ "  "+ name;

    }
    @Override
    public boolean equals(Object object
    ){
        Cat c=(Cat)object;
        return c.name==this.name;
    }
}
