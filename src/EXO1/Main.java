package EXO1;

public class Main {
    public static void main(String[] args) {
        threadLettre th1=new threadLettre('r','z');
        threadLettre th2=new threadLettre('A','Q');
        th1.start();
        th2.start();
        threadChiffre th3=new threadChiffre(1,60);
        th3.start();
    }
}
