package gp1_gls;

import static gp1_gls.Gestion_Main.menu_act1;
import static gp1_gls.Gestion_Main.menu_act2;
import static gp1_gls.Gestion_Main.menu_act3;
import static gp1_gls.Gestion_Main.menu_act4;
import static gp1_gls.Gestion_Main.menu_act5;
import static gp1_gls.Gestion_Main.menu_act6;
import static gp1_gls.Gestion_Main.menu_act7;
import static gp1_gls.Gestion_Rep.menu_act8;

import java.util.Scanner;
import java.io.File;

public class GP1_GLS{
    public static void main(String[] args){
/*Sc*/ Scanner read = new Scanner(System.in); Scanner readnum = new Scanner(System.in);
         boolean salir = false; CraBASE();
         while (!salir) {
                  System.out.println("\033[H\033[2J" + "\n_________________________________________________\n|||||    MENU PRINCIPAL | ACTIVIDADES  |||||");
                  System.out.println("1. Actividad 1 | Mostrar productos caros (> 100)");
                  System.out.println("2. Actividad 2 | Mostrar nombres de productos");
                  System.out.println("3. Actividad 3 | Calcular precio total");
                  System.out.println("4. Actividad 4 | Agrupar productos por categoria");
                  System.out.println("5. Actividad 5 | Encontrar producto mas caro");
                  System.out.println("6. Actividad 6 | Contar productos baratos (< 80)");
                  System.out.println("7. Actividad 7 | Gestion Productos");
                  System.out.println("8. Actividad 8 | Reportes");
                  System.out.println("9. SALIR");
                  System.out.print("==> ");
                  while (!readnum.hasNextInt()) {System.out.println("ADVERTENCIA, Para realizar dicha accion debe ingresar un numero de la lista!!!");readnum.next();System.out.print("==> ");}
                  int opcion = readnum.nextInt();
                           switch (opcion) {
                                    case 1:
                                             menu_act1();
                                    break;
                                    case 2:
                                             menu_act2();
                                    break;
                                    case 3:
                                             menu_act3();
                                    break;
                                    case 4:
                                             menu_act4();
                                    break;
                                    case 5:
                                             menu_act5();
                                    break;
                                    case 6:
                                             menu_act6();
                                    break;
                                    case 7:
                                             menu_act7(read,readnum);
                                    break;
                                    case 8:
                                             menu_act8(read,readnum);
                                    break;
                                    case 9:
                                             salir = true;System.out.println("||  PROGRAMA FINALIZADO  ||");
                                    break;
                                    default: System.out.println("\nADVERTENCIA || SELECCIONE UN NUMERO DEL '1' AL '5' ||");} /* Fin switch Main*/
        }/*Fin While Principal SALIR*/
        read.close(); readnum.close(); /*Close Scanner*/
    }/*Fin Static Void*/
    public static void CraBASE(){
        /* Verificacion de carpeta en archivos locales para gaurdar datos de B.O.O.*/
        String basePath = "C:\\BASE";
        
         /* Verificar y crear la carpeta si no existe*/
         File baseDir = new File(basePath);
         if (!baseDir.exists()) {
           if (baseDir.mkdirs()) {System.out.println("La carpeta 'BASE' fue creada con éxito en: " + basePath);
              } else { System.err.println("Error: No se pudo crear la carpeta 'BASE' en: " + basePath); }
         } else { System.out.println("La carpeta 'BASE' ya existe en: " + basePath); }
    }
}/*Fin Class*/
