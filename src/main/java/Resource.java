import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/")
public class Resource {
  private ServiceConfiguration config;
  Resource(ServiceConfiguration configuration) {
    this.config = configuration;
  }

  @GET
  @Path("/motto")
  public String motto() {
    System.out.print("Motto: " + config.getMotto());
    return config.getMotto() + "\n";
  }
}
