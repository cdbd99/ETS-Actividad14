package actividad1proyectojava;

public class Punto {

protected float centroX;

protected float centroY;
    
public Punto(){       
}
    
public Punto(float centroX, float centroY){
this.centroX = centroX;
this.centroY = centroY;
}    
    
//Creamos los setters y los getters
public float getPuntoX(){return centroX;}
public void setPuntoX(float centroX){this.centroX = centroX;}
public float getPuntoY(){return centroY;}
public void setPuntoY(float centroY){this.centroY = centroY;}
}

