package Class;

import java.util.*;
import java.util.stream.Collectors;

public class ProcesadorProductos {

         public static List<Producto> obtenerProductosCaros(List<Producto> productos) { return productos.stream().filter(p -> p.getPrecio() > 100).collect(Collectors.toList()); }

         public static List<String> obtenerNombresProductos(List<Producto> productos) { return productos.stream().map(Producto::getNombre).collect(Collectors.toList()); }
        
         public static List<Producto> obtenerProductos(List<Producto> productos) { return productos.stream().collect(Collectors.toList()); }

         public static double calcularPrecioTotal(List<Producto> productos) { return productos.stream().mapToDouble(Producto::getPrecio).sum(); }

         public static Map<Categoria, List<Producto>> agruparPorCategoria(List<Producto> productos) { return productos.stream().collect(Collectors.groupingBy(Producto::getCategoria)); }

         public static Optional<Producto> encontrarProductoMasCaro(List<Producto> productos) { return productos.stream().max(Comparator.comparingDouble(Producto::getPrecio)); }

         public static long contarProductosBaratos(List<Producto> productos) { return productos.stream().filter(p -> p.getPrecio() < 80).count(); }
}
