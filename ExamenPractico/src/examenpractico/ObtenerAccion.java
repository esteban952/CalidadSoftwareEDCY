
package examenpractico;

public class ObtenerAccion {
    public String esObligatorio;
    public boolean esDocente;
    public boolean esExterno;
    public String tipoPersonaDestino;
    public String estadoRegistro;

    public ObtenerAccion(String esObligatorio, boolean esDocente, boolean esExterno, String tipoPersonaDestino, String estadoRegistro) {
        this.esObligatorio = esObligatorio;
        this.esDocente = esDocente;
        this.esExterno = esExterno;
        this.tipoPersonaDestino = tipoPersonaDestino;
        this.estadoRegistro = estadoRegistro;
    }
    public String obtenerAccion(){
        String accion = "";
        if ((esObligatorio.equals("si") && esDocente) || (esExterno && estadoRegistro.equals("porConfirmar"))){
            accion = "actualizar";
        }
        else if ((esObligatorio.equals("no") && esDocente) || (esExterno && estadoRegistro.equals("vigente"))){
            accion = "matricular";
        }
        else if (esExterno && tipoPersonaDestino.equals("externo")){
            accion = "registrar";
        }
        return accion;
    }
}
