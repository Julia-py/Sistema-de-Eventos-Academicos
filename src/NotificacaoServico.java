import java.util.ArrayList;
import java.util.List;

public class NotificacaoServico {
    private static NotificacaoServico instancia;
    private List<Aluno> observadores;

    private NotificacaoServico(){
        observadores = new ArrayList<>();
    }
    public static NotificacaoServico getInstancia(){
        if (instancia == null){
            instancia = new NotificacaoServico();
        }
        return instancia;
    }
    public void removeObservadores(Aluno aluno){
        observadores.remove(aluno);
    }
    public void adicionarObservadores(Aluno aluno){
        observadores.add(aluno);
    }
    public void notificarObservadores(EventoAcademico evento) {
        for (Aluno aluno: observadores) {
            aluno.atualizar(evento);
        }
    }
}
