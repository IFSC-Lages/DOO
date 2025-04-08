/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplos_linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Lidiane
 */
public class Exemplo_linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando uma LinkedList de Strings
        LinkedList<String> tarefas = new LinkedList<>();

        //  1. Adicionando elementos com add()
        tarefas.add("Ler e-mails");
        tarefas.add("Fazer reunião");
        tarefas.add("Corrigir provas");

        //  2. Adicionando no início e no fim da lista
        tarefas.addFirst("Tomar café");
        tarefas.addLast("Enviar relatórios");

        // Lista agora: [Tomar café, Ler e-mails, Fazer reunião, Corrigir provas, Enviar relatórios]
        System.out.println(tarefas);
        
        //  3. Acessando elementos com get(), getFirst() e getLast()
        System.out.println("Primeira tarefa: " + tarefas.getFirst());
        System.out.println("Última tarefa: " + tarefas.getLast());
        System.out.println("Tarefa na posição 2: " + tarefas.get(2));

        //  4. Substituindo um elemento com set()
        tarefas.set(2, "Reunião com equipe");

        //  5. Removendo elementos
        tarefas.remove(); // remove o primeiro elemento (Tomar café)
        tarefas.remove("Corrigir provas"); // remove por valor
        tarefas.removeFirst(); // remove "Ler e-mails"
        tarefas.removeLast();  // remove "Enviar relatórios"

        //  6. Verificando tamanho da lista
        System.out.println("Total de tarefas: " + tarefas.size());

        //  7. Verificando se está vazia
        System.out.println("Lista está vazia? " + tarefas.isEmpty());

        //  8. Verificando se contém um elemento
        System.out.println("Contém 'Reunião com equipe'? " + tarefas.contains("Reunião com equipe"));

        //  9. Adicionando elementos para mostrar iteração
        tarefas.add("Planejar aulas");
        tarefas.add("Responder alunos");

        //  10. Iterando com for-each
        System.out.println("\nTarefas com for-each:");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }

        //  11. Iterando com forEach (lambda)
        System.out.println("\nTarefas com forEach (lambda):");
        tarefas.forEach(t -> System.out.println(t));

        //  12. Convertendo para array
        Object[] arrayTarefas = tarefas.toArray();
        System.out.println("\nConvertido para array:");
        for (Object t : arrayTarefas) {
            System.out.println(t);
        }

        //  13. Limpando a lista
        tarefas.clear();
        System.out.println("\nApós clear(), lista vazia? " + tarefas.isEmpty());
    }
    
}
