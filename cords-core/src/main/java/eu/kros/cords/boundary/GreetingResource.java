package eu.kros.cords.boundary;

import eu.kros.cords.services.CordsService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.stream.Collectors;

@Path("/hello")
public class GreetingResource {

  @Inject
  CordsService cordsService;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return "Hello from RESTEasy Reactive" +
            cordsService.getAllCords().stream()
                    .map(el -> el.getLatitude() + " : " + el.getLongitude() + ",")
                    .collect(Collectors.joining());
  }
}
