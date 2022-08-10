package it.epicode.tratta;

public class TrattaService {
  TrattaDao dao = new TrattaDao();
  
	public void save(Tratta tratta) {
		dao.save(tratta);
	}

	public Tratta getById(String tratta) {
		return dao.getById(tratta);
	}

	public void delete(String tratta) {
	dao.delete(tratta);
	}

	public void refresh(Tratta tratta) {
		dao.refresh(tratta);
	}
}
