public class ThreadExample {
    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        Thread thread1 = new Thread(()-> threadExample.printHello());
        thread1.start();
        Thread thread2 = new Thread(()-> threadExample.printHello());
        thread2.start();
    }
    public void printHello(){
        for(int i=0; i<10; i++){
            System.out.println("Hello"+i);
        }
    }
}
