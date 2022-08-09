package it.epicode.parco_mezzi;



public class ServicesMezzi {
	MezziDAO dao = new MezziDAO();
	
	public void save(Mezzi mezzo) {
		dao.save(mezzo);
	}

	public Mezzi getById(String targa) {
		return dao.getById(targa);
	}

	public void delete(String targa) {
		dao.delete(targa);
	}

	public void refresh(Mezzi mezzo) {
		dao.refresh(mezzo);
	}
}
