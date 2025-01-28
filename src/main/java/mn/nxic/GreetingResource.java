package mn.nxic;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import mn.nxic.service.WorldTwoService;
import mn.nxic.service.WorldOneService;

@Path("/hello")
public class GreetingResource {

    @Inject
    WorldTwoService twoService;
    WorldOneService oneService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        twoService.sayHello();
        oneService.sayHello();

        return "Hello from Quarkus REST";
    }
}
