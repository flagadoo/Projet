package dao;

import data.Billet;

import java.util.*;

public class CatalogueDAOImpl {

    private Map<String,Billet> RepoBillets = new HashMap<String, Billet>();
    public void addBillet(Billet b) {
        RepoBillets.put(b.getReference(), b);

    }

    public List<Billet> getAllBillets() {
        Collection<Billet> res= RepoBillets.values();
        return new ArrayList<Billet>(res);
    }

    public Billet getBillet(String ref) {

        return RepoBillets.get(ref);
    }

    public void updateBillet(Billet b) {
        RepoBillets.put(b.getReference(),b);

    }

    public void deleteBillet(Billet b) {
        RepoBillets.remove(b.getReference());

    }

    public void init()
    {
        addBillet(new Billet("C156","Concert Orchestral",75,150));
        addBillet(new Billet("S578","Spectacle de magie",60,300));
        addBillet(new Billet("S568","One Man Show",80,280));
    }

}
