package test.app.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("helloworld")
public class MyResource {
	
    @GET
    public String getHello() {
        return "HelloWorld !";
    }
}