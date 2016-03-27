package utils;

import controllers.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hans on 25/03/2016.
 */
@ApplicationPath("/rest")
public class ApplicationMain extends Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationMain.class);

	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<>();
		classes.add(BasicController.class);
		return classes;
	}
}
