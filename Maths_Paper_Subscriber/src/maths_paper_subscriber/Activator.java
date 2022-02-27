package maths_paper_subscriber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import publisher_chemestry_paper.ChemestryPaperPublisher;
import publisher_maths_paper.MathsPaperPublisher;


public class Activator implements BundleActivator {
	ServiceReference serviceReferenceMathsPapers;
	ServiceReference serviceReferenceChemestryPapers;
	
	Scanner cat = new Scanner(System.in);
	
	public void start(BundleContext context) throws Exception {
		serviceReferenceMathsPapers = context.getServiceReference(MathsPaperPublisher.class.getName());
		MathsPaperPublisher mathsPaperPublisher = (MathsPaperPublisher) context.getService(serviceReferenceMathsPapers);
		
		serviceReferenceChemestryPapers = context.getServiceReference(ChemestryPaperPublisher.class.getName());
		ChemestryPaperPublisher chemestryPaperPublisher = (ChemestryPaperPublisher) context.getService(serviceReferenceChemestryPapers);
	
		System.out.println("Maths Paper has started.");
		System.out.println(" Medium: ");
		System.out.println("1. Sinhala Medium");
		System.out.println("2. English Medium\n");
		System.out.println("3. Tamil Medium\n");
		
		double total = 0 ;
		double dis = 0 ;
		int category, year, sel;
		ArrayList<String> PurchasedItems = new ArrayList<String>();
		
		try {
			System.out.print("Select a Year: ");
			category = cat.nextInt();
			
			if(category == 1) {
				System.out.println("\nYear: ");
				System.out.println("1. 2021");
				System.out.println("2. 2020");
				System.out.println("3. 2019");
				System.out.println("4. 2018");
				
				System.out.println("\nPress O to Exit\n");
				System.out.print("Select a Year: ");
				year = cat.nextInt();
				
				while(year != 0) {	
					
					mathsPaperPublisher.displayMathsPaper(year);
					System.out.println("\nType -1 to exit from the Current Year.");
					System.out.print("\nSelect Maths Paper: ");
					sel = cat.nextInt();
					while( sel != -1) {
						total += mathsPaperPublisher.getPrice(year, sel);
						PurchasedItems.add(mathsPaperPublisher.getName(year, sel));
						System.out.print("Select Maths Paper: ");
						sel = cat.nextInt();
						
					}
					System.out.print("\nSelect a Year: ");
					year = cat.nextInt();
				}
				
			}else if(category == 2) {
				System.out.println("\nYear: ");
				System.out.println("1. 2021");
				System.out.println("2. 2020");
				System.out.println("3. 2019");
				System.out.println("4. 2018");
				
				System.out.println("\nPress O to Exit");
				System.out.print("\nSelect a Year: ");
				year = cat.nextInt();
				while(year != 0){	
					
				    chemestryPaperPublisher.displayChemestryPaper(year);;
					System.out.println("\nType -1 to exit from the Current Year.");
					System.out.print("\nSelect Maths Paper: ");
					sel = cat.nextInt();
					while( sel != -1) {
						total += chemestryPaperPublisher.getPrice(year, sel);
						PurchasedItems.add(chemestryPaperPublisher.getName(year, sel));
						System.out.print("Select Maths Paper: ");
						sel = cat.nextInt();
					}
					System.out.print("\nSelect a Year: ");
					year = cat.nextInt();
				}
			}
			dis = (total * 5) / 100; 
			System.out.println("Purchased Items: " + PurchasedItems );
			System.out.println("Discount Amount: $" + dis);
			System.out.println("Total : $" + (total - dis));
		}catch(InputMismatchException e) {
			System.out.println("Integer Should be Entered.! " + e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void stop(BundleContext context) throws Exception {
		System.out.println("Maths Paper Subscriber has stopped.");
		context.ungetService(serviceReferenceMathsPapers);
		context.ungetService(serviceReferenceChemestryPapers);
	}
}
