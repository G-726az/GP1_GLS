package Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Datos {
    public static List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto("Laptop", 1200, Categoria.ELECTRONICA),
            new Producto("Camiseta", 25, Categoria.ROPA),
            new Producto("Leche", 3, Categoria.ALIMENTACION),
            new Producto("Silla", 85, Categoria.HOGAR),
            new Producto("Televisor", 500, Categoria.ELECTRONICA),
            new Producto("Pantalon", 50, Categoria.ROPA),
            new Producto("Cereal", 5, Categoria.ALIMENTACION)
    ));
}
