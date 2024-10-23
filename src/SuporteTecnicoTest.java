import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SuporteTecnicoTest {

    SuporteTecnico suporteNivel1;
    SuporteTecnico suporteNivel2;

    @BeforeEach
    public void setUp() {
        suporteNivel2 = new SuporteTecnicoNivel2(null);
        suporteNivel1 = new SuporteTecnicoNivel1(suporteNivel2);
    }

    @Test
    public void deveResolverProblemaSoftwareNoNivel1() {
        SolicitacaoSuporte problemaSoftware = new SolicitacaoSuporte(ProblemaSoftware.getInstancia());
        String resultado = suporteNivel1.resolverProblema(problemaSoftware);
        assertEquals("Problema resolvido por Suporte Técnico Nível 1", resultado);
    }

    @Test
    public void deveResolverProblemaHardwareNoNivel2() {
        SolicitacaoSuporte problemaHardware = new SolicitacaoSuporte(ProblemaHardware.getInstancia());
        String resultado = suporteNivel1.resolverProblema(problemaHardware);
        assertEquals("Problema resolvido por Suporte Técnico Nível 2", resultado);
    }

    @Test
    public void deveRetornarSemSolucaoSeNaoHaNivelSuperior() {
        SuporteTecnico suporteIsolado = new SuporteTecnicoNivel1(null);
        SolicitacaoSuporte problemaHardware = new SolicitacaoSuporte(ProblemaHardware.getInstancia());
        String resultado = suporteIsolado.resolverProblema(problemaHardware);
        assertEquals("Sem solução disponível", resultado);
    }

    @Test
    public void devePassarProblemaParaNivelSuperior() {
        SolicitacaoSuporte problemaHardware = new SolicitacaoSuporte(ProblemaHardware.getInstancia());
        String resultado = suporteNivel1.resolverProblema(problemaHardware);
        assertEquals("Problema resolvido por Suporte Técnico Nível 2", resultado);
    }
}
