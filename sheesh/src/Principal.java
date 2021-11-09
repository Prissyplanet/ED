public class Principal {
    public static void main(String[] args) {
        int x=10;
        int b=20;
        int r=jjj(x,b);
        System.out.println(r);
    }
    public static int jjj(int a, int b){
        if(b==0){
            return a;
        }else if(a==0){
            return b;
        }else{
            return 1+jjj(a,b-1);
        }
    }
}
