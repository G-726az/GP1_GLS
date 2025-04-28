package gp1_gls;

import static Class.Datos.productos;
import static Class.OrdRep.ordenarPorNombre;
import static Class.OrdRep.ordenarPorPrecio;
import Class.ProcesadorProductos;
import Class.Producto;
import Class.Categoria;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Gestion_Rep {
         public static void menu_act8(Scanner read,Scanner readnum){
                  boolean regresar = false;
                  while (!regresar) {
                           System.out.println("____ Manu | Reportes ____");
                           System.out.println("1. Mostrar todos los productos");
                           System.out.println("2. Ordenar por nombre (A-Z / Z-A)");
                           System.out.println("3. Ordenar por precio (menor a mayor / mayor a menor)");
                           System.out.println("4. Agrupar productos por categoría");
                           System.out.println("5. Regresar");
                           System.out.print("==> ");
                           while (!readnum.hasNextInt()) {System.out.println("ADVERTENCIA, Para realizar dicha accion debe ingresar un numero de la lista!!!");readnum.next();System.out.print("==> ");}
                           int opcion = readnum.nextInt();
                           switch (opcion) {
                                    case 1:
                                             productos.forEach(System.out::println);
                                    break;
                                    case 2:
                                             ordenarPorNombre(read);
                                    break;
                                    case 3:
                                             ordenarPorPrecio(read);
                                    break;
                                    case 4:
                                             Map<Categoria, List<Producto>> agrupados = ProcesadorProductos.agruparPorCategoria(productos);
                                             agrupados.forEach((categoria, lista) -> {System.out.println("\n" + categoria + ":"); lista.forEach(System.out::println);});
                                    break;
                                    case 5:
                                             regresar = true;System.out.println("||  PROGRAMA FINALIZADO  ||");
                                    break;
                                    default: System.out.println("\nADVERTENCIA || SELECCIONE UN NUMERO DEL '1' AL '5' ||");} /* Fin switch Main*/
                  } /* Fin While Principal SALIR */
} /* Fin Void menu_act8 */
} /* Fin Class Gestion_Rep */
