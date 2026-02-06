package multi_threading.download_manager;

import java.util.Random;

public class FileDownloader extends Thread{
	private String fileName;
	private Random random = new Random();
	
	public FileDownloader(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		try {
			for(int progress = 5; progress <= 100; progress += 10) {
				Thread.sleep(random.nextInt(500)+ 200);
				System.out.println("["+ getName()+"] Downloading "+ fileName+": "+ progress+"%");
			}
		}catch(InterruptedException e) {
			System.out.println(fileName +" download interrupted");
		}
	}
	
	
	
}
