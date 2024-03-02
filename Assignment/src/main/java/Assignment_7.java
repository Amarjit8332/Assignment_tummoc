
public class Assignment_7 {
	
		public static void main(String[] args) {
		
		Thread num1 = new Thread(new Threads("Number 1"));
		Thread num2 = new Thread(new Threads("Number 2"));
		num1.start();
		num2.start();
		}		
}
		
class Threads implements Runnable{
		
	private final String name;
	public Threads(String name){
		this.name = name;	
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(name+":"+i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}		
}