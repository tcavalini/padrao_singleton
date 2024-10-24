public class Main {
    public static void main(String[] args) {

        GerenciadorConexaoBancoDados gerenciador1 = GerenciadorConexaoBancoDados.obterInstancia();
        System.out.println(gerenciador1.obterStatusConexao());

        gerenciador1.executarConsulta("SELECT * FROM usuarios");

        GerenciadorConexaoBancoDados gerenciador2 = GerenciadorConexaoBancoDados.obterInstancia();
        System.out.println("As instâncias são iguais? " + (gerenciador1 == gerenciador2));

        gerenciador1.fecharConexao();

        GerenciadorConexaoBancoDados gerenciador3 = GerenciadorConexaoBancoDados.obterInstancia();
        System.out.println(gerenciador3.obterStatusConexao());
    }
}
