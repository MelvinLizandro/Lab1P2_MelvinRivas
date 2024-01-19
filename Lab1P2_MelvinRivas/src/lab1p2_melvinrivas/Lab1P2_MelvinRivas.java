/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_melvinrivas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.regex.Matcher;

/**
 *
 * @author l3306
 */
public class Lab1P2_MelvinRivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        Pattern simbolos = Pattern.compile("[^?=!><$%]");
        ArrayList<Regis> regi = new ArrayList<>();

        //op = opciones
        int op = 0;
        do {
            System.out.println("1. Registrar usuario");
            System.out.println("2. Listar todo");
            System.out.println("3. Listar por dominio");
            System.out.println("4. Salir");
            System.out.print("Que deesea realizar: ");

            op = input.nextInt();

            switch (op) {
                case 1: {
                    System.out.print("Ingrese su nombre: ");
                    //nom = nombre
                    String nom = input.nextLine();
                    nom = input.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    String apellido = input.nextLine();
                    int veriaño = 0;
                    int veriaño2 = 0;
                    int verimeses = 0;
                    int verimeses2 = 0;
                    int veridias = 0;
                    int veridias2 = 0;
                    Date fecha2;
                    boolean edad = false;
                    do {
                        System.out.print("Ingrese su fecha ejemplo(10/12/2022): ");
                        //fecha1 = lo pido como string para despues usar parse y Simpledate format para poder 
                        //pasarlo date
                        String fecha1 = input.nextLine();
                        SimpleDateFormat ajusfec = new SimpleDateFormat("dd/MM/yyyy");
                        fecha2 = ajusfec.parse(fecha1);
                        veriaño = fecha2.getYear();
                        Date fecactual = new Date();
                        veriaño2 = fecactual.getYear();
                        veriaño2 = veriaño2 - 13;
                        if (veriaño2 >= veriaño) {

                            edad = true;

                        }
                    } while (edad == false);

                    boolean vericorreo = false;
                    String correo = "";
                    do {
                        System.out.print("Escriba su correo electronico: ");
                        correo = input.nextLine();
                        vericorreo = email(correo);
                    } while (vericorreo == false);
                    boolean vericontra = false;
                    String contra = "";
                    do {
                        System.out.println("Ingrese su contraseña: ");
                        //contra = contraseña
                        contra = input.nextLine();
                        vericontra = contraseña(contra);

                    } while (vericontra == false);

                    Regis regis = new Regis(nom, apellido, fecha2, correo, contra);
                    regi.add(regis);

                    break;
                }
                case 2: {
                    System.out.println("***Listado***");
                    for (int i = 0; i < regi.size(); i++) {
                        int c = i+1;
                        System.out.println(c + ". " + regi.get(i).toString());
                    }
                    break;
                }
                case 3: {
                    String gmail = "gmail";
                    System.out.println("***GMAIL***");
                    for (int i = 0; i < regi.size(); i++) {
                        if(regi.get(i).getCorreo().contains(gmail)){
                        System.out.println(regi.get(i).toString());
                        }
                    }
                    System.out.println("");
                    
                    String outlook = "outlook";
                    System.out.println("***OUTLOOK***");
                    for (int i = 0; i < regi.size(); i++) {
                        if (regi.get(i).getCorreo().contains(outlook)) {
                            System.out.println(regi.get(i).toString());
                        }
                    }
                    System.out.println("");
                    String yahoo = "yahoo";
                    System.out.println("***YAHOO***");
                    for (int i = 0; i < regi.size(); i++) {
                        if ((regi.get(i).getCorreo().contains(yahoo))) {
                            System.out.println(regi.get(i).toString());
                        }
                    }
                    System.out.println("");
                    String icloud = "icloud";
                    System.out.println("***ICLOUD***");
                    for (int i = 0; i < regi.size(); i++) {
                        if ((regi.get(i).getCorreo().contains(icloud))) {
                            System.out.println(regi.get(i).toString());
                        }
                    }
                    System.out.println("");
                    String protonmail = "protonmail";
                    System.out.println("***PROTONMAIL***");
                    for (int i = 0; i < regi.size(); i++) {
                        if ((regi.get(i).getCorreo().contains(protonmail))) {
                            System.out.println(regi.get(i).toString());
                        }
                    }
                    System.out.println("");
                    String fastmail = "fastmail";
                    System.out.println("***FASTMAIL***");
                    for (int i = 0; i < regi.size(); i++) {
                        if ((regi.get(i).getCorreo().contains(fastmail))) {
                            System.out.println(regi.get(i).toString());
                        }
                    }
                    
                    break;
                }
                case 4: {
                    System.out.println("***Gracias por su preferencia***");
                    break;
                }
                default: {
                    System.out.println("-----Caracter Invalido-----");
                    break;
                }
            }
            System.out.println("");
        } while (op != 4);

    }

    public static boolean contraseña(String contra) {

        String regex = "^[a-zA-Z0-9._%&$+-?<>!]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contra);
        return matcher.matches();

    }

    public static boolean email(String correo) {

        String regex = "^[a-zA-Z0-9._%&$+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
}
// [] busca caracter por caracter lo que este adentro
// [^ ] que sea diferente de ese carcter 
//      que busque exactamente lo escrito
