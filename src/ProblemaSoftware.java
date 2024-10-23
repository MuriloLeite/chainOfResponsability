public class ProblemaSoftware implements TipoProblema {

    private static ProblemaSoftware instancia = new ProblemaSoftware();

    private ProblemaSoftware() {}

    public static ProblemaSoftware getInstancia() {
        return instancia;
    }
}
