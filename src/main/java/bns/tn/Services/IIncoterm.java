package bns.tn.Services;

import java.util.List;

import bns.tn.entities.Incoterm;

public interface IIncoterm {
public void saveIncoterm(Incoterm incoterm);

public List<Incoterm> getIncoterms();
}
