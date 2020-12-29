public class ConcesionariaApplication
{
    public static void main(String[] arr)
    {
        ListaVehiculos lista = new ListaVehiculos();

        lista.vehiculos[0] = new Vehiculo("Peugeot", "206", "Puertas", "4",200000D);
        lista.vehiculos[1] = new Vehiculo("Honda", "Titan ", "Cilindrada", "125cc", 60000D);
        lista. vehiculos[2] = new Vehiculo("Peugeot ", "208", "Puertas", "5",250000D);
        lista.vehiculos[3] = new Vehiculo("Yamaha", "YBR", "Cilindrada", "160cc",80500D);

        lista.ListarTodos();
        lista.VehiculoMasCaro();
        lista.VehiculoMasBarato();
        lista.VehiculoConLetra("Y");
        lista.VehiculosOrdenados();
    }
}