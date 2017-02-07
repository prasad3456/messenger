package org.prasad.webservcies.messenger.resources;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.prasad.webservcies.messenger.model.Message;
import org.prasad.webservcies.messenger.service.ProfileMessageService;

@Path("/profileMessage")
public class ProfileMessageResource {

	ProfileMessageService pService=new ProfileMessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getAllProfileMessage(){
		return pService.getAllProfileMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String test(@PathParam("messageId") String messageId){
		return "Got Path Param" +messageId;
	}
	
	
	
}
