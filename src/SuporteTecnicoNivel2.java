public class SuporteTecnicoNivel2 extends SuporteTecnico {

    public SuporteTecnicoNivel2(SuporteTecnico superior) {
        listaProblemas.add(ProblemaHardware.getInstancia());
        setSuporteSuperior(superior);
    }

    @Override
    public String getNivelSuporte() {
        return "Suporte Técnico Nível 2";
    }
}
