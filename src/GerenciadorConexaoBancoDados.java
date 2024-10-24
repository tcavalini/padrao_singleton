public class GerenciadorConexaoBancoDados {
    private static GerenciadorConexaoBancoDados instancia;
    private String conexao;

    private GerenciadorConexaoBancoDados() {
        this.conexao = "Conexão com o banco de dados estabelecida.";
    }

    public static GerenciadorConexaoBancoDados obterInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorConexaoBancoDados();
        }
        return instancia;
    }

    public void executarConsulta(String consulta) {
        System.out.println("Executando consulta: " + consulta);
    }

    public void fecharConexao() {
        System.out.println("Conexão com o banco de dados fechada.");
        instancia = null;
    }

    public String obterStatusConexao() {
        return conexao;
    }
}
