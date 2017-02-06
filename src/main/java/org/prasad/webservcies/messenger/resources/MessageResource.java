package org.prasad.webservcies.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.prasad.webservcies.messenger.model.Message;
import org.prasad.webservcies.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService mService=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return mService.getAllMessages();
	}
}
