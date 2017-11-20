
public class JoinTest {
	public static void main(String[] args){
		JoinThread join = new JoinThread();
		boolean a = join.isAlive();
		System.out.println(" Join is "+a);
		join.start();
		try{
			System.out.println("after start Join is"+ join.isAlive());
			join.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("join is out, is isAlive" + join.isAlive());
		System.out.println("is over");
	}
}




class JoinThread extends Thread{
	public void run(){
		System.out.println("i am JoinThread ");
	}
}
