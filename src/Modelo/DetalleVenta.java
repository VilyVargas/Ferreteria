/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Estudiantes
 */
public class DetalleVenta {
    private int idDetalleVenta;
private int IdVenta; // Relación con Venta
private int IdProducto; // Relación con Producto
private int cantidad;
private float precioUnitario;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalleVenta, int IdVenta, int IdProducto, int cantidad, float precioUnitario) {
        this.idDetalleVenta = idDetalleVenta;
        this.IdVenta = IdVenta;
        this.IdProducto = IdProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int IdVenta) {
        this.IdVenta = IdVenta;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    
}
