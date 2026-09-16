package com.petshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PetshopDAO {

    public void registrarFuncionario(String nombre, String apellido, String usuario,
                                     String contrasena, String rol) {

        String sql = "INSERT INTO funcionario (nombre, apellido, usuario, contrasena, rol) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, usuario);
            ps.setString(4, contrasena);
            ps.setString(5, rol);

            ps.executeUpdate();

            System.out.println("Funcionario registrado correctamente.");

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al registrar funcionario: " + e.getMessage());
        }
    }

    public void mostrarFuncionarios() {

        String sql = "SELECT * FROM funcionario";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("FUNCIONARIOS");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id_funcionario")
                    + " | Nombre: " + rs.getString("nombre")
                    + " " + rs.getString("apellido")
                    + " | Usuario: " + rs.getString("usuario")
                    + " | Rol: " + rs.getString("rol")
                );
            }

            rs.close();
            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar funcionarios: " + e.getMessage());
        }
    }

    public void registrarCliente(String cedula, String nombre, String apellido,
                                  String telefono, String email) {

        String sql = "INSERT INTO cliente (cedula, nombre, apellido, telefono, email) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, telefono);
            ps.setString(5, email);

            ps.executeUpdate();

            System.out.println("Cliente registrado correctamente.");

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al registrar cliente: " + e.getMessage());
        }
    }

    public void mostrarClientes() {

        String sql = "SELECT * FROM cliente";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("CLIENTES");

            while (rs.next()) {
                System.out.println(
                    "Cedula: " + rs.getString("cedula")
                    + " | Nombre: " + rs.getString("nombre")
                    + " " + rs.getString("apellido")
                    + " | Telefono: " + rs.getString("telefono")
                    + " | Email: " + rs.getString("email")
                );
            }

            rs.close();
            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar clientes: " + e.getMessage());
        }
    }


    public void registrarMascota(String nombre, String especie, String raza,
                                  int edad, String cedulaCliente) {

        String sql = "INSERT INTO mascota "
                   + "(nombre, especie, raza, edad, cedula_cliente) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setString(2, especie);
            ps.setString(3, raza);
            ps.setInt(4, edad);
            ps.setString(5, cedulaCliente);

            ps.executeUpdate();

            System.out.println("Mascota registrada correctamente.");

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al registrar mascota: " + e.getMessage());
        }
    }

    public void mostrarMascotas() {

        String sql = "SELECT * FROM mascota";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("MASCOTAS");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id_mascota")
                    + " | Nombre: " + rs.getString("nombre")
                    + " | Especie: " + rs.getString("especie")
                    + " | Raza: " + rs.getString("raza")
                    + " | Edad: " + rs.getInt("edad")
                    + " | Cedula dueño: " + rs.getString("cedula_cliente")
                );
            }

            rs.close();
            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar mascotas: " + e.getMessage());
        }
    }


    public void registrarServicio(String nombre) {

        String sql = "INSERT INTO servicio (nombre) VALUES (?)";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, nombre);

            ps.executeUpdate();

            System.out.println("Servicio registrado correctamente.");

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al registrar servicio: " + e.getMessage());
        }
    }

    public void mostrarServicios() {

        String sql = "SELECT * FROM servicio";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("SERVICIOS");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id_servicio")
                    + " | Nombre: " + rs.getString("nombre")
                );
            }

            rs.close();
            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar servicios: " + e.getMessage());
        }
    }


    public void registrarSolicitud(String fecha, int idMascota,
                                    int idServicio, String cedulaCliente) {

        String sql = "INSERT INTO solicitud "
                   + "(fecha, id_mascota, id_servicio, cedula_cliente) "
                   + "VALUES (?, ?, ?, ?)";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, fecha);
            ps.setInt(2, idMascota);
            ps.setInt(3, idServicio);
            ps.setString(4, cedulaCliente);

            ps.executeUpdate();

            System.out.println("Solicitud registrada correctamente.");

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al registrar solicitud: " + e.getMessage());
        }
    }

    public void mostrarSolicitudes() {

        String sql = "SELECT * FROM solicitud";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("SOLICITUDES");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id_solicitud")
                    + " | Fecha: " + rs.getString("fecha")
                    + " | Mascota: " + rs.getInt("id_mascota")
                    + " | Servicio: " + rs.getInt("id_servicio")
                    + " | Cedula cliente: " + rs.getString("cedula_cliente")
                );
            }

            rs.close();
            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar solicitudes: " + e.getMessage());
        }
    }


    public void registrarAgenda(String fecha, String hora, int idSolicitud,
                                 int idFuncionario, String estado) {

        String sql = "INSERT INTO agenda "
                   + "(fecha, hora, id_solicitud, id_funcionario, estado) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, fecha);
            ps.setString(2, hora);
            ps.setInt(3, idSolicitud);
            ps.setInt(4, idFuncionario);
            ps.setString(5, estado);

            ps.executeUpdate();

            System.out.println("Agenda registrada correctamente.");

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al registrar agenda: " + e.getMessage());
        }
    }

    public void mostrarAgenda() {

        String sql = "SELECT * FROM agenda";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("AGENDA");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id_agenda")
                    + " | Fecha: " + rs.getString("fecha")
                    + " | Hora: " + rs.getString("hora")
                    + " | Solicitud: " + rs.getInt("id_solicitud")
                    + " | Funcionario: " + rs.getInt("id_funcionario")
                    + " | Estado: " + rs.getString("estado")
                );
            }

            rs.close();
            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar agenda: " + e.getMessage());
        }
    }

 

    public void registrarConsulta(String fecha, String descripcion,
                                   String cedulaCliente, int idFuncionario) {

        String sql = "INSERT INTO consulta "
                   + "(fecha, descripcion, cedula_cliente, id_funcionario) "
                   + "VALUES (?, ?, ?, ?)";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, fecha);
            ps.setString(2, descripcion);
            ps.setString(3, cedulaCliente);
            ps.setInt(4, idFuncionario);

            ps.executeUpdate();

            System.out.println("Consulta registrada correctamente.");

            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al registrar consulta: " + e.getMessage());
        }
    }

    public void mostrarConsultas() {

        String sql = "SELECT * FROM consulta";

        try {
            Connection conexion = Conexion.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("CONSULTAS");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id_consulta")
                    + " | Fecha: " + rs.getString("fecha")
                    + " | Descripcion: " + rs.getString("descripcion")
                    + " | Cedula cliente: " + rs.getString("cedula_cliente")
                    + " | Funcionario: " + rs.getInt("id_funcionario")
                );
            }

            rs.close();
            ps.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar consultas: " + e.getMessage());
        }
    }
}