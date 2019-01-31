import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Path("/")
public class Resource {

  private String config;

  Resource(String c) {
    this.config = c;
  }

  @GET
  @Path("/hello")
  public String hello() throws java.io.IOException {
    List<String> allLines = Files.readAllLines(Paths.get(config), StandardCharsets.UTF_8);
    return allLines.toArray()[0] + "\n";
  }
}
