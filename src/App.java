import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner votos = new Scanner(System.in);
    boolean continuar = true;
    List<Integer> votosList = new ArrayList<>();
    int contador = 0;
    int [] acumVotos = new int[5];
    
    menu:
    while (continuar){
        System.out.println("Menu \n 1- Registrar voto \n 2- Ver datos \n 3- Salir");
        int opcion = votos.nextInt();
        switch (opcion) {            
               
               case 1:
                    boolean seguirvotando = true;
                    while (seguirvotando) {
                     System.out.println("------- Ingrese su voto del 1 al 5 -------");
                    int voto = votos.nextInt();
                    if (voto>= 1 && voto <= 5) {
                        votosList.add(voto);
                        switch (voto){
                            case 1: contador++;
                                acumVotos[0]++;
                                break;
                            case 2: contador++;
                                acumVotos[1]++;
                                break;
                            case 3: contador++;
                                acumVotos[2]++;
                                break;
                            case 4: contador++;
                                acumVotos[3]++;
                                break;
                            case 5: contador++;
                                acumVotos[4]++;
                                break;
                        }
                        
                        boolean respuestaValida = false;
                        while (!respuestaValida) {
                        System.out.println("Desea ingresar otro voto? (Si, No)");
                        String NuevoVoto = votos.next();
                                    if (NuevoVoto.equalsIgnoreCase("si")) {
                                        respuestaValida = true;
                                    }else if (NuevoVoto.equalsIgnoreCase("no")) { // este es la opcion NO
                                        respuestaValida = true;
                                        seguirvotando = false;                                   
                                        System.out.println("Que desea hacer ahora?");
                                        System.out.println(" 1- Ver datos \n 2- Salir" );
                                        int opc1 = votos.nextInt();
                                        if ( opc1 ==  1){
                                            continue;
                                        }else if (opc1 == 2){
                                            continuar = false;
                                            System.out.println("Gracias por usar el sistema");
                                            return;
                                        }else{
                                            System.out.println("Opcion no valida, por favor intente de nuevo");
                                            continue;
                                        }   
                                    }
                                    else{
                                        
                                        System.out.println(" Solo 'SI' o 'NO' por favor");
                                        continue;
                                    }  
                        }
                            
                        
                                             
                    }else{
                        System.out.println("Nooo es del 1 y 5 nomas");
                        continue;
                    }    
                    } 
                    
                    
            
            
            case 2 : 
                    if (votosList.isEmpty()){
                       System.out.println(">>>Registre sus votos por favor<<<");  
                       continue menu;   
                    } else {
                        System.out.println("Total de votos: " + votosList.size());                                              
                        System.out.println("---Cuantas personas votaron por cada puntuacion---");      
                            System.out.println("1: " + acumVotos[0]);
                            System.out.println("2: " + acumVotos[1]);
                            System.out.println("3: " + acumVotos[2]);
                            System.out.println("4: " + acumVotos[3]);
                            System.out.println("5: " + acumVotos[4]);
                            System.out.println("5: " + acumVotos[5]);
                            System.out.println("5: " + acumVotos[6]);
                        int suma = 0;    
                        for ( int n : votosList){     
                           suma += n;                                
                        }
                            double promedio = (double) suma / votosList.size();
                            System.out.printf("Promedio: %.1f%%\n", promedio);

                        int porce = (acumVotos[3] + acumVotos[4]);
                        int porcentaje = votosList.size();
                        double TotalPorcen = ((double) porce / porcentaje) * 100; 

                        System.out.printf("Porcentaje de satisfacticion (4 o 5): %.2f%%", TotalPorcen);
                        break;    
                        
                    }
                    
                   
                   

            case 3: System.out.println("Gracias por usar el sistema");
                    return ;


        }
        break;
    }          
    votos.close();
}}
    
