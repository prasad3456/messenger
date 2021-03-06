package org.prasad.webservcies.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.prasad.webservcies.messenger.database.DatabaseClass;
import org.prasad.webservcies.messenger.model.Message;

public class ProfileMessageService {
	
	private Map<Long, Message> messages=DatabaseClass.getMessage();
	
	public ProfileMessageService(){
		messages.put(1L, new Message(1L, "Hello World", "Prasad"));
		messages.put(2L, new Message(2L, "Hello World", "Prasad"));
	}
	
	public List<Message> getAllProfileMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);		
	}
	
	public Message addMessage(Message message){
		 message.setId(messages.size() + 1);	
		 messages.put(message.getId(),message);
		 return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId()<=0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	

	
}
