package EstructurasLineales;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
      ListaEnlazada listaEnlazada=new ListaEnlazada();
        listaEnlazada.insertar(new Cancion("Bohemian Rhapsody","/Bohemian_Rhapsody.mp3",5.55));
        listaEnlazada.insertar(new Cancion("The Attractions of Youth","/The_Attractions_Of_Youth.mp3",3.24));
        listaEnlazada.insertar(new Cancion("Yeah Right","/Yeah_Right.mp3",2.54));
        listaEnlazada.mostrarElementos();
        LinkedList<Cancion> listaJava=new LinkedList<>();
        listaJava.add(new Cancion("Slow Dancing in the Dark","/Slow_Dancing_In_The_Dark",3.26));
        listaJava.add(new Cancion("Like you do","/Like_You_Do",4.00));
        listaJava.add(new Cancion("Mantra II","/Mantra_II",4.04));
        for(int x=0;x<listaJava.size();x++){
            Cancion c=listaJava.get(x);
            System.out.println(c.getNombre());
        }


       /* Stack<Usuario> pila=new Stack<>();
        Queue<Usuario> cola=new LinkedList<>();
        pila.add(new Usuario("John","Maestro #117","66669420"));
        pila.add(new Usuario("Connor","Ratonaketon #03","632323"));
        pila.add(new Usuario("Arthur","Morgan #02","3423432"));
        Usuario tomar=pila.pop();
        System.out.println(tomar.getNombre());
        tomar= pila.pop();
        System.out.println(tomar.getNombre());
        pila.pop();
        if(pila.isEmpty()) System.out.println("Está vacía carnal:C");
        cola.add(new Usuario("Link","Ocarina #1","633469420"));
        cola.add(new Usuario("2b","Autómata #2","632323454"));
        cola.add(new Usuario("Noctis","Fantasía #15","454432"));
        Usuario tomarCola=cola.poll();
        System.out.println(tomarCola.getNombre());
        tomarCola=cola.poll();
        System.out.println(tomarCola.getNombre());

        Usuario cachacion=cola.peek();
        System.out.println(cachacion.getNombre());*/
    }
}
