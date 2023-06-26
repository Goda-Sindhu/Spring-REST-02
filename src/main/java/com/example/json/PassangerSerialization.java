package com.example.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PassangerSerialization {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");

		Passanger p = new Passanger();
		p.setName("Raju");
		p.setFrom("Hyd");
		p.setTo("Delhi");
		p.setGender("Male");
		p.setAddr(addr);
		
		ObjectMapper object = new ObjectMapper();
		object.writeValue(new File("Passanger.json"), p);
		System.out.println(p);

	}

}
