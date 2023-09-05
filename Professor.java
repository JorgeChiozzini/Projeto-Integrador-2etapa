public class Professor {
    // Atributos
    private String nome;
    private String endereco;
    private String telefone;
    private String cursoResponsavel;

    // Construtor
    public Professor(String nome, String endereco, String telefone, String cursoResponsavel) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cursoResponsavel = cursoResponsavel;
    }

    // Métodos
    public void inserirNota(String aluno, String disciplina, double nota) {
        System.out.println(nome + " inseriu a nota " + nota + " para o aluno " + aluno + " na disciplina de " + disciplina);
    }

    public void editarNota(String aluno, String disciplina, double novaNota) {
        System.out.println(nome + " editou a nota do aluno " + aluno + " na disciplina de " + disciplina + " para " + novaNota);
    }

    public void inserirFrequencia(String aluno, String disciplina, int frequencia) {
        System.out.println(nome + " inseriu a frequência de " + frequencia + " para o aluno " + aluno + " na disciplina de " + disciplina);
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCursoResponsavel() {
        return cursoResponsavel;
    }

    public void setCursoResponsavel(String cursoResponsavel) {
        this.cursoResponsavel = cursoResponsavel;
    }

    // Método toString para representação textual
    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cursoResponsavel='" + cursoResponsavel + '\'' +
                '}';
    }

    // Exemplo de utilização
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. João", "Rua XYZ, 456", "987-654-3210", "Matemática");
        professor.inserirNota("Maria Silva", "Álgebra Linear", 8.5);
        professor.editarNota("João Souza", "Cálculo", 9.0);
        professor.inserirFrequencia("Carlos Oliveira", "Física", 95);

        // Exemplo de impressão dos atributos
        System.out.println(professor);
    }
}
