package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.domain;


/*
Ex1:
Fazer um programa para ler os valores da largura e altura de um retângulo.Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado ao lado :

Classe-> Retangulo
Atributos:
width : double
Heigth : double

Métodos:
Area() : double
Perimeter(): double
Diagonal(): double

Resultado:
3.00
4.00
Area=12
Per=14
Diag= 5

 */

public class Rectangle {

    public double width;
    public double heigth;

    public void result(){
        System.out.println("A área do triângulo é: "+area());
        System.out.println("O perímetro do triângulo é: "+perimeter());
        System.out.println("A diagonal do triângulo é: "+diagonal());
    }

    public double area(){
        return width * heigth;
    }

    public double perimeter(){
        return  2* (heigth + width);
    }

    public double diagonal(){
        return Math.sqrt((width *width)+(heigth*heigth));
    }

}
