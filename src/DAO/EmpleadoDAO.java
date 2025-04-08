/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Empleado;
import Util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {

    public void crearEmpleado(Empleado empleado) throws SQLException {
        String sql = """
    INSERT INTO Empleados (
    primer_nombre,
    segundo_nombre,
    primer_apellido,
    segundo_apellido,
    celular,
    cargo,
    fecha_contratacion
    ) VALUES (?, ?, ?, ?, ?, ?, ?)""";
        try (Connection c = ConexionDB.getConnection(); PreparedStatement stmt = c.prepareStatement(sql)) {
            stmt.setString(1, empleado.getPrimerNombre());
            stmt.setString(2, empleado.getSegundoNombre());
            stmt.setString(3, empleado.getPrimerApellido());
            stmt.setString(4, empleado.getSegundoApellido());
            stmt.setString(5, empleado.getCelular());
            stmt.setString(6, empleado.getCargo());
            stmt.setDate(7, new java.sql.Date(empleado.getFechaContratacion().getTime()));
            stmt.executeUpdate();
        }
    }

    public List<Empleado> leerTodosEmpleados() throws SQLException {
        String sql = "SELECT * FROM Empleados";
        List<Empleado> empleados = new ArrayList<>();

        try (Connection c = ConexionDB.getConnection(); PreparedStatement stmt = c.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setIdEmpleado(rs.getInt("id_empleado"));
                empleado.setPrimerNombre(rs.getString("primer_nombre"));
                empleado.setSegundoNombre(rs.getString("segundo_nombre"));
                empleado.setPrimerApellido(rs.getString("primer_apellido"));
                empleado.setSegundoApellido(rs.getString("segundo_apellido"));
                empleado.setCelular(rs.getString("celular"));
                empleado.setCargo(rs.getString("cargo"));
                empleado.setFechaContratacion(rs.getDate("fecha_contratacion"));
                empleados.add(empleado);
            }
        }
        return empleados;
    }

    public static void main(String[] args) {
        try {
            EmpleadoDAO dao = new EmpleadoDAO();
            Empleado e1 = new Empleado();
            e1.setPrimerNombre("María");
            e1.setSegundoNombre("Luisa");
            e1.setPrimerApellido("Rodríguez");
            e1.setSegundoApellido("López");
            e1.setCelular("87654321");
            e1.setCargo("Vendedor");
            e1.setFechaContratacion(new Date());
            dao.crearEmpleado(e1);
            System.out.println("Empleado creado con éxito!");
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
