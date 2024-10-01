
class SimpleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running using Thread class");
    }
}


public class ThreadExample {
    public static void main(String[] args) {
        SimpleThread thread = new SimpleThread(); 
        thread.start(); 
    }
}




class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }
}


public class RunnableExample {
    public static void main(String[] args) {
        SimpleRunnable simpleRunnable = new SimpleRunnable(); 
        Thread thread = new Thread(simpleRunnable);
        thread.start(); 
    }
}


