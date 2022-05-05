class Main {
  public static void main(String[] args) {

    Aluno aluno01 = new Aluno("Leticia", 
                             00212, Piscologia);
    Aluno aluno02 = new Aluno("Carol", 
                              00234, EngenhariaDaComputacao);
    Aluno aluno03 = new Aluno("Lucas", 00243, EdFisica);
 
    Curso Piscologia = new Curso ("Pisco", 
                              neuropsicologia, 
                              filosofia, 
                              antropologia);
    Curso EngenhariaDaComputacao = new Curso("EngComp",
                                          POO,
                                          robotica, 
                                          SD);

    Aluno aluno01 = new Aluno("Leticia", 00212, Piscologia);
    Aluno aluno02 = new Aluno("Carol", 00234, EngenhariaDaComputacao);
    
    Disciplina neuropsicologia = new Disciplina ("Neuropsicologia", 10, "Pedro");
    Disciplina POO = new Disciplina ("POO", 20, "Carol");
    Disciplina SD = new Disciplina ("SD", 25, "Junior");
    
      
    Professor professor01 = new Professor();
    professor01.nome = "Pedro";

    Professor professor02 = new Professor();
    professor02.nome = "Junior";
    
    Professor professor03 = new Professor();
    professor03.nome = "Carol";

    
    System.out.println("Calculo da media do aluno: " + aluno01.nome + ":" + aluno01.curso.calcularMedia());
    
  System.out.println("Calculo da media do aluno: " + aluno02.nome + ":" + aluno02.curso.calcularMedia());
    
   System.out.println("Calculo da media do aluno: " + aluno03.nome + ":" + aluno03.curso.calcularMedia());

  System.out.println("Primeiro aluno" + aluno01 + "Segundo Aluno" + aluno02);

    }
  }

