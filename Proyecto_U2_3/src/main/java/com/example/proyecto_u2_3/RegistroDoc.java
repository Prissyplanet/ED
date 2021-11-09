package com.example.proyecto_u2_3;

public class RegistroDoc {
            public static String usuario;
            public static String contraseña;



    public static String encriptar(char[] password, int contador){
        if(contador==password.length)return "";
        return coincidencia(password[contador],0)+encriptar(password,contador+1);
    }
    public static char coincidencia(char c, int index){
        char[][] caracteres={
                {'a','♥'},
                {'b','○'},
                {'c','◘'},
                {'d','>'},
                {'e','<'},
                {'f',';'},
                {'g',','},
                {'h',':'},
                {'i','.'},
                {'j','_'},
                {'k','-'},
                {'l','`'},
                {'m','^'},
                {'n','}'},
                {'ñ','{'},
                {'o',']'},
                {'p','['},
                {'q','´'},
                {'r','¨'},
                {'s','~'},
                {'t','*'},
                {'u','+'},
                {'v','¿'},
                {'w','?'},
                {'x','='},
                {'y',')'},
                {'z','('},
                {'1','/'},
                {'2','%'},
                {'3','¬'},
                {'4','|'},
                {'5','°'},
                {'6','!'},
                {'7','"'},
                {'8','#'},
                {'9','$'},
                {'0','&'},
        };
        if(index==caracteres.length) return 0;
        if(caracteres[index][0]==c){
            return caracteres[index][1];
        }else{
            return coincidencia(c, index+1);
        }
    }
}
