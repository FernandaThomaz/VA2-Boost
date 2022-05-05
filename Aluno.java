class Aluno {

  String nome;
  int matricula;
  Curso curso;

  void exibirRelatorio(){
  System.out.println("Nome: " + nome + 
                     "\nCurso: " + curso.nome + 
                     "\nResultadoDoAluno: " + (curso.estaAprovado() ? "Sim" : "Não"));
  }
}