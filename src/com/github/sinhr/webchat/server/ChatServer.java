package com.github.sinhr.webchat.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChatServer
 */
@WebServlet("/ChatServer")
public class ChatServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ArrayList<ChatEntry> chatroom;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChatServer() {
        super();
        
        chatroom = new ArrayList<ChatEntry>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		for(ChatEntry ce : chatroom){
			out.println(ce.getNick() + ": \t" + ce.getMessage() + "\n");
		}
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nick = request.getParameter("nickname");
		String msg = request.getParameter("message");
		
		ChatEntry ce = new ChatEntry(nick, msg);
		chatroom.add(ce);
		System.out.println("adding");
	}
	
	public void start() throws IOException {
		// TODO
	}
}
