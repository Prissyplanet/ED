import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funciones {
    public static void main(String[] args) {
        //perímetro
        perimetroCirculo(5);

        //Área del círculo
    double areaCirculo=areaCirculo(10);
        System.out.println("El área del círculo es: "+areaCirculo);

        //pendiente
    int x1=5,x2=6;
    int restaX=x2-x1;
    int valoresY=pendienteRecta(5,10);
    double pendiente= valoresY/restaX;
        System.out.println("La pendiente es: "+pendiente);

        //Formula general
        double formula=formulaGeneral(4,15,10);
        System.out.println("El resultado, utilizando la fórmula general es: "+formula);

    }//Main

    public static double areaCirculo(double diametro){
        double radio=diametro/2;
        return (radio*radio)*3.1416;
    }//areaCirculo

    public static void perimetroCirculo(double radio){
        double perimetro=radio*2*3.1416;
        System.out.println(perimetro);
    }//perímetroCírculo

    public static int pendienteRecta(int y1, int y2){
        int restaY=y2-y1;
        return restaY;
    }//pendienteRecta
    public static double formulaGeneral(int a, int b, int c){
            int cuadrado=(b*b);
            int resta= 4*a*c;
            int divisor=2*a;
            double dentroRaiz=cuadrado-resta;
            double raiz=Math.sqrt(dentroRaiz);
            double x1=(b+raiz)/divisor;
            double x2=(b-raiz)/divisor;
        return x1;
    //no supe como hacer para que retornara también x2 jsjsjs, no me sé la sintáxis, pero funciona:D
    }//formulaGeneral
    public static void Hora(){
        Calendar calendario=new GregorianCalendar();
        int hora=calendario.get(Calendar.HOUR_OF_DAY);
        int mins=calendario.get(Calendar.MINUTE);
        int segs=calendario.get(Calendar.SECOND);
        System.out.println(hora+":"+mins+":"+segs);
    }

}//Principal
