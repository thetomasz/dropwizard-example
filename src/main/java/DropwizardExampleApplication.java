import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class DropwizardExampleApplication extends Application<ServiceConfiguration> {
  public static void main(String[] args) throws Exception {
    new DropwizardExampleApplication().run(args);
  }

  @Override
  public void run(ServiceConfiguration configuration, Environment environment) {
    environment.jersey().register(new Resource(configuration));
  }
}
