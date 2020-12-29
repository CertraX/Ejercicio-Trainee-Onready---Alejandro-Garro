//package src.main.java;

public class Vehiculo 
{
    public String marca;
    public String modelo;
    public String info;
    public String infoCantidad;
    public double precio;


    //Contructores
    public Vehiculo()
    {

    }
    public Vehiculo(String marca,String modelo,String info,String infoCantidad,double precio)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.info = info;
        this.infoCantidad = infoCantidad;
        this.precio = precio;
    }

    //Getters y Setters
    public String getMarca() 
    {
        return marca;
    }
    public void setMarca(String marca) 
    {
        this.marca = marca;
    }
    public String getModelo() 
    {
        return modelo;
    }
    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }
    public String getInfo() 
    {
        return info;
    }
    public void setInfo(String info) 
    {
        this.info = info;
    }
    public String getInfoCantidad() 
    {
        return infoCantidad;
    }
    public void setInfoCantidad(String infoCantidad) 
    {
        this.infoCantidad = infoCantidad;
    }
    public double getPrecio() 
    {
        return precio;
    }
    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }

    //Funciones
    public String toString()
    {
        return "Marca: " + marca + " // Modelo: " + modelo + " // " + info + ": " + infoCantidad + " // Precio: " + precio;
    }
}
