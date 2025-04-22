public class Professor {
    private String nome;

   public Professor(String nome) {
       this.nome = nome;
   }

   public void criarEvento(TipoEvento tipo, String descricao, String data) {
       EventoAcademico evento = new EventoAcademico(tipo, descricao,data,nome);
       System.out.println(nome + "criou um evento: " + evento);
       NotificacaoServico.getInstancia().notificarObservadores(evento);

       };
   }

