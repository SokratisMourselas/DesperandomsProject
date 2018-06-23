package org.jboss.jdf.example.ticketmonster.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.jdf.example.ticketmonster.model.Event;

@Path("/events")
@RequestScoped
public class EventService {
	@Inject
	private EntityManager em;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getAllEvents() {
	final List<Event> results =
	em.createQuery(
	"select e from Event e order by e.name").getResultList();
	return results;
	}
}

