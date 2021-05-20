package dao;

import data.Billet;

import java.util.List;

public interface CatalogueDAO {
    public void addBillet(Billet b);

    public List<Billet> getAllBillets();
    public Billet getBillet(String ref);
    public void updateBillet (Billet b);
    public void deleteBillet (Billet b);

}
