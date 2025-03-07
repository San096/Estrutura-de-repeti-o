/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). 
 */

import java.util.*;
class App1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite quantas vezes vc quer fazer a leitura de um numero:");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++){
            System.out.println("Digite um valor:");
        int x = sc.nextInt();

        if(x > 10 && x < 20){

            System.out.println(x + " in");
        }
        else{
            System.out.println(x + " out");
        }
        }

        
    }
}