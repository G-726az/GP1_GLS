package Class;

import static Class.Datos.productos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OrdRep{
         public static void ordenarPorNombre(Scanner read) {
                  System.out.println("\n¿Orden?");
                  System.out.println("1. Ascendente (A-Z)");
                  System.out.println("2. Descendente (Z-A)");
                  System.out.print("==> "); int orden = leerEntero(read);
                  StringBuilder reporte = new StringBuilder();
                  productos.stream()
                           .sorted((p1, p2) -> orden == 1 ? p1.getNombre().compareToIgnoreCase(p2.getNombre()) : p2.getNombre().compareToIgnoreCase(p1.getNombre()))
                           .forEach(p -> {System.out.println(p);reporte.append(p).append("\n");});
                  GuardarRep(read, reporte.toString(), "Reporte_OrdenNombre");
         }

         public static void ordenarPorPrecio(Scanner read) {
                  System.out.println("\n¿Orden?");
                  System.out.println("1. Menor a mayor");
                  System.out.println("2. Mayor a menor");
                  System.out.print("==> "); int orden = leerEntero(read);
                  productos.stream()
                           .sorted((p1, p2) -> orden == 1 ? Double.compare(p1.getPrecio(), p2.getPrecio()) : Double.compare(p2.getPrecio(), p1.getPrecio()))
                           .forEach(System.out::println);
         }

         private static void GuardarRep(Scanner read, String contenido, String nombreReporte) {
                  System.out.println("\n¿Desea guardar este reporte en un archivo TXT?");
                  System.out.println("1. Sí");
                  System.out.println("2. No");
                  System.out.print("==> "); int opcion = leerEntero(read);
                           if (opcion == 1) {String timestamp = java.time.LocalDate.now().toString().replace(":", "-").replace(".", "-");SaveTXT(contenido, nombreReporte + "_" + timestamp);}
         }

         private static void SaveTXT(String contenido, String nombreArchivo) {
                  String ruta = "C:\\BASE\\" + nombreArchivo + ".txt";
                           try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
                                    writer.write(contenido);System.out.println(" Reporte guardado. \nRuta: "+ruta);
                           } catch (IOException e) { System.err.println("Error al guardar el reporte: "); }
         }

         public static int leerEntero(Scanner readnum) {
                  while (!readnum.hasNextInt()) { System.out.println("Error: debe ingresar un número."); readnum.next();}
                  int num = readnum.nextInt(); readnum.nextLine(); return num;
         }
         
         public static double leerDouble(Scanner readnum) {
                  while (!readnum.hasNextDouble()) { System.out.println("Error: debe ingresar un número válido."); readnum.next(); }
                  double num = readnum.nextDouble(); readnum.nextLine(); return num;
         }
    
    
    
    
    
    
}
