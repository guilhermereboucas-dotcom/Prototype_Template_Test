package Prototype;
import java.util.ArrayList;
import java.util.List;

public class Prova {

    private String titulo;
    private String turma;
    private String data;
    private String versao;
    private List<Questao> questoes;

    public Prova(String titulo,String turma, String data, String versao, List<Questao> questoes) {
        this.titulo = titulo;
        this.turma = turma;
        this.data = data;
        this.versao = versao;
        this.questoes = questoes;
    }

    public Prova copiar(){

        List<Questao> novaLista = new ArrayList<>();

        for(Questao q : this.questoes){
            novaLista.add(q.copiar());
        }
        return new Prova(
                this.titulo,
                this.turma,
                this.data,
                this.versao,
                novaLista);
    }

    public int totalPontos(){
        int totalPontos = 0;
        for( Questao questao : questoes){
            totalPontos += questao.getPontos();
        }
        return totalPontos;
    }

    public void substituirQuestao(String id, Questao nova){
        for (int i = 0; i < questoes.size(); i++) {
            if(id.equals(questoes.get(i).getId())){
                questoes.set(i,nova);
            }
        }
    }

    public void printResumo(){
        System.out.println("------------------");
        System.out.println("Título: " + this.titulo);
        System.out.println("Turma: " + this.turma);
        System.out.println("Data: " + this.data);
        System.out.println("Versão: " + this.versao);
        System.out.println("Total de pontos: " + totalPontos());

        for(Questao questao : questoes){
            System.out.println(questao.getId() + " - " + questao.getPontos() + " pontos");
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}