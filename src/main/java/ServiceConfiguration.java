import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceConfiguration extends Configuration {
    private String motto;

    @JsonProperty
    public String getMotto() {
        return motto;
    }
}