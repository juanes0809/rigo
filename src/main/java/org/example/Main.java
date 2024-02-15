package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuario;
        String contrasena;
        String usuarioBD="rigo";
        String contrasenaBD="r123";
        String correo;
        Integer opcion;

        Scanner lea = new Scanner(System.in);

        System.out.println("****Groseria****");
        System.out.println("**********************");
        System.out.println("Apreciado usuario; inicie sesion por favor: ");
        int intentosRealizados=0;
        int intentosMaximos=3;

        while (intentosRealizados<intentosMaximos){
            System.out.println("digite su usuario: ");
            usuario=lea.nextLine();
            if (usuario.equals(usuarioBD)){
                System.out.println("ingrese contraseña para: "+usuario);
                contrasena=lea.nextLine();
                if (contrasena.equals(contrasenaBD)){
                    System.out.println("iniciando sesion...");
                    System.out.println("1. ingresar orden.");
                    System.out.println("2. modificar orden.");
                    System.out.println("3. terminar orden.");
                    System.out.println("4. calcular total. ");
                    System.out.println("5. salir. ");
                    int opciones=lea.nextInt();
                    break;
                }else {
                    System.out.println("contraseña incorrecta ");
                }
            }else {
                System.out.println("usuario incorrecto");
            }
            intentosRealizados++;
        }
        do {
            System.out.println("Seleccione una opcion: ");
            opcion=lea.nextInt();

            Integer cantidadEntradaCangrejo=0;
            Integer cantidadEscalopes=0;
            Integer cantidadFileteFrancia=0;
            Integer cantidadCorvina=0;
            Integer cantidadCoctel=0;
            Integer cantidadJugo=0;

            Integer productoSeleccionado;
            switch (opcion) {
                case 1:
                    System.out.println("1. Entrada de cangrejo ($28000)");
                    System.out.println("2. Escalopes a la rigo ($35000)");
                    System.out.println("3. Filete tour francia ($150000)");
                    System.out.println("4. Corvina de rigo ($80000)");
                    System.out.println("5. Coctel Michelle ($20000)");
                    System.out.println("6. Jugos de urraro ($18500)");
                    System.out.println("7. Enviar Pedido");
                    System.out.println("................................");

                    do {
                        System.out.println("Digite producto deseado: ");
                        productoSeleccionado=lea.nextInt();
                        switch (productoSeleccionado){
                            case 1:
                                System.out.println("Digita cuantas entradas desea: ");
                                cantidadEntradaCangrejo=lea.nextInt();
                                break;
                            case 2:
                                System.out.println("Digita cuantos escalopes desea: ");
                                cantidadEscalopes=lea.nextInt();
                                break;
                            case 3:
                                System.out.println("Digita cuantos filetes tour de francia desea: ");
                                cantidadFileteFrancia=lea.nextInt();
                                break;
                            case 4:
                                System.out.println("Digita cuantas corvina de rigo desea: ");
                                cantidadCorvina=lea.nextInt();
                                break;
                            case 5:
                                System.out.println("Digita cuantos cocteles desea: ");
                                cantidadCoctel=lea.nextInt();
                                break;
                            case 6:
                                System.out.println("Digitas cuantos jugos desea: ");
                                cantidadJugo=lea.nextInt();
                                break;
                            case 7:
                                System.out.println("-Orden terminada-");
                                break;
                            default:
                                System.out.println("_Producto no encontrado_");
                                break;
                        }
                    }while (productoSeleccionado!=7);
                    break;
                case 2:
                    Integer totalSinPropina=((cantidadEntradaCangrejo*28000)+(cantidadEscalopes*35000)+(cantidadFileteFrancia*150000)+(cantidadCorvina*80000)+(cantidadCoctel*20000)+(cantidadJugo*18500));
                    Double totalConPropina=((totalSinPropina)+(totalSinPropina*0.1));
                    //Rutina para mostrar un mensaje con o sin propina

                    break;
                case 3:
                    //Volver a mostrar cada uno de los productos
                    //En que estan asignados cada uno de los contadores
                    break;
                case 4:
                    System.out.println("-Compra Terminada-");
                    break;
                default:
                    System.out.println("*Opcion Invalida*");
                    break;
            }

        }while (opcion !=4);





    }
}