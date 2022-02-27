package publisher_maths_paper;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	
	ServiceRegistration publisherServiceRegistration;
	

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Maths Paper Publisher started successfully !");
		
		MathsPaperPublisher mathspaperpublisher = new ServicePublisherImpl();
		publisherServiceRegistration = bundleContext.registerService(MathsPaperPublisher.class.getName(), mathspaperpublisher, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Chemestry Paper Publisher stopped Successfully!");
		publisherServiceRegistration.unregister();
	}

}
