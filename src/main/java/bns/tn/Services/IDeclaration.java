package bns.tn.Services;

import java.util.List;

import bns.tn.entities.Declaration;

public interface IDeclaration {
	public void saveDeclaration(Declaration declaration);

	public List<Declaration> getDeclarations();

	public void updateDeclaration(Declaration declaration, Long decID);

	public void deleteDeclaration(Long decID);

	public Declaration getOnedec(Long decID);
}
