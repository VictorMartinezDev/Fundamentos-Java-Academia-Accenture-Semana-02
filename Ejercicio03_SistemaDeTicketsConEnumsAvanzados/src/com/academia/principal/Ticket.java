package com.academia.principal;

import com.academia.enums.*;

class Ticket {
    private final int id;
    private final String description;
    private final Priority priority;
    private TicketStatus status;

    public Ticket(int id, String description, Priority priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.status = TicketStatus.OPEN;
    }

    public void transitionTo(TicketStatus newStatus) {
        // TODO: validar con canTransitionTo, cambiar o imprimir error
    	if(status.canTransitionTo(newStatus)) { 
    		System.out.println(status + " -> " + newStatus);
    		status = newStatus;
    	}
    	else System.out.println("No es posible realizar el cambio de status de " + status + " a " + newStatus);
    }

    // TODO: getters
    public int getId() { return id; }
    public Priority getPriority() { return priority; }
    public TicketStatus getStatus() { return status; }

    @Override
    public String toString() {
        return String.format("Ticket{id=%d, desc='%s', priority=%s, status=%s}",
            id, description, priority.getLabel(), status);
    }
}