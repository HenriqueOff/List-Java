package List;
import java.util.ArrayList;
import java.util.List;
public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //necessário criar um construtor lista fazia, para quando eu criar uma lista, já ter um construtor vazio
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //adicionando uma tarefa dentro da lista de tarefas
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    //removendo uma tarefa, a partir da descrião dessa tarefa
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //obtendo numero total de tarefas
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    //obtendo descrição de tarefas
    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }

}
