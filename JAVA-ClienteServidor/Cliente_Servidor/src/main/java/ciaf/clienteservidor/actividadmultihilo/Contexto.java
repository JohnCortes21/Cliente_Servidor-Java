package ciaf.clienteservidor.actividadmultihilo;

class main {
public static void main ( String [] args) {
    int numThreads =5 ; // Numero de hilos a crear
    for ( int i = 0 ; i < numThreads ; i++) {
        Thread thread = new Thread (new MiRunnable ());
        thread.start();
      }
  }
}
class MiRunnable implements Runnable {
    public void run () {
        System.out.println( "Hola desde el hilo Numero :" + Thread.currentThread().getName ());
    }
}
public class Contexto {
}
