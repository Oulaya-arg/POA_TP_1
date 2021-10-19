package EXO1;

public class threadChiffre extends Thread {
    //affichage des nombres paires
    int n1,n2;
    //constructor

    public threadChiffre(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    //la methode run();
    public void run(){
       for (int i=2; i<=n2;i=i+2) System.out.println(i);
    }

}
