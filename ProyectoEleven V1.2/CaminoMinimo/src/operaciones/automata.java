/*
 * Autor: MCS Solutions
 * Localidad: Mazatlan, Sinaloa, Mexico
 * Fecha: 27/10/2022
 */
package operaciones;

public class automata {
    int entrada = 0; // Este es la moneda que entra
    int boletoPaga = 0; // Variable para contar lo que se ha ingresado 
    
    public void seleccionador(){
        int dinero [] ={1, 2, 5, 10, 50, 100};

        for (int i = 0; i > 5; i++) {
            if(dinero[i] == entrada){
                boletoPaga = boletoPaga + entrada; 
                break;
            }
            if(i == 5){
                System.out.println("No valida"); // En teoria no deberia de salir mensaje
                regresarMonedas(entrada);//lo mejor seria que lo regresara
            }
        }
    }
    
    public void regresarMonedas(int cambio){
        System.out.println("Se regresara el cambio: $" + cambio + ".00 MXN");
    }
}