package cursoJava.exerciciosPropostos.exerciciosPoo.orientacaoObjetos.domain;

public class CurencyConverter {

    public static final double iof = 0.06;


    public static double converter(double dollarPrice,double quantityDollar){
        double valor = dollarPrice * quantityDollar;
        return valor + (valor * iof) ;
    }
}
