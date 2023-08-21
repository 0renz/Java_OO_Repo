package com.mycompany.java_maven_too_20232;

import java.util.Scanner;

public class Java_maven_too_20232 {

    public static void main(String[] args) {
        System.out.println("teste");
            
        Scanner sc = new Scanner(System.in);
 
        int[][] rgDados1 = new int[3][3];
    
        int[][] rgDados2 = new int[3][3];
        
        int[][] rgDados3 = new int[3][3];
 
        System.out.println("Matriz 1");
        for (int linha=0; linha < rgDados1.length; linha++){
            
            for(int coluna=0; coluna < rgDados1[linha].length; coluna++){
                
                System.out.println("Digite um valor: ");
                if(sc.hasNext()){
                    int i = Integer.parseInt(sc.next());
                    rgDados1[linha][coluna] = i;
                }                
            }                        
        }
        
        System.out.println("\nMatriz 2");
        for (int linha=0; linha < rgDados2.length; linha++){
            
            for(int coluna=0; coluna < rgDados2[linha].length; coluna++){
                
                System.out.println("Digite um valor: ");
                if(sc.hasNext()){
                    int i = Integer.parseInt(sc.next());
                    rgDados2[linha][coluna] = i;
                }                
            }                        
        }
        
        System.out.println("\nMatriz 3");
        for (int linha=0; linha < rgDados3.length; linha++){
            
            for(int coluna=0; coluna < rgDados3[linha].length; coluna++){
                    
                     int i = rgDados1[linha][coluna] + rgDados2[linha][coluna];
                     rgDados3[linha][coluna] = i;
                     System.out.print(rgDados3[linha][coluna] + " "); 
            }      
            System.out.println("\n");
        }

    }  
}
