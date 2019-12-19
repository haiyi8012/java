package test;

public class T2 {
    public static void main(String[] args) {
    	Counter2 t1 = new Counter2();
    	Counter2 t2 = new Counter2();
        new Thread(() -> t1.add(100)).start();
        new Thread(() -> t1.dec(100)).start();

        new Thread(() -> t2.add(100)).start();
        new Thread(() -> t2.dec(100)).start();
        System.out.println("t1.count = " + t1.get());
        System.out.println("t2.count = " + t2.get());
    }
}
/*class Counter2{
    private int count = 0;
    public synchronized void add(int n){
        count += n;
    }
    public synchronized void dec(int n){
        count -= n;
    }
    public int get(){
        return count;
    }
}*/

class Counter2{
	private int count = 0;
	public void add(int n) {
        synchronized(this) {
            count += n;
        }
    }

	public void dec(int n) {
        synchronized(this) {
            count -= n;
        }
    }

	public int get(){
        return count;
    }

}