package Algoritmos;

public class Buscar {
    public int busqueda(char c, char[]arreglo, int counter) {
        int pos = -1;
        if (counter == arreglo.length) return -1;
        if(arreglo[counter]==c){pos=counter;}
        if(pos>-1){return  pos;} else{
            return busqueda(c,arreglo,counter+1);
        }
    }//función
}
