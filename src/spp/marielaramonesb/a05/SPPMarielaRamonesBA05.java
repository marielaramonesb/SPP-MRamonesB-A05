/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.marielaramonesb.a05;
import java.util.Scanner; 
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMarielaRamonesBA05 {

    /** introduce +  mensaje { string, double, long, char
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
        solicitaEntero("La edad");
        solicitaString("mensaje");
        solicitaLong("long");
        solicitaDouble("Numero con decimal");

        
    }
    
    static int solicitaEntero(String mensaje){
        Scanner kb = new Scanner (System.in);
        int numero = 0;
        boolean flag;
        do {
                System.out.println("Introduce "+ mensaje);
                try{
                    numero = kb.nextInt();
                    flag=true;
                    
                } catch (Exception ex){
                    flag=false;
                    System.out.println("El numeor no es entero"+ ex);
                    ex=null;
                    kb.nextLine();
                    
                }
        } while (flag==false);
        return numero;
    }
    
    static String solicitaString(String mensaje){
        Scanner kb = new Scanner (System.in);
        String Dato = ("");
        boolean flag;
        do {
                System.out.println("Introduce "+ mensaje);
                try{
                    Dato = kb.nextLine();
                    flag=true;
                    
                } catch (Exception ex){
                    flag=false;
                    System.out.println("El texto  no es valido "+ ex);
                    ex=null;
                    kb.nextLine();
                    
                }
        } while (flag==false);
        return Dato;
    }
    
    static long solicitaLong(Long mensaje){
        Scanner kb = new Scanner (System.in);
        long num = 0;
        boolean flag;
        do {
                System.out.println("Introduce "+ mensaje);
                try{
                    num = kb.nextLong();
                    flag=true;
                    
                } catch (Exception ex){
                    flag=false;
                    System.out.println("El número de long no es valido "+ ex);
                    ex=null;
                    kb.nextLong();
                    
                }
        } while (flag==false);
        return num;
    }
    
    
        static double solicitaDouble(Double mensaje){
        Scanner kb = new Scanner (System.in);
        double dob = 0;
        boolean flag;
        do {
                System.out.println("Introduce "+ mensaje);
                try{
                    dob = kb.nextDouble();
                    flag=true;
                    
                } catch (Exception ex){
                    flag=false;
                    System.out.println("El número double insertado no es válido"+ ex);
                    ex=null;
                    kb.nextDouble();
                    
                }
        } while (flag==false);
        return dob;
    }

    private static void solicitaLong(String along) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void solicitaDouble(String numero_con_decimal) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

