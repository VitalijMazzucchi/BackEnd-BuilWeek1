package it.epicode.parco_mezzi;



public class ServicesMezzi {
	MezziDAO dao = new MezziDAO();
	
	public void save(Mezzo mezzo) {
		dao.save(mezzo);
	}

	public Mezzo getById(String targa) {
		return dao.getById(targa);
	}

	public void delete(String targa) {
		dao.delete(targa);
	}

	public void refresh(Mezzo mezzo) {
		dao.refresh(mezzo);
	}
	
}
