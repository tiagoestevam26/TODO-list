import java.time.LocalDate;

public class Tarefa implements Comparable<Tarefa> {
    private String nome;
    private String descricao;
    private LocalDate dataTermino;
    private int prioridade; // 1 a 5 (1 = mais importante)
    private String categoria;
    private String status; // "todo", "doing", "done"

    public Tarefa(String nome, String descricao, LocalDate dataTermino, int prioridade, String categoria, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int compareTo(Tarefa outra) { //escreve a compare to da classe collections pra que ordene por prioridade
        return Integer.compare(this.prioridade, outra.prioridade);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataTermino=" + dataTermino +
                ", prioridade=" + prioridade +
                ", categoria='" + categoria + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
