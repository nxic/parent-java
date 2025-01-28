package mn.nxic.bpm.resource;

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

    @Inject
    WorldOneService oneService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        String one = twoService.sayHello();
        String two = oneService.sayHello();

        return "Hello from Quarkus REST and modules are greeting: " + one + " and " + two;
    }
}
