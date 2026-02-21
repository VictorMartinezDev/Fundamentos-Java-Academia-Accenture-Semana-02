package com.academia.principal;

import java.util.*;

import com.academia.enums.Priority;
import com.academia.enums.TicketStatus;

public class TicketSystem {
    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket(1, "Login falla", Priority.CRITICAL));
        tickets.add(new Ticket(2, "Boton desalineado", Priority.LOW));
        tickets.add(new Ticket(3, "Error en pagos", Priority.HIGH));
        tickets.add(new Ticket(4, "Mejorar docs", Priority.MEDIUM));

        System.out.println("=== Todos los Tickets ===");
        tickets.forEach(System.out::println);

        // Transiciones
        System.out.println("\n=== Transiciones ===");
        tickets.get(0).transitionTo(TicketStatus.IN_PROGRESS);
        tickets.get(2).transitionTo(TicketStatus.IN_PROGRESS);
        tickets.get(2).transitionTo(TicketStatus.RESOLVED);

        // Transicion invalida
        tickets.get(2).transitionTo(TicketStatus.OPEN);

        System.out.println("\n=== Estado Actualizado ===");
        tickets.forEach(System.out::println);

        // TODO: EnumMap para contar tickets por status
        System.out.println("\n=== Dashboard (EnumMap) ===");
        EnumMap<TicketStatus, Integer> conteo = new EnumMap<>(TicketStatus.class);
        for (TicketStatus s : TicketStatus.values()) conteo.put(s, 0);
        // TODO: contar tickets por status

        conteo.forEach((status, count) ->
            System.out.printf("  %s: %d%n", status, count));

        // TODO: EnumSet para filtrar tickets urgentes (HIGH + CRITICAL)
        System.out.println("\n=== Tickets Urgentes (EnumSet) ===");
        EnumSet<Priority> urgentes = EnumSet.of(Priority.HIGH, Priority.CRITICAL);
        // TODO: filtrar e imprimir tickets con prioridad urgente
        
        for(Ticket t: tickets) {
        	if(t.getPriority() == Priority.HIGH || t.getPriority() == Priority.CRITICAL)
        		System.out.println(t);
        }
        
    }
}