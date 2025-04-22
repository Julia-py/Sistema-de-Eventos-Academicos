/* aqui é o sistema de eventos */
public class Main {
    public static void main(String[]args) {
        Aluno julia = new Aluno("Julia");
        Aluno antonio = new Aluno("Antonio");

        // servico de notificacao
        NotificacaoServico servico = NotificacaoServico.getInstancia();
        julia.inscrever(servico);
        antonio.inscrever(servico);

        //professor criacao de evento
        Professor Tadeu = new Professor("Professor Tadeu");
        Tadeu.criarEvento(TipoEvento.Prova, "Prova 2", "15/12/2025");
        Tadeu.criarEvento(TipoEvento.Trabalho,"Trabalho entregue até", "10/12/2025");
    }
}
