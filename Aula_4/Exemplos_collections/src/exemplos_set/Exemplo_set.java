/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplos_set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Lidiane
 */
public class Exemplo_set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Criando um Set de Strings com HashSet
        Set<String> frutas = new HashSet<>();

        // 1. Adicionando elementos com add()
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Pera");

        // ️2. Set não permite elementos duplicados
        frutas.add("Banana"); // Não será adicionado novamente

        // 3. Verificando se um elemento existe com contains()
        System.out.println("Tem Laranja? " + frutas.contains("Laranja"));

        //  4. Removendo elementos com remove()
        frutas.remove("Pera");

        //  5. Tamanho do conjunto com size()
        System.out.println("Quantidade de frutas: " + frutas.size());

        //  6. Verificando se está vazio com isEmpty()
        System.out.println("Está vazio? " + frutas.isEmpty());

        //  7. Iterando com for-each
        System.out.println("\nIterando com for-each:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        //  8. Iterando com forEach (lambda)
        System.out.println("\nIterando com forEach:");
        frutas.forEach(fruta -> System.out.println(fruta));

        // 9. Limpando todos os elementos com clear()
        frutas.clear();
        System.out.println("\nDepois de clear(), está vazio? " + frutas.isEmpty());

        // 10. Adicionando novamente para demonstração de toArray()
        frutas.add("Uva");
        frutas.add("Abacaxi");
        
        // 11. Mostra os valores armazenados no arrayList
        System.out.println("Conteúdo armazenado: "+frutas);
        
        // 12. Convertendo para array
        Object[] arrayFrutas = frutas.toArray();
        System.out.println("\nConvertido para array:");
        for (Object f : arrayFrutas) {
            System.out.println(f);
        }
       
    }
}
