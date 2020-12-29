public class ListaVehiculos 
{
    public Vehiculo[] vehiculos = new Vehiculo[4];

    public ListaVehiculos()
    {

    }
    public void ListarTodos()
    {
        for (Vehiculo vehiculo : vehiculos) 
        {
            System.out.println(vehiculo.toString());
        }
    }
    public void VehiculoMasCaro()
    {
        double maxValue = vehiculos[0].precio; 
        int x = 0;
        for(int i = 0; i < vehiculos.length; i++)
        { 
            if(vehiculos[i].precio > maxValue)
            { 
                maxValue = vehiculos[i].precio;
                x = i; 
            } 
        } 
        System.out.println("Vehiculo mas caro: " + vehiculos[x].marca + " " + vehiculos[x].modelo);
    } 
    public void VehiculoMasBarato()
    {
        double minValue = vehiculos[0].precio; 
        int x = 0;
        for(int i = 0; i < vehiculos.length; i++)
        { 
            if(vehiculos[i].precio < minValue)
            { 
                minValue = vehiculos[i].precio;
                x = i; 
            } 
        } 
        System.out.println("Vehiculo mas barato: " + vehiculos[x].marca +" "+ vehiculos[x].modelo);
    }
    public void VehiculoConLetra(String letter)
    {
        for(int i = 0; i < vehiculos.length; i++)
        { 
            if(vehiculos[i].modelo.contains(letter))
            { 
                System.out.println("Vehículo que contiene en el modelo la letra " + "‘" + letter + "‘" + ": " + vehiculos[i].marca +" "+ vehiculos[i].modelo + " " + vehiculos[i].precio );
            } 
        } 
    } 
    public void VehiculosOrdenados()
    {
        Vehiculo[] aux = vehiculos;
        for (int i = 1 ; i < aux.length; i++)
        {
            for (int j = 0; j < aux.length-i ; j++)
            {
                if (aux[j].precio < aux[j+1].precio)
                {
                    Vehiculo temp = aux[j];
                    aux[j] = aux[j+1];
                    aux[j+1] = temp;
                }
            }
        }
        System.out.println("Vehiculos ordenados por precio de mayor a menor:");
        for (Vehiculo vehiculo : aux) 
        {
            System.out.println(vehiculo.marca + " " + vehiculo.modelo);
        }
    }
}