package Prototype;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tamplate base---------------");
        List<Questao> lista = new ArrayList<>();

        lista.add(new Questao("Q1", "O que é SQL?", 3));
        lista.add(new Questao("Q2", "Explique SELECT.", 3));
        lista.add(new Questao("Q3", "Explique JOIN.", 4));

        Prova template = new Prova(
                "Prova SQL - Template",
                "TEMPLATE",
                "2026-03-10",
                "BASE",
                lista
        );

        System.out.println("\nTEMPLATE:");
        template.printResumo();


        System.out.println("\nProva A---------------");
        Prova provaA = template.copiar();

        provaA.setTurma("2° INFO A");
        provaA.setData("2026-03-20");
        provaA.setVersao("V1");

        provaA.substituirQuestao("Q2",
                new Questao("Q2", "Diferença entre SELECT e WHERE.", 3)
        );

        System.out.println("\nPROVA A:");
        provaA.printResumo();


        System.out.println("\nProva B---------------");
        Prova provaB = template.copiar();

        provaB.setTurma("2° INFO B");
        provaB.setData("2026-03-21");
        provaB.setVersao("V1");

        provaB.substituirQuestao("Q3",
                new Questao("Q3", "Explique JOIN.", 5)
        );

        System.out.println("\nPROVA B:");
        provaB.printResumo();


        System.out.println("\nCópia profunda---------------");
        provaA.substituirQuestao("Q1",
                new Questao("Q1", "ALTERADA SOMENTE NA PROVA A", 3)
        );

        System.out.println("\nTEMPLATE (não pode mudar):");
        template.printResumo();

        System.out.println("\nPROVA A (alterada):");
        provaA.printResumo();
    }
}