/*
    Clase Planetas
 */
package simulacionexamenastros;

import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class Planetas extends Astros{
    private float distancia_al_sol;
    private float orbita_al_sol;
    private boolean tiene_satelites;
    private ArrayList<Satelites> satelites;
    
    public Planetas(){
        super();
        this.distancia_al_sol = 0;
        this.orbita_al_sol = 0;
        this.tiene_satelites = false;
        this.satelites = new ArrayList();
    }

    //constructor con los datos por parámetro

    public Planetas(float distancia_al_sol, float orbita_al_sol, boolean tiene_satelites, String nombre, float radio_ecuatorial, float rotacion_sobre_su_eje, float masa, float temperatura_media, float gravedad) {
        super(nombre, radio_ecuatorial, rotacion_sobre_su_eje, masa, temperatura_media, gravedad);
        this.distancia_al_sol = distancia_al_sol;
        this.orbita_al_sol = orbita_al_sol;
        this.tiene_satelites = tiene_satelites;
        this.satelites = new ArrayList();
    }


    public float getDistancia_al_sol() {
        return distancia_al_sol;
    }

    public void setDistancia_al_sol(float distancia_al_sol) {
        this.distancia_al_sol = distancia_al_sol;
    }

    public float getOrbita_al_sol() {
        return orbita_al_sol;
    }

    public void setOrbita_al_sol(float orbita_al_sol) {
        this.orbita_al_sol = orbita_al_sol;
    }

    public boolean isTiene_satelites() {
        return tiene_satelites;
    }

    public void setTiene_satelites(boolean tiene_satelites) {
        this.tiene_satelites = tiene_satelites;
    }

    public void addSatelite(Satelites satelite){
        this.satelites.add(satelite);
    }
    
    public Satelites getSatelite(int i){
        return this.satelites.get(i);
    }
    
    public int numSatelites(){
        return this.satelites.size();
    }
    
    //sobreescribimos el metodo mostrar de Astros para que muestre los datos de Astros y de Planetas
    @Override
    public void mostrar(){
        super.mostrar();
        String retorno = "Planeta{" + "distancia_al_sol=" + distancia_al_sol + "km, orbita_al_sol=" + orbita_al_sol + "dias, tiene_satelites=" + tiene_satelites + '}';
        System.out.println(retorno);
    }
    
}
