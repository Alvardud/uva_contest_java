//Ejercicio 264 UVA Solucion por metodo matematico
//Estado: Aceptado
//Creador: Alvardud

import java.util.Scanner;
public class Ejercicio264 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        //las variables a utilizar son
        // x: numero de elemento
        // n: numero de la diagonal donde se encuentra el elemento
        // k: posicion en la que se encuentra el elemento respecto de la diagonal
        int x,k,n;
        while(s.hasNext()){
            //leemos el elemento x
            x=s.nextInt();
            //para hallar el valor de n, nos basaremos en la formula de sumatoria, la cual es (n*(n+1))/2 a partir de esta,
            //deduciremos n, el cual es el numero de la diagonal
            n=(int)Math.abs((1+Math.abs(Math.sqrt(8*x)))/2);
            //el valor de k nos indicara cuantos elementos hay en total en dicha sumatoria
            // (sumatora de elementos de cada diagonal)
            k=((n*(n+1))/2)-x;
            //finalmente mostramos los resultados basandonos, si la diagonal es par o impar
            //si es par, los elementos van de arriba hacia abajo, en la diagonal
            //si es impar, los elementos van de abajo hacia arriba, en la diagonal
            if(n%2==0){
              System.out.println("TERM "+x+" IS "+(n-k)+"/"+(k+1));
            }else{
                System.out.println("TERM "+x+" IS "+(k+1)+"/"+(n-k));
            }
        }
    }
}
