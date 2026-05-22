public class Vehiculo {
    private String Placa;
    private String Marca;
    private String Modelo;
    private int Anio;
    private String Color;
    private double Precio;

    public Vehiculo(String placa, String marca, String modelo, int anio, String color, double precio) {
        this.Placa = placa;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Anio = anio;
        this.Color = color;
        this.Precio = precio;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int anio) {
        Anio = anio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void MostrarInformacion(){
    System.out.println("======================");
    System.out.println("  DATOS DEL VEHICULO  ");
    System.out.println("======================");
    System.out.println(    "Placa: " + getPlaca());
    System.out.println(    "Marca: " + getMarca());
    System.out.println(    "Modelo: " + getModelo());
    System.out.println(    "Año: " + getAnio());
    System.out.println(    "Color: " + getColor());
    System.out.printf(    "Precio: %.2f%n" , getPrecio());
    System.out.println("======================");

   }
}
