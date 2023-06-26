package com.example.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PassangerDserialization {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper =new ObjectMapper();
		Passanger passanger = mapper.readValue(new File("Passanger.json"), Passanger.class);
		
		System.out.println(passanger);

	}

}
