package com.academia.service;

import java.util.*;

import com.academia.enums.EventType;
import com.academia.interfaces.EventHandler;

public class EventBus {
    // TODO: Map de EventType a lista de handlers
    private final Map<EventType, List<EventHandler>> listeners = new HashMap<>();
    public EventBus() {
        // TODO: inicializar lista vacia para cada EventType
        for (EventType type : EventType.values()) {
            listeners.put(type, new ArrayList<>());
        }
    }

    public void subscribe(EventType type, EventHandler handler) {
        // TODO: agregar handler a la lista del tipo
    	for(EventType et: listeners.keySet()) {
    		if(et.equals(type))
    			listeners.get(et).add(handler);
    	}
    
    }

    public void publish(EventType type, String data) {
        System.out.printf("[BUS] Publicando %s%n", type);
        // TODO: ejecutar todos los handlers del tipo
        for(EventType et: listeners.keySet()) {
    		if(et.equals(type))
    			for(EventHandler eh: listeners.get(type))
    				eh.handle(data);
    	}
    }
}