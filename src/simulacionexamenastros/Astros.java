/*
    Clase abstracta de la cual heredan las clases Satelites y Planetas
 */
package simulacionexamenastros;

/**
 *
 * @author jesus
 */
abstract public class Astros {
    private String nombre;
    private float radio_ecuatorial;
    private float rotacion_sobre_su_eje;
    private float masa;
    private float temperatura_media;
    private float gravedad;
    
    public Astros(){
        this.radio_ecuatorial = 0;
        this.rotacion_sobre_su_eje = 0;
        this.temperatura_media = 0;
        this.masa = 0;
        this.gravedad = 0;
    }

    public Astros(String nombre, float radio_ecuatorial, float rotacion_sobre_su_eje, float masa, float temperatura_media, float gravedad) {
        this.nombre = nombre;
        this.radio_ecuatorial = radio_ecuatorial;
        this.rotacion_sobre_su_eje = rotacion_sobre_su_eje;
        this.masa = masa;
        this.temperatura_media = temperatura_media;
        this.gravedad = gravedad;
    }
    
    

    public float getRadio_ecuatorial() {
        return radio_ecuatorial;
    }

    public void setRadio_ecuatorial(float radio_ecuatorial) {
        this.radio_ecuatorial = radio_ecuatorial;
    }

    public float getRotacion_sobre_su_eje() {
        return rotacion_sobre_su_eje;
    }

    public void setRotacion_sobre_su_eje(float rotacion_sobre_su_eje) {
        this.rotacion_sobre_su_eje = rotacion_sobre_su_eje;
    }

    public float getMasa() {
        return masa;
    }

    public void setMasa(float masa) {
        this.masa = masa;
    }

    public float getTemperatura_media() {
        return temperatura_media;
    }

    public void setTemperatura_media(float temperatura_media) {
        this.temperatura_media = temperatura_media;
    }

    public float getGravedad() {
        return gravedad;
    }

    public void setGravedad(float gravedad) {
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrar(){
        String retorno = "Astros{" + "nombre=" + nombre + ", radio_ecuatorial=" + radio_ecuatorial + "km, rotacion_sobre_su_eje=" + rotacion_sobre_su_eje + "horas, masa=" + masa + "*10^24 kg, temperatura_media=" + temperatura_media + "ºC, gravedad=" + gravedad + "m/s^2}";
        System.out.println(retorno);
    }
    
    
    
}
