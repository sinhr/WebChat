package com.github.sinhr.webchat.server;

public class ChatEntry {
	private String nick;
	private String message;
	
	
	/**
	 * @param nick
	 * @param inhalt
	 */
	public ChatEntry(String nick, String message) {
		super();
		this.nick = nick;
		this.message = message;
	}
	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}
	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param inhalt the inhalt to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	
}
