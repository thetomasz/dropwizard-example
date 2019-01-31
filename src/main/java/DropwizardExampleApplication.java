import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class DropwizardExampleApplication extends Application<Configuration> {
  public static String[] arguments;
  public static void main(String[] args) throws Exception {
    arguments = args;
    new DropwizardExampleApplication().run(args);
  }

  @Override
  public void run(Configuration configuration, Environment environment) {
    environment.jersey().register(new Resource(arguments[0]));
  }
}
