package controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * Created by Hans on 25/03/2016.
 */

@Path("/basic")
public class BasicController {

	@GET
	public String doGet(@QueryParam("say") String say) {
		return say+" TERE2";
	}
}
