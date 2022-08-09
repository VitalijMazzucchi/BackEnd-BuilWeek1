package it.epicode.biglietti;


public class TicketServices {
	TicketDAO dao = new TicketDAO();
	public void save(Ticket ticket) {
		dao.save(ticket);
	}

	public Ticket getById(Integer numTicket) {
		return dao.getById(numTicket);
	}

	public void delete(Integer numTicket) {
		dao.delete(numTicket);
	}

	public void refresh(Ticket mezzo) {
		dao.refresh(mezzo);
	}
}
