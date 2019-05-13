package bns.tn.Services;

import java.util.List;

import bns.tn.entities.Intervenant;

public interface IIntervenant {
 public void saveIntervenant(Intervenant intervenant);
  public List<Intervenant> getIntervenants();
 
}
