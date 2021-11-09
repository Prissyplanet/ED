public class Principal {
    public static void main(String[] args) {
        int[] j = {20, 10, 15, 18, 21};
        int res=arreglin(j,j.length-1);
    }
    public static int arreglin(int array[],int posArray){
        int tam=posArray;
        int rta;
        if (tam==0){
            return array[tam];
        }else{
            rta=(array[tam])+arreglin(array,tam-1);
            return rta;
        }
    }
}
