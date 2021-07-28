/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.PostPagoMegas;
import paquete2.PostPagoMiMe;
import paquete2.PostPagoMiMeEco;
import paquete2.PostPagoMinutos;
import paquete3.EscrituraArchivoSecuencial;
import paquete3.LecturaArchivoSecuencial;

/**
 *
 * @author DELL
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Empresa Telefonica");

        int opcion;
        String nom = "";
        String ape = "";
        String ide = "";
        String nombreArchivo = "PlanCelular.data";
        ArrayList<PlanCelular> plan = new ArrayList<>();
        do {
            System.out.println("\nIngrese el numero de opcion a realizar\n"
                    + "1.Plan PostPagoMinutos\n"
                    + "2.Plan PostPagoMegas\n"
                    + "3.Plan PostPagoMinutosMegas\n"
                    + "4.Plan PostPagoMinutosMegasEconomico\n"
                    + "5.Mostrar los planes:\n"
                    + "6.Salir\n");
            opcion = sc.nextInt();
            if (opcion < 5) {
                System.out.println("====PRIPIETARIO====");
                System.out.println("Ingrese su Nombre:");
                nom = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingrese su Apellido: ");
                ape = sc.nextLine();
                System.out.println("Ingrese su Identificacion: ");
                ide = sc.nextLine();
            }
            Persona pe = new Persona(nom, ape, ide);

            switch (opcion) {
                case 1:
                    System.out.println("====PLAN POST PAGO MINUTOS  ====");
                    System.out.println("Ingrese la Ciudad: ");
                    String ci = sc.nextLine();
                    System.out.println("Ingrese la marca del celular: ");
                    String ma = sc.nextLine();
                    System.out.println("Ingrese Modelo del Celular: ");
                    String mo = sc.nextLine();
                    System.out.println("Ingrese Numero del Celular: ");
                    String nu = sc.nextLine();
                    System.out.println("Ingrese Minutos Nacionales: ");
                    int mn = sc.nextInt();
                    System.out.println("Ingrese Costo Minuto Nacional: ");
                    double cs = sc.nextDouble();
                    System.out.println("Ingrese Minutos Internacionales: ");
                    int mi = sc.nextInt();
                    System.out.println("Ingrese costo Minutos "
                            + "Internacionales: ");
                    double cmi = sc.nextDouble();
                    PostPagoMinutos PlanMinutos = new PostPagoMinutos(pe, ci,
                            ma,
                            mo, nu, mn, cs, mi, cmi);
                    PlanMinutos.establecerPagoMensual();
                    plan.add(PlanMinutos);
                    //System.out.println(PlanMinutos);
                    break;
                case 2:
                    System.out.println("====PLAN POST PAGO MEGAS ====");
                    System.out.println("Ingrese la Ciudad: ");
                    String ciu = sc.nextLine();
                    System.out.println("Ingrese la marca del celular: ");
                    String mar = sc.nextLine();
                    System.out.println("Ingrese Modelo del Celular: ");
                    String mod = sc.nextLine();
                    System.out.println("Ingrese Numero del Celular: ");
                    String num = sc.nextLine();
                    System.out.println("Ingrese las megas expresadas en"
                            + " gigas: ");
                    int meg = sc.nextInt();
                    System.out.println("Ingrese Costo por cada Gigas: ");
                    double cosm = sc.nextDouble();
                    System.out.println("Ingrese la Tarifa Base: ");
                    double ta = sc.nextDouble();
                    PostPagoMegas PlanMegas = new PostPagoMegas(pe, ciu, mar,
                            mod, num, meg, cosm, ta);
                    PlanMegas.establecerPagoMensual();
                    plan.add(PlanMegas);
                    break;
                case 3:
                    System.out.println("====PLAN POST PAGO MINUTOS MEGAS ====");
                    System.out.println("Ingrese la Ciudad: ");
                    String ciud = sc.nextLine();
                    System.out.println("Ingrese la marca del celular: ");
                    String marc = sc.nextLine();
                    System.out.println("Ingrese Modelo del Celular: ");
                    String mode = sc.nextLine();
                    System.out.println("Ingrese Numero del Celular: ");
                    String nume = sc.nextLine();
                    System.out.println("Ingrese el numero de minutos"
                            + "que consume");
                    int min = sc.nextInt();
                    System.out.println("Ingrese el costo de minutos de "
                            + "su Plan");
                    double costoMin = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese las megas expresado en Gigas");
                    int megas = sc.nextInt();

                    System.out.println("Ingrese el Costo por cada Gigas");
                    double costo = sc.nextDouble();
                    PostPagoMiMe PostMiMe = new PostPagoMiMe(pe, ciud, marc,
                            mode,
                            nume, min, costoMin, megas, costo);

                    PostMiMe.establecerPagoMensual();
                    plan.add(PostMiMe);
                    break;
                case 4:
                    System.out.println("====PLAN POST PAGO MINUTOS MEGAS "
                            + "ECONOMICO====");
                    System.out.println("Ingrese la Ciudad: ");
                    String ciud2 = sc.nextLine();
                    System.out.println("Ingrese la marca del celular: ");
                    String marc2 = sc.nextLine();
                    System.out.println("Ingrese Modelo del Celular: ");
                    String mode2 = sc.nextLine();
                    System.out.println("Ingrese Numero del Celular: ");
                    String nume2 = sc.nextLine();
                    System.out.println("Ingrese el numero de minutos"
                            + "que consume");
                    int min2 = sc.nextInt();
                    System.out.println("Ingrese el costo de minutos de "
                            + "su Plan");
                    double costoMin2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese las megas expresado en Gigas");
                    int megas2 = sc.nextInt();

                    System.out.println("Ingrese el Costo por cada Gigas");
                    double costo2 = sc.nextDouble();
                    System.out.println("Ingrese el Porcentaje de Descuento: ");
                    double po = sc.nextDouble();
                    PostPagoMiMeEco PostPagoEco = new PostPagoMiMeEco(pe,
                            ciud2,
                            marc2,
                            mode2, nume2, min2, costoMin2,
                            megas2, costo2, po);
                    PostPagoEco.establecerPagoMensual();
                    plan.add(PostPagoEco);
                    //System.out.println();

                    break;
                case 5:
                    LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
                    lectura.establecerListaPlan();
                    System.out.println(lectura);
                    break;
                case 6:
                    System.out.println("Su plan a sido acreditado exitosamente,"
                            + " vuelva pronto");
                    System.out.println("Gracias Por preferirnos");
                    break;
            }
            EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);
            for (int i = 0; i < plan.size(); i++) {
                plan.get(i).establecerPagoMensual();
                archivo.establecerRegistro(plan.get(i));
                archivo.establecerSalida();
            }
            archivo.cerrarArchivo();

        } while (opcion != 6);

    }
}
