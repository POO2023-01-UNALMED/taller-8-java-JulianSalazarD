package futbol;

public abstract class Futbolista implements Comparable{
    //Atributos
    private String nombre;
    private int edad;
    final private String posicion;

    //constructor

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista(){
        this("Maradona",30,"delantero");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public boolean equals(Futbolista f) {
        return this == f;
    }

    @Override
    public String toString() {
        return "El futbolista "+this.nombre+
                " tiene "+this.edad+
                ", y juega de "+this.posicion;
    }

    public abstract boolean jugarConLasManos();
}
