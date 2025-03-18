package exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<String> cursos;

    public Aluno(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(String curso) {
        cursos.add(curso);
        System.out.println("Curso " + curso + " adicionado para " + nome);
    }

    public void removerCurso(String curso) {
        if (cursos.contains(curso)) {
            cursos.remove(curso);
            System.out.println("Curso " + curso + " removido de " + nome);
        } else {
            System.out.println("Curso " + curso + " não encontrado para " + nome);
        }
    }

    public void listarCursos() {
        System.out.println("Cursos de " + nome + ": " + cursos);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos");

        aluno1.adicionarCurso("Java Básico");
        aluno1.adicionarCurso("Estruturas de Dados");
        aluno1.adicionarCurso("Banco de Dados");

        aluno1.listarCursos();

        aluno1.removerCurso("Java Básico");

        aluno1.listarCursos();
    }
}