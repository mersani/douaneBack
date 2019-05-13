package bns.tn.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bns.tn.DAO.ArticledeclarationRepository;
import bns.tn.entities.Articledeclaration;

@Service
public class ArticleImpl implements IArticleD {
@Autowired
private ArticledeclarationRepository articleRepository;
public void saveArticle(Articledeclaration article) {
	articleRepository.save(article);
}
@Override
public List<Articledeclaration> getArticles(){
	return articleRepository.findAll();
}
@Override 
public void updateArticle(Articledeclaration article, Long adId) {
	Optional<Articledeclaration> art = articleRepository.findById(adId);
	if (art.isPresent()) {
		Articledeclaration articled = art.get();
		articled.setAdLibelle(article.getAdLibelle());
		articled.setAdMarque(article.getAdMarque());
		articled.setAdNaturecolis(article.getAdNaturecolis());
		articled.setAdNbrcolis(article.getAdNbrcolis());
		articled.setAdNumArticle(article.getAdNumArticle());
		articled.setAdNumConteneur(article.getAdNumConteneur());
		articled.setAdNumcolis(article.getAdNumcolis());
		articled.setAdPoidsbrut(article.getAdPoidsbrut());
		articled.setAdPoidsnet(article.getAdPoidsnet());
		articled.setAdValeurEndouaneenDevise(article.getAdValeurEndouaneenDevise());
		articled.setAdValeurEnDouaneMonnaieLocale(article.getAdValeurEnDouaneMonnaieLocale());
		articled.setAdValeurStatistiqueEnDevise(article.getAdValeurStatistiqueEnDevise());
		articled.setAdValeurStatistiqueEnMonnaielocale(article.getAdValeurStatistiqueEnMonnaielocale());
	    articleRepository.saveAndFlush(articled) ;      
	}
	
}
@Override 
public void deleteArticle(Long adId) {
	articleRepository.deleteById(adId);
}

@Override 
public Articledeclaration getOnead(Long adId) {
	Articledeclaration obj = articleRepository.findById(adId).get();
	return obj;
}
}
