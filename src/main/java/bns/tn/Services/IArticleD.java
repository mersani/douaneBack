package bns.tn.Services;

import java.util.List;

import bns.tn.entities.Articledeclaration;

public interface IArticleD {
	public void saveArticle(Articledeclaration articeld);
	public List<Articledeclaration>getArticles();
	public void updateArticle(Articledeclaration article, Long adId);
	public void deleteArticle(Long adId);
	public Articledeclaration getOnead(Long adId);

}
