package multi_threading.download_manager;

public class MainThread {
	public static void main(String[] args) throws InterruptedException{
		FileDownloader t1 = new FileDownloader("Document.pdf");
		t1.setName("Thread-1");
		FileDownloader t2 = new FileDownloader("image.jpg");
		t2.setName("Thread-2");
		FileDownloader t3 = new FileDownloader("Video.mp4");
		t3.setName("Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("All downloads complete!");
	}
}
