public class ThreadExample {
    public static void main(String[] args) {
        
        Thread thread = new Thread(() -> {
            
            System.out.println("Running thread: " + Thread.currentThread().getName());
        });

    
        thread.setName("MyThread");
		
        
        thread.setPriority(Thread.MAX_PRIORITY);

        
        thread.start();

    
        String threadName = thread.getName();
        System.out.println("Thread name: " + threadName);

        
        int threadPriority = thread.getPriority();
        System.out.println("Thread priority: " + threadPriority);
    }
}
