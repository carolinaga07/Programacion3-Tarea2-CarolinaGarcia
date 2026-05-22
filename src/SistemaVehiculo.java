import java.util.ArrayList;
import java.util.Scanner;


public class SistemaVehiculo {
    Scanner sc = new Scanner(System.in);
    ArrayList<Vehiculo> lista = new ArrayList<>();
    int opcion;

    public void MostrarMenu(){
        do {
            System.out.println("==================================");
            System.out.println("      REGISTRO  DE VEHICULO       ");
            System.out.println("==================================");
            System.out.println("1. Registrar vehiculo");
            System.out.println("2. Mostrar vehiculo");
            System.out.println("3. Buscar vehiculo por placa");
            System.out.println("4. Mostrar vehiculo por marca");
            System.out.println("5. Salir");
            System.out.println("==================================");
            System.out.println("Elige una opcion:");

            opcion =sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    RegistrarVehiculo(sc);
                    break;
                case 2:
                    MostrarVehiculo(sc);
                    break;
                case 3:
                    BuscarPorPlaca(sc);
                    break;
                case 4:
                    MostrarPorMarca(sc);
                    break;
                case 5:
                    System.out.println("Saliendoo");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 5);
    }

    public void RegistrarVehiculo(Scanner sc){

        System.out.println("Placa: ");
        String placa = sc.next();

        System.out.println("Marca: ");
        String marca = sc.next();

        System.out.println("Modelo: ");
        String modelo = sc.next();

        System.out.println("Año: ");
        int anio = sc.nextInt();
        sc.nextLine();

        System.out.println("Color: ");
        String color = sc.next();

        System.out.println("Precio: ");
        double precio = sc.nextDouble();

        lista.add(new Vehiculo(placa, marca, modelo, anio, color, precio));

        System.out.println("Vehiculo Registrado");

    }


    public void MostrarVehiculo(Scanner sc){
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Vehiculo nunmero:" + (i + 1));
            lista.get(i).MostrarInformacion();
        }
    }

    public void BuscarPorPlaca(Scanner sc){

        System.out.println("Ingrese la placa: ");
        String Buscar = sc.next();
        boolean Encontrado = false;

        for(int i = 0; i < lista.size(); i++){
            Vehiculo v = lista.get(i);

            if(v.getPlaca().equalsIgnoreCase(Buscar)){
                v.MostrarInformacion();
                Encontrado = true;
            }
            else{
                System.out.println("Vehiculo no encontrado");
            }

        }
    }

    public void MostrarPorMarca(Scanner sc){
        System.out.println("Ingrese la marca: ");
        String marca = sc.next();
        boolean Encontrado = false;

        for(int i = 0; i < lista.size(); i++){
            Vehiculo v = lista.get(i);

            if(v.getMarca().equalsIgnoreCase(marca)){
                v.MostrarInformacion();
                Encontrado = true;
            }
            else{
                System.out.println("No se encontraron vehiculos de esta marca");
            }
        }
    }

    
}
