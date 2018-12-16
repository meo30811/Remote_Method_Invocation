package server;

import java.io.Serializable;
import java.util.*;

public class Message implements Serializable {
    private String text;
    private Date date; 
    
    public Message(String text)
    {
    	this.text = text;
    	this.date = Calendar.getInstance().getTime();
    }

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Message [text=" + text + ", date=" + date + "]";
	}
    
}
