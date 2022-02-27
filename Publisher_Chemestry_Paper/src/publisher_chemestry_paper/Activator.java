package publisher_chemestry_paper;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publisherServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Chemestry Paper Publisher started successfully !");
		
		ChemestryPaperPublisher chemestrypaperpublisher = new ServicePublisherImpl();
		publisherServiceRegistration = context.registerService(ChemestryPaperPublisher.class.getName(), chemestrypaperpublisher, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Chemestry Paper Publisher stopped Successfully!");
		publisherServiceRegistration.unregister();
	}

}
