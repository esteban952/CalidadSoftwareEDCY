
package examenpractico;

public class Main {
    public static void main(String[] args) {
        ObtenerAccion oa = new ObtenerAccion("no", false, true, "externo", "");
        String obtac = oa.obtenerAccion();
        System.out.println(obtac);
    }
}
