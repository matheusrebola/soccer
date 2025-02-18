package soccervs.persistence.linhadefensiva.core.utils;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import soccervs.persistence.linhadefensiva.core.dtos.Event;

@Component
public class JsonUtil {

	private final ObjectMapper objectMapper;

	public JsonUtil(ObjectMapper objectMapper) {
		super();
		this.objectMapper = objectMapper;
	}

	public String toJson(Object object) {
		try {
			return objectMapper.writeValueAsString(object);
		} catch (Exception ex) {
			return "";
		}
	}

	public Event toEvent(String json) {
		try {
			return objectMapper.readValue(json, Event.class);
		} catch (Exception ex) {
			return null;
		}
	}
}
