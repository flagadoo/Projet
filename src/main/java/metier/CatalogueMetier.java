package metier;

import data.Billet;

import java.util.List;

public interface CatalogueMetier {
    public void add(Billet b);
    public Billet find(String ref);
    public List<Billet> findAll ();
    public void update(Billet b);
    public void delete(Billet b);
}
