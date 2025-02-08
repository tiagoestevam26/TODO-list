import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        Collections.sort(tarefas); // ja ordena sempre por prioridade
    }

    public void removerTarefa(String nome) {
        tarefas.removeIf(tarefa -> tarefa.getNome().equals(nome));
    }

    public void listarPorCategoria(String categoria) {
         List<Tarefa> aux = tarefas.stream().filter(t -> t.getCategoria().equalsIgnoreCase(categoria)).toList();
         for (Tarefa tarefa : aux) {
             System.out.println(tarefa.toString());
         }

    }

    public void listarPorPrioridade() {
        for (int i = tarefas.size() - 1; i >= 0; i--) {
            System.out.println(tarefas.get(i).toString());
        }
    }


    public void listarPorStatus(String status) {
        List<Tarefa> aux = tarefas.stream().filter(t -> t.getStatus().equalsIgnoreCase(status)).toList();
        for (Tarefa tarefa : aux) {
            System.out.println(tarefa.toString());
        }
    }

    public void atualizarTarefa(String nome, String statusAtualizar) {
        for(Tarefa tarefa : tarefas) {
            if(tarefa.getNome().equals(nome)) {
                tarefa.setStatus(statusAtualizar);
            }
        }
    }

    public void consultar(){
        int todo = 0, done=0, doing=0;
        for(Tarefa tarefa : tarefas) {
            if(tarefa.getStatus().equals("todo")){
                todo++;
            } else if(tarefa.getStatus().equals("done")){
                done++;
            }else if(tarefa.getStatus().equals("doing")){
                doing++;
            }
        }
        System.out.println("Tarefas todo: "+ todo+" Tarefas doing: "+doing +" Tarefas done: "+done);
    }

}
