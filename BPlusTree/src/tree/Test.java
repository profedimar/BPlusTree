/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.math.BigInteger;

/**
 *
 * @author Administrador
 */
public class Test {
    /**
     * Unit tests the {@code BPlusTree} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        BPlusTree<BigInteger, Candidato> arvore = new BPlusTree<>();//parâmetros é chave, valor

        arvore.put(new BigInteger("01030471015"), new Candidato("João", "Masculino", 25));
        arvore.put(new BigInteger("11030471015"), new Candidato("Maria", "Feminino", 35));
        arvore.put(new BigInteger("21030471015"), new Candidato("Sofia", "Feminino", 22));
        arvore.put(new BigInteger("31030471015"), new Candidato("Cris", "Feminino", 23));
        arvore.put(new BigInteger("41030471015"), new Candidato("Bianca", "Feminino", 33));
        arvore.put(new BigInteger("51030471015"), new Candidato("Caio", "Masculino", 32));
        arvore.put(new BigInteger("61030471015"), new Candidato("Antônio", "Masculino", 52));
        arvore.put(new BigInteger("71030471015"), new Candidato("Orlando", "Masculino", 60));
        arvore.put(new BigInteger("81030471015"), new Candidato("Ermanoteu", "Masculino", 74));
        arvore.put(new BigInteger("91030471015"), new Candidato("Noemi", "Masculino", 80));
        

        System.out.println("Buscas");
        System.out.println("\t01030471015: " + arvore.get(new BigInteger("01030471015")).getNome());
        System.out.println();

        System.out.println("Informações da árvore:");
        System.out.println("\tNúmero de elementos:    " + arvore.size());
        System.out.println("\tAltura da árvore:  " + arvore.height());
        System.out.println();
        
        System.out.println("Impressão da árvore B+");
        System.out.println(arvore);
        System.out.println();
    }
}
