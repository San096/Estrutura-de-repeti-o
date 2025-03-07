/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso. */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(".(Digite o valor de X)");
        int x = sc.nextInt();
if(x <= 0 || x>=100){
    System.err.println("ERRO;");
}
else{
        for(int i=0; i <=x ; i++){
            if( i % 2 == 0){
                System.out.println("os seguintes numeros são pares:" + i);

            }
            }
        }

    }
}
