package org.jsp.assigment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CPU {
	@Value("Good")
	private String type;
	@Value("120p")
	private String processor;
	
	public CPU() {
		
	}

	public CPU(String type, String processor) {
		this.type = type;
		this.processor = processor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "CPU [type=" + type + ", processor=" + processor + "]";
	}
	
	
	

}
