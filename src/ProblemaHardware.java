public class ProblemaHardware implements TipoProblema {

    private static ProblemaHardware instancia = new ProblemaHardware();

    private ProblemaHardware() {}

    public static ProblemaHardware getInstancia() {
        return instancia;
    }
}
