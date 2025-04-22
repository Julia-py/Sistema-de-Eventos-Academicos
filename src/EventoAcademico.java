public class EventoAcademico {
    private TipoEvento tipo;
    private String descricao;
    private String data;
    private String professor;

    public EventoAcademico(TipoEvento tipo, String descricao, String data, String professor) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
        this.professor = professor;
    }
    public TipoEvento getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    public String getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return tipo + " - " + descricao + "(" + data + ")";
    }
}
