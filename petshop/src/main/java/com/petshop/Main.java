package com.petshop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PetshopDAO dao = new PetshopDAO();

        int opcion = 0;

        while (opcion != 15) {

            System.out.println("PETSHOP");
            System.out.println("1. Registrar funcionario");
            System.out.println("2. Mostrar funcionarios");
            System.out.println("3. Registrar cliente");
            System.out.println("4. Mostrar clientes");
            System.out.println("5. Registrar mascota");
            System.out.println("6. Mostrar mascotas");
            System.out.println("7. Registrar servicio");
            System.out.println("8. Mostrar servicios");
            System.out.println("9. Registrar solicitud");
            System.out.println("10. Mostrar solicitudes");
            System.out.println("11. Registrar agenda");
            System.out.println("12. Mostrar agenda");
            System.out.println("13. Registrar consulta");
            System.out.println("14. Mostrar consultas");
            System.out.println("15. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("REGISTRAR FUNCIONARIO");

                    System.out.print("Nombre: ");
                    String nombreFuncionario = sc.nextLine();

                    System.out.print("Apellido: ");
                    String apellidoFuncionario = sc.nextLine();

                    System.out.print("Usuario: ");
                    String usuario = sc.nextLine();

                    System.out.print("Contrasena: ");
                    String contrasena = sc.nextLine();

                    System.out.print("Rol: ");
                    String rol = sc.nextLine();

                    dao.registrarFuncionario(
                            nombreFuncionario,
                            apellidoFuncionario,
                            usuario,
                            contrasena,
                            rol
                    );

                    break;

                case 2:

                    dao.mostrarFuncionarios();

                    break;

                case 3:

                    System.out.println("REGISTRAR CLIENTE");

                    System.out.print("Cedula: ");
                    String cedula = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombreCliente = sc.nextLine();

                    System.out.print("Apellido: ");
                    String apellidoCliente = sc.nextLine();

                    System.out.print("Telefono: ");
                    String telefono = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    dao.registrarCliente(
                            cedula,
                            nombreCliente,
                            apellidoCliente,
                            telefono,
                            email
                    );

                    break;

                case 4:

                    dao.mostrarClientes();

                    break;

                case 5:

                    System.out.println("REGISTRAR MASCOTA");

                    System.out.print("Nombre: ");
                    String nombreMascota = sc.nextLine();

                    System.out.print("Especie: ");
                    String especie = sc.nextLine();

                    System.out.print("Raza: ");
                    String raza = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Cedula del dueño: ");
                    String cedulaClienteMascota = sc.nextLine();

                    dao.registrarMascota(
                            nombreMascota,
                            especie,
                            raza,
                            edad,
                            cedulaClienteMascota
                    );

                    break;

                case 6:

                    dao.mostrarMascotas();

                    break;

                case 7:

                    System.out.println("REGISTRAR SERVICIO");

                    System.out.print("Nombre del servicio: ");
                    String nombreServicio = sc.nextLine();

                    dao.registrarServicio(nombreServicio);

                    break;

                case 8:

                    dao.mostrarServicios();

                    break;

                case 9:

                    System.out.println("REGISTRAR SOLICITUD");

                    System.out.print("Fecha: ");
                    String fechaSolicitud = sc.nextLine();

                    System.out.print("ID de la mascota: ");
                    int idMascota = sc.nextInt();

                    System.out.print("ID del servicio: ");
                    int idServicio = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Cedula del cliente: ");
                    String cedulaSolicitud = sc.nextLine();

                    dao.registrarSolicitud(
                            fechaSolicitud,
                            idMascota,
                            idServicio,
                            cedulaSolicitud
                    );

                    break;

                case 10:

                    dao.mostrarSolicitudes();

                    break;

                case 11:

                    System.out.println("REGISTRAR AGENDA");

                    System.out.print("Fecha: ");
                    String fechaAgenda = sc.nextLine();

                    System.out.print("Hora: ");
                    String horaAgenda = sc.nextLine();

                    System.out.print("ID de la solicitud: ");
                    int idSolicitud = sc.nextInt();

                    System.out.print("ID del funcionario: ");
                    int idFuncionarioAgenda = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Estado: ");
                    String estado = sc.nextLine();

                    dao.registrarAgenda(
                            fechaAgenda,
                            horaAgenda,
                            idSolicitud,
                            idFuncionarioAgenda,
                            estado
                    );

                    break;

                case 12:

                    dao.mostrarAgenda();

                    break;

                case 13:

                    System.out.println("REGISTRAR CONSULTA");

                    System.out.print("Fecha: ");
                    String fechaConsulta = sc.nextLine();

                    System.out.print("Descripcion: ");
                    String descripcion = sc.nextLine();

                    System.out.print("Cedula del cliente: ");
                    String cedulaConsulta = sc.nextLine();

                    System.out.print("ID del funcionario: ");
                    int idFuncionarioConsulta = sc.nextInt();
                    sc.nextLine();

                    dao.registrarConsulta(
                            fechaConsulta,
                            descripcion,
                            cedulaConsulta,
                            idFuncionarioConsulta
                    );

                    break;

                case 14:

                    dao.mostrarConsultas();

                    break;

                case 15:

                    System.out.println("Programa finalizado.");
                    break;

                default:

                    System.out.println("Opcion incorrecta.");
            }
        }

        sc.close();
    }
}