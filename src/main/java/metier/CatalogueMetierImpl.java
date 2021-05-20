package metier;

import dao.CatalogueDAO;
import data.Billet;

import java.util.List;

public class CatalogueMetierImpl {
    private CatalogueDAO dao;


    public void setDao(CatalogueDAO dao) {
        this.dao = dao;
    }

    public void add(Billet b) {

        dao.addBillet(b);
    }

    public Billet find(String ref) {

        return dao.getBillet(ref);
    }

    public List<Billet> findAll() {

        return dao.getAllBillets();
    }

    public void update(Billet b) {
        dao.updateBillet(b);

    }

    public void delete(Billet b) {
        dao.deleteBillet(b);

    }
}
