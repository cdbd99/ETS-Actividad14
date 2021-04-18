package actividad1proyectojava;

import java.util.Random;
public class Actividad1ProyectoJava {

       
        //Creamos un método que asigne color según el número aleatorio creado
        public static String generarcolor(int index){
        String[] colores = {"Azul", "Naranja", "Lila", "Gris", "Verde", "Negro", "Amarillo", "Rosa", "Dorado"};
        return colores[index];
        }
    

        //Pasamos las características a las clases creadas
        public static void PasarAClases(){
        
        int i;
                
        final Punto puntox = new Punto();
        puntox.setPuntoX(generaraleatorio(0)); 
        puntox.setPuntoY(generaraleatorio(0));
        
        final Circulo circuloy = new Circulo();
        circuloy.setCirculoRadio(generaraleatorio(0)); 
        
        final Cono conoxy = new Cono(generaraleatorio(0), circuloy.getCirculoRadio(), puntox.getPuntoX(), puntox.getPuntoY());
        
        do {
        //Pasamos de float a entero
        i = (int) generaraleatorio(0);
        if (i <= 6){
        conoxy.setColor(generarcolor(i)); 
        }} while (i >6);  
        conoxy.sacarporpantalla();
        }
    
    
        //Creamos el siguiente método para crear números aleatorios, le damos unos valores mínimos y máximos para la creación del número
        public static float generaraleatorio(float numero){
        float maximo= 40;
        float minimo= 1;
        Random aleatorio = new Random();
        return numero = minimo + aleatorio.nextFloat() * (maximo - minimo);
        }
    
    
        public static void main(String[] args) {
        PasarAClases();
        }
        }

