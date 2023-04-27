/*
    Clase Satelites
 */
package simulacionexamenastros;

/**
 *
 * @author jesus
 */
public class Satelites extends Astros{
    private float distancia_al_planeta;
    private float orbita_planetaria;
    private String planeta_al_que_pertenece;
    
    public Satelites(){
        this.distancia_al_planeta = 0;
        this.orbita_planetaria = 0;
        this.planeta_al_que_pertenece = "";
    }

    public Satelites(float distancia_al_planeta, float orbita_planetaria, String planeta_al_que_pertenece, String nombre, float radio_ecuatorial, float rotacion_sobre_su_eje, float masa, float temperatura_media, float gravedad) {
        super(nombre, radio_ecuatorial, rotacion_sobre_su_eje, masa, temperatura_media, gravedad);
        this.distancia_al_planeta = distancia_al_planeta;
        this.orbita_planetaria = orbita_planetaria;
        this.planeta_al_que_pertenece = planeta_al_que_pertenece;
    }

    public float getDistancia_al_planeta() {
        return distancia_al_planeta;
    }

    public void setDistancia_al_planeta(float distancia_al_planeta) {
        this.distancia_al_planeta = distancia_al_planeta;
    }

    public float getOrbita_planetaria() {
        return orbita_planetaria;
    }

    public void setOrbita_planetaria(float orbita_planetaria) {
        this.orbita_planetaria = orbita_planetaria;
    }

    public String getPlaneta_al_que_pertenece() {
        return planeta_al_que_pertenece;
    }

    public void setPlaneta_al_que_pertenece(String planeta_al_que_pertenece) {
        this.planeta_al_que_pertenece = planeta_al_que_pertenece;
    }
    
    
    
    //sobreescribimos el metodo mostrar de Astros para que muestre los datos de Astros y de Satélites
    @Override
    public void mostrar(){
        super.mostrar();
        String retorno = "Satelites{" + "distancia_al_planeta=" + distancia_al_planeta + ", orbita_planetaria=" + orbita_planetaria + ", planeta_al_que_pertenece=" + planeta_al_que_pertenece + '}';
        System.out.println(retorno);
    }

    
}
