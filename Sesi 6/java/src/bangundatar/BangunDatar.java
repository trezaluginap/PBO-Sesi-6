package bangundatar;

public abstract class BangunDatar {
    private String name;

    public abstract double luas ();
    public abstract double keliling();

    public void getInfo() {
        System.err.println("Bangun datar "+name);
        System.err.println("Luas: "+luas());
        System.err.println("Keliling: "+keliling());
    }

    private void setName(String name) {
        this.name = name;
    }

    protected BangunDatar(String name) {
        this.setName(name);
    }
}
