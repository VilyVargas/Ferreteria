/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Estudiantes
 */
public class Venta {
    private int IdVenta;
private int IdCliente; // Relación con Cliente
private int IdEmpleado; // Relación con Empleado
private Date fechaVenta;
private float totalVenta;
private List<DetalleVenta> detalles; // Relación con DetalleVenta

    public Venta(int IdVenta, int IdCliente, int IdEmpleado, Date fechaVenta, float totalVenta, List<DetalleVenta> detalles) {
        this.IdVenta = IdVenta;
        this.IdCliente = IdCliente;
        this.IdEmpleado = IdEmpleado;
        this.fechaVenta = fechaVenta;
        this.totalVenta = totalVenta;
        this.detalles = detalles;
    }

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int IdVenta) {
        this.IdVenta = IdVenta;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    public Venta() {
    }

    

}
