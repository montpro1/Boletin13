
package boletin.pkg13;

 
public class Masajista extends SeleccionDeFutbol{
    private String titulacion;
    private int añosExperiencia;

    public Masajista() {
    }

    public Masajista(int id, String nome, String apelido, int edade,String titulacion, int añosExperiencia) {
        super(id,nome,apelido,edade);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    public void darMasajes(){
        System.out.println("Tienes que dar masajes");
    }

    @Override
    public String toString() {
        return  super.toString()+"titulacion=" + titulacion + ", a\u00f1osExperiencia=" + añosExperiencia ;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o masaxista");
    }
    
    
    
    
    
    
    
    
}
