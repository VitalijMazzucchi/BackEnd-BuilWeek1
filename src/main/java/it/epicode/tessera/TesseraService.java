package it.epicode.tessera;

public class TesseraService {
	TesseraDao dao = new TesseraDao();
	public void save(Tessera tessera) {
		dao.save(tessera);
	}

	public Tessera getById(String tessera) {
		return dao.getById(tessera);
	}

	public void delete(String tessera) {
		dao.delete(tessera);
	}

	public void refresh(Tessera tessera) {
		dao.refresh(tessera);
	}
}
