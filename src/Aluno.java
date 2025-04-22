public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void inscrever(NotificacaoServico servico){
        servico.adicionarObservadores(this);

    }

    public void cancelarInscricao(NotificacaoServico servico){
        servico.removeObservadores(this);
        System.out.println(nome + "cancelou a inscrição das notificações");
    }

    public void atualizar(EventoAcademico evento){
        prepararEvento(evento);
    }

    public void prepararEvento(EventoAcademico evento){
        String tipoTexto = evento.getTipo().toString().toUpperCase();
        System.out.println(nome +": Estou Preparado para a" + evento.getTipo() + "do dia" + evento.getData());
    }

}
