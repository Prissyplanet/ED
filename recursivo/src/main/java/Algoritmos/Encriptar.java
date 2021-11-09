package Algoritmos;

public class Encriptar {
    public String encriptar(char[]palabra, int count){
        //CASO BASE
        if(count==palabra.length)return "";
            return buscarCaracter(palabra[count],0)+encriptar(palabra,count+1);
    }
    public char buscarCaracter(char c, int index){
            char[][] mapa={
                    {'a','$'},
                    {'b','!'},
                    {'c','|'},
                    {'d','+'},
                    {'e','-'},
                    {'f','¿'},
                    {'g','¡'},
                    {'h','?'},
                    {'i','='},
                    {'j',')'},
                    {'k','/'},
                    {'l','('},
                    {'m','&'},
                    {'n','%'},
                    {'ñ','#'},
                    {'o','{'},
                    {'p','}'},
                    {'q','['},
                    {'r',']'},
                    {'s','<'},
                    {'t','>'},
                    {'u','.'},
                    {'v',':'},
                    {'w',','},
                    {'x','*'},
                    {'y','_'},
                    {'z','@'},
                    {'1','°'},
                    {'2','¬'},
                    {'3',';'},
                    {'4','`'},
                    {'5','♥'},
                    {'6','☻'},
                    {'7','♣'},
                    {'8','◘'},
                    {'9','☺'},
                    {'0','‼'},
            };
            //caso base
        if(index==mapa.length) return 0;
        if(mapa[index][0]==c){
            return mapa[index][1];
        }else{
            return buscarCaracter(c, index+1);
        }
    }
}
