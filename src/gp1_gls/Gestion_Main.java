package gp1_gls;

import Class.Producto;
import Class.Categoria;
import Class.ProcesadorProductos;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import Class.Datos;
import static gp1_gls.Ges_Mn_7.men7;

public class Gestion_Main {
    
         public static void menu_act1()
                  {
                           ProcesadorProductos.obtenerProductosCaros(Datos.productos).forEach(System.out::println);
                  }
         public static void menu_act2()
                  {
                           ProcesadorProductos.obtenerNombresProductos(Datos.productos).forEach(System.out::println);
                  }
         public static void menu_act3()
                  {
                           System.out.println("Precio total: " + ProcesadorProductos.calcularPrecioTotal(Datos.productos));
                  }
         public static void menu_act4()
                  {
                           Map<Categoria, List<Producto>> agrupados = ProcesadorProductos.agruparPorCategoria(Datos.productos);
                           agrupados.forEach((categoria, lista) -> { System.out.println(categoria + ":"); lista.forEach(System.out::println); });
                  }
         public static void menu_act5()
                  {
                           ProcesadorProductos.encontrarProductoMasCaro(Datos.productos).ifPresent(System.out::println);
                  }
         public static void menu_act6()
                  {
                           System.out.println("Cantidad de productos baratos: " + ProcesadorProductos.contarProductosBaratos(Datos.productos));
                  }
         public static void menu_act7(Scanner read, Scanner readnum)
                  {
                           men7(read,readnum);
                  }
}
