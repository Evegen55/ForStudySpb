/**
 * 
 */
package _java._7_0._07_Multithreading._task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * @author Lartsev
 *
 */
public class MainApp {
	
	private String fileName;
	private final String fileExtension = ".properties";
	private SharedResource resource;
	
	/**
	 * @param fileName
	 */
	public MainApp(String fileName) {
		this.fileName = fileName + fileExtension;
		resource = new SharedResource();
	}
	
	public void mainProcessor(){
		File f = new File(this.fileName);
		
		DepositProcessor thread = new DepositProcessor();
		ThreadGroup tg = new ThreadGroup("group");
		
		try(BufferedReader br = new BufferedReader(new FileReader(f));) {
			/**
			 * Each time that line is readed
			 * we are create a new thread and doing operation			 * 
			 */
			while(br.ready()) {
				
				String line = br.readLine();
				
				String[] lines = line.split("[=,]");
				
				thread = new DepositProcessor(lines, resource);
				thread.start();
				thread.join();
				
				//test code
				//System.out.println(lines[3]);
				//print(lines);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//test code
		printResource(resource);
		
	}

	private void printResource(SharedResource resource2) {
		List<BankAccount> list = resource2.getList();
		System.out.println(list.size());
		for (BankAccount ba : list) {
			System.out.println(ba.toString());
		}
		
	}
	
	private void printResource() {
		List<BankAccount> list = resource.getList();
		System.out.println(list.size());
		for (BankAccount ba : list) {
			System.out.println(ba.toString());
		}
		
	}

	private void print(String[] lines) {
		for (String s : lines) {
			System.out.println(s.trim());
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "other/for_accouns/payments_info";
		MainApp ma = new MainApp(fileName);
		ma.mainProcessor();
	}

}
