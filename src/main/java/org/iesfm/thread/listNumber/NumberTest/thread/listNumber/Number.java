package org.iesfm.thread.listNumber.NumberTest.thread.listNumber;

import java.util.Arrays;
import java.util.List;

public class Number {

    //Crea un método estático que calcule la media de una lista de números
    public static double media (List<Double> numeros) throws NotANumberException{
        double sum=0;
        if (numeros.isEmpty()) throw new NotANumberException();{
            for (double numero:numeros) {
                sum=sum+numero;
            }
        }

        return sum/numeros.size();
}

    //Crea un método estático que calcule la suma de una lista de números
    public static double suma (List<Double>numeros){
        double sum=0;
        for (double numero:numeros) {
            sum+= numero;

        }
        return sum;
    }


    public static void main(String[] args) {
        //Crea un hilo que inicia una lista con los valores 3.5, 4.5 y 4.0. Calcula la media y muéstralo en pantalla
        Runnable media= new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1;i++){
                    List<Double> doubles = Arrays.asList(3.5,4.5,4.0) ;
                    try {
                        System.out.println("La media es: " + media(doubles));
                    } catch (NotANumberException e) {
                        e.printStackTrace();
                    }
                    try{
                        Thread.sleep(10);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

            }

        };

        //Creo otro hilo que inicia una lista con los valores 3.5, 4.5 y 4.0.
        // Calcula la suma y muéstralo en pantalla
        Runnable suma= new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<1;i++){
                    List<Double> doubles =Arrays.asList(3.5,4.5,4.0) ;
                    System.out.println("La suma es: " + suma(doubles));
                    try{
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread mediaThread= new Thread(media);
        System.out.println(media);
        mediaThread.start();
        Thread sumaThread= new Thread(suma);
        System.out.println(suma);
        sumaThread.start();



    }




}
