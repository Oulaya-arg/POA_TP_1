package EXO1;

class threadLettre extends Thread {
    char c1,c2;
    //constructor
    public threadLettre(char c1, char c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    //la methode run();
    public void run(){
        //affichage des alphabets
        for (char i=c1; i<c2; i++){
            System.out.println(i);
        }
    }
}

