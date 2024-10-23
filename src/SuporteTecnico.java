import java.util.ArrayList;

public abstract class SuporteTecnico {

    protected ArrayList<TipoProblema> listaProblemas = new ArrayList<>();
    private SuporteTecnico suporteSuperior;

    public SuporteTecnico getSuporteSuperior() {
        return suporteSuperior;
    }

    public void setSuporteSuperior(SuporteTecnico suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }

    public abstract String getNivelSuporte();

    public String resolverProblema(SolicitacaoSuporte solicitacao) {
        if (listaProblemas.contains(solicitacao.getTipoProblema())) {
            return "Problema resolvido por " + getNivelSuporte();
        } else {
            if (suporteSuperior != null) {
                return suporteSuperior.resolverProblema(solicitacao);
            } else {
                return "Sem solução disponível";
            }
        }
    }
}
