package bns.tn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bns.tn.Services.IArticleD;
import bns.tn.entities.Articledeclaration;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "article", produces = "application/json")
public class ArticleController {
@Autowired
private IArticleD iArticleD;
@PostMapping("/save")
public void saveArticle(@RequestBody Articledeclaration article) {
	iArticleD.saveArticle(article);
}
@GetMapping("/all")
public @ResponseBody List<Articledeclaration> getAllArticles(){
	return iArticleD.getArticles();
}
@PutMapping("/update/{adId}")
public void putarticle(@PathVariable(name = "adId") Long adId, @RequestBody Articledeclaration article) {
	iArticleD.updateArticle(article, adId);
}
@DeleteMapping("/delete/{adId}")
public void deleteArticle(@PathVariable(name = "adId") Long adId) {
	iArticleD.deleteArticle(adId);
}
@GetMapping ("/one/{adId}")
public @ResponseBody Articledeclaration getOnead(@PathVariable (name="adId") Long adId , Articledeclaration article ) {
	return iArticleD.getOnead(adId);
}
}

