package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        exerciceSoma(2,2);
        exerciceSoma(3,3);
        media(7,6,8);
        media(5,6,7);
        exercicePar(2);
        exercicePar(3);
        tabuada(5);
        tabuada(376);
        exerciceSub(2,3);
        exerciceSub(5,2);
        exerciceSub(5,6);
    }

    public static void exerciceSoma(double var1, double var2){
        var result = var1 + var2;
        System.out.println(result);
    }

    public static void exerciceSub(double var1, double var2){
        var result = var1 - var2;
        System.out.println(result);
    }



    public static void exercicePar(double var){
        if(var % 2 == 0){
            System.out.println("Valor Par");
        }else {
            System.out.println("Valor impar");
        }
    }

    public static void media(double var1, double var2, double var3){
        var media = (var1 + var2 + var3 ) / 3 ;
        if (media >= 7){
            System.out.println("Passou");
        }else {
            System.out.println("Reprovado");
        }
    }

    public static void tabuada(int var){
        for(int i = 1; i <= 10; i++){
            var result = var * i;
            System.out.println(var + " * " + i + " = " + result);
        }
    }

}