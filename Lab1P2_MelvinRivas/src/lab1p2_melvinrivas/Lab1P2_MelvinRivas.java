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
                    do{
                    System.out.print("Ingrese su fecha ejemplo(10/12/2022): ");
                    //fecha1 = lo pido como string para despues usar parse y Simpledate format para poder 
                    //pasarlo date
                    String fecha1 = input.nextLine();
                    SimpleDateFormat ajusfec = new SimpleDateFormat("dd/MM/yyyy");
                    fecha2 = ajusfec.parse(fecha1);
                    veriaño = fecha2.getYear();
                    Date fecactual = new Date();
                    veriaño2 = fecactual.getYear();
                    veriaño2 = veriaño2 -13;
                        if (veriaño2 >= veriaño) {
                            
                                    edad = true;        
                                
                        }
                    }while(edad == false);
                    
                    
                    System.out.print("Escriba su correo electronico: ");
                    String correo = input.nextLine();
                  
                    System.out.println("Ingrese su contraseña: ");
                    //contra = contraseña
                    String contra = input.nextLine();
                    
                    Regis regis = new Regis(nom,apellido,fecha2,correo,contra);
                    regi.add(regis);
                    
                    break;
                }
                case 2: {
                    System.out.println("***Listado***");
                    for (int i = 0; i < regi.size(); i++) {
                        System.out.println(i+". "+regi.get(i).toString());
                    }
                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
                default: {

                    break;
                }
            }
            System.out.println("");
        } while (op != 4);

    }
    
}
// [] busca caracter por caracter lo que este adentro
// [^ ] que sea diferente de ese carcter 
//      que busque exactamente lo escrito