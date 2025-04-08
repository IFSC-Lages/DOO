/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplos_arraylist;

import java.util.ArrayList;

/**
 *
 * @author Lidiane
 */
public class Exemplos_collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Criando uma ArrayList de Strings
        // Você pode adaptar a lista para trabalhar com outros tipos (como Integer, Double, objetos personalizados etc.)
        ArrayList<String> nomes = new ArrayList<>();

        // 1. Adicionando elementos com add()
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Daniel");

        // 2. Inserindo em uma posição específica
        nomes.add(1, "Carlos"); // Agora: Ana, Carlos, Bruno, Daniel

        // 3. Acessando elementos com get()
        System.out.println("Primeiro nome: " + nomes.get(0)); // Ana

        // 4. Substituindo elementos com set()
        nomes.set(2, "Beatriz"); // Substitui Bruno por Beatriz

        // 5. Removendo por índice e por valor
        nomes.remove(0); // Remove "Ana"
        nomes.remove("Carlos"); // Remove "Carlos"

        // 6. Tamanho da lista com size()
        System.out.println("Tamanho atual: " + nomes.size()); // 2

        // 7. Verificando se a lista está vazia com isEmpty()
        System.out.println("Está vazia? " + nomes.isEmpty()); // false

        // 8. Verificando se um elemento existe com contains()
        System.out.println("Contém 'Beatriz'? " + nomes.contains("Beatriz")); // true

        // 9. Mostra os valores armazenados no arrayList
        System.out.println("Conteúdo armazenado: "+nomes);
        
        // 10. Índice de elementos com indexOf() e lastIndexOf()
        nomes.add("Daniel"); // Adiciona novamente para demonstrar lastIndexOf
        System.out.println("Primeira posição de 'Daniel': " + nomes.indexOf("Daniel"));
        System.out.println("Última posição de 'Daniel': " + nomes.lastIndexOf("Daniel"));

        // 11. Iterando com for-each
        System.out.println("\nIterando com for-each:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // 12. Iterando com forEach (lambda)
        System.out.println("\nIterando com forEach:");
        nomes.forEach(nome -> System.out.println(nome));

        // 13. Convertendo para array
        Object[] array = nomes.toArray();
        System.out.println("\nConvertido para array:");
        for (Object obj : array) {
            System.out.println(obj);
        }

        //  14. Limpando todos os elementos com clear()
        nomes.clear();
        System.out.println("\nApós clear(), lista vazia? " + nomes.isEmpty());
    }
}

