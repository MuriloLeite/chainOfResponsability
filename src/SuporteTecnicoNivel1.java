public class SuporteTecnicoNivel1 extends SuporteTecnico {

    public SuporteTecnicoNivel1(SuporteTecnico superior) {
        listaProblemas.add(ProblemaSoftware.getInstancia());
        setSuporteSuperior(superior);
    }

    @Override
    public String getNivelSuporte() {
        return "Suporte Técnico Nível 1";
    }
}
