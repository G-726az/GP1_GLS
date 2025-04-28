package gp1_gls;

import Class.Categoria;
import Class.Datos;
import Class.ProcesadorProductos;
import Class.Producto;
import java.util.Scanner;

public class Ges_Mn_7 {
    public static void men7(Scanner read,Scanner readnum) { menuaccion7(read,readnum); }
         private static void menuaccion7(Scanner read,Scanner readnum) {
             boolean regresar = false;
                    while (!regresar) {
                  System.out.println("___ Menu | Gestion de Datos ___");
                  System.out.println("1. Eliminar Datos");
                  System.out.println("2. Agregar Datos");
                  System.out.println("3. Visualizar datos");
                  System.out.println("4. Regresar");
                  System.out.print("==> ");
                  while (!readnum.hasNextInt()) {System.out.println("ADVERTENCIA, Para realizar dicha accion debe ingresar un numero de la lista!!!");readnum.next();System.out.print("==> ");}
                  int opcion = readnum.nextInt();
                           switch (opcion) {
                                    case 1:
                                             System.out.println("___ Menu | Eliminar Datos ___");
                                             System.out.print("AVISO: Esta por eliminar los datos.\n¿Desea Eliminar datos? (s/n): "); char dats = read.nextLine().charAt(0);
                                             if (dats=='s') { Datos.productos.clear(); System.out.println("\nAviso: Los datos han sido eliminados");} else{ System.out.println("Accion Cancelada"); }
                                    break;
                                    case 2:
                                             System.out.println("___ Menu | Agregar Datos ___"); boolean Agregar = true;
                                             while (Agregar) {
                                                      System.out.print("Ingrese el nombre del producto: "); String nombre = read.nextLine();
                                                      System.out.print("Ingrese el precio del producto: "); double precio = leerDouble(read);
                                                      Categoria categoria = seleccionarCategoria(read);
                                                      Datos.productos.add(new Producto(nombre, precio, categoria));
                                                      System.out.println("|| Producto agregado exitosamente.");
                                                      System.out.print("\n¿Desea agregar otro producto? (s/n): ");String respuesta = read.nextLine(); Agregar = respuesta.equalsIgnoreCase("s");
                                             } /* Fin While Agregar */
                                    break;
                                    case 3:
                                             ProcesadorProductos.obtenerProductos(Datos.productos).forEach(System.out::println);
                                    break;
                                    case 4:
                                             regresar = true;System.out.println("||  PROGRAMA FINALIZADO  ||");
                                    break;
                                    default: System.out.println("\nADVERTENCIA || SELECCIONE UN NUMERO DEL '1' AL '4' ||");} /* Fin switch Main */
                  } /* Fin While regresar */
    } /* Fin Vopid menuaccion7 */
         private static Categoria seleccionarCategoria(Scanner readnum) {
                  System.out.println("Seleccione la categoría:");
                  for (int i = 0; i < Categoria.values().length; i++) { System.out.println((i + 1) + ". " + Categoria.values()[i]); }
                  int opcion;
                  do {
                           System.out.print("Ingrese el número correspondiente: ");
                           opcion = leerEntero(readnum);
                           if (opcion < 1 || opcion > Categoria.values().length) {System.out.println("Opción inválida. Intente nuevamente.");}
                  } while (opcion < 1 || opcion > Categoria.values().length);
                  return Categoria.values()[opcion - 1];
         } /* Fin Static Categoria */
         
         private static int leerEntero(Scanner readnum) {
                  while (!readnum.hasNextInt()) { System.out.println("Error: debe ingresar un número."); readnum.next();}
                  int num = readnum.nextInt(); readnum.nextLine(); return num;
         }
         
         private static double leerDouble(Scanner readnum) {
                  while (!readnum.hasNextDouble()) { System.out.println("Error: debe ingresar un número válido."); readnum.next(); }
                  double num = readnum.nextDouble(); readnum.nextLine(); return num;
         }
}
