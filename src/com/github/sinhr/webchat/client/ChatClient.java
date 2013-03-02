package com.github.sinhr.webchat.client;

import java.net.MalformedURLException;
import java.net.URL;

import com.github.sinhr.webchat.server.ChatServer;



public class ChatClient {
	private View view;
	private ClientModel model;
	
	public ChatClient() throws MalformedURLException {
		model = new ClientModel(new URL("http://localhost:8080/WebChat/ChatServer"));
		view = new View(model);
		view.getFrame().setVisible(true);
		
	}

	public static void main(String[] args) throws MalformedURLException {
		new ChatClient();
		
		}
	}

