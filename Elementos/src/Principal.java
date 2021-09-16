import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Metales Alcalinos
        Elemento litio=new Elemento("Litio","Li",3);
        Elemento sodio=new Elemento("Sodio","Na",11);
        Elemento potasio=new Elemento("Potasio","K",19);
        Familia metalesAlcalinos=new Familia("Metales alcalinos",litio,sodio,potasio);

        //Gases Nobles
        Elemento helio=new Elemento("Helio","He",2);
        Elemento neon=new Elemento("Neón","Ne",10);
        Elemento argon=new Elemento("Argón","Ar",18);
        Familia gasesNobles=new Familia("Gases nobles",helio,neon,argon);

        //Halógenos
        Elemento fluor=new Elemento("Flúor","F",9);
        Elemento cloro=new Elemento("Cloro","Cl",17);
        Elemento bromo=new Elemento("Bromo","Br",35);
        Familia halogenos=new Familia("Halógenos",fluor,cloro,bromo);

        //No metales
        Elemento carbono=new Elemento("Carbono","C",6);
        Elemento nitrogeno=new Elemento("Nitrógeno","N",7);
        Elemento fosforo=new Elemento("Fósforo","P",15);
        Familia noMetales=new Familia("No metales",carbono,nitrogeno,fosforo);

        //Metaloides
        Elemento boro=new Elemento("Boro","B",5);
        Elemento silicio=new Elemento("Silicio","Si",14);
        Elemento germanio=new Elemento("Germanio","Ge",32);
        Familia metaloides=new Familia("metaloides",boro,silicio,germanio);

        //Otros metales
        Elemento aluminio=new Elemento("Aluminio","Al",13);
        Elemento galio=new Elemento("Galio","Ga",31);
        Elemento indio=new Elemento("Indio","In",49);
        Familia otrosMetales=new Familia("Otros metales",aluminio,galio,indio);

        //Metales de transición
        Elemento escandio=new Elemento("Escandio","Sc",21);
        Elemento titanio=new Elemento("Titanio","Ti",22);
        Elemento vanadio=new Elemento("Vanadio","V",23);
        Familia metalesDeTransicion=new Familia("Metales de transición",escandio,titanio,vanadio);

        //Alcalinoterreos
        Elemento berilio=new Elemento("Berilio","Be",4);
        Elemento magnesio=new Elemento("Magnesio","Mg",12);
        Elemento calcio=new Elemento("Calcio","Ca",20);
        Familia alcalinoterreos=new Familia("Alcalinoterreos",berilio,magnesio,calcio);

        //Lantánidos
        Elemento lantano=new Elemento("Lantano","La",57);
        Elemento cerio=new Elemento("Cerio","Ce",58);
        Elemento praseodimio=new Elemento("Praseodimio","Pr",59);
        Familia lantanidos=new Familia("Lantánidos",lantano,cerio,praseodimio);

        //Actínidos
        Elemento actinio=new Elemento("Helio","Ac",89);
        Elemento torio=new Elemento("Neón","Th",90);
        Elemento protactinio=new Elemento("Argón","Pa",91);
        Familia actinidos=new Familia("Actinidos",actinio,torio,protactinio);

        System.out.println("¿Deseas consultar los datos de alguna familia? ¿Cuál? \n" +
                "Gases nobles: [1]\n" +
                "Halógenos[2]\n" +
                "No metales[3]\n" +
                "Metaloides[4]\n" +
                "Otros metales[5]\n" +
                "Metales de transición[6]\n" +
                "Alcalinotérreos[7]\n" +
                "Metales alcalinos[8]\n" +
                "Lantánidos[9]\n" +
                "Actínidos[10]");
                int familia=scanner.nextInt();
                if(familia==1){
                    System.out.println("Los elementos de la familia "+gasesNobles.getNombre()+" son: \n" +
                            gasesNobles.imprimirElemento());
                }else if(familia==2){
                    System.out.println("Los elementos de la familia "+halogenos.getNombre()+" son: \n" +
                            halogenos.imprimirElemento());
                }else if(familia==3){
                    System.out.println("Los elementos de la familia "+noMetales.getNombre()+" son: \n" +
                            noMetales.imprimirElemento());
                }else if(familia==4){
                    System.out.println("Los elementos de la familia "+metaloides.getNombre()+" son: \n" +
                            metaloides.imprimirElemento());
                }else if(familia==5){
                    System.out.println("Los elementos de la familia "+otrosMetales.getNombre()+" son: \n" +
                            otrosMetales.imprimirElemento());
                }else if(familia==6){
                    System.out.println("Los elementos de la familia "+metalesDeTransicion.getNombre()+" son: \n" +
                            metalesDeTransicion.imprimirElemento());
                }else if(familia==7){
                    System.out.println("Los elementos de la familia "+alcalinoterreos.getNombre()+" son: \n" +
                            alcalinoterreos.imprimirElemento());
                }else if(familia==8){
                    System.out.println("Los elementos de la familia "+metalesAlcalinos.getNombre()+" son: \n" +
                            metalesAlcalinos.imprimirElemento());
                }else if(familia==9){
                    System.out.println("Los elementos de la familia "+lantanidos.getNombre()+" son: \n" +
                            lantanidos.imprimirElemento());
                }else if(familia==10){
                    System.out.println("Los elementos de la familia "+actinidos.getNombre()+" son: \n" +
                            actinidos.imprimirElemento());
                }
    }

}
