package stock.entities;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;

@Entity
public class Categorie implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCategorie;
	private String nomCategorie;
	private String descCategorie;
	@OneToMany(mappedBy="categorie",fetch=FetchType.LAZY)
	private Collection<Produit> produits;
	
	public Categorie() {
	}

	public Categorie(String nomCategorie, String descCategorie) {
		this.nomCategorie = nomCategorie;
		this.descCategorie = descCategorie;
	}

	public String getNomCategorie() {
		return this.nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public String getDescCategorie() {
		return this.descCategorie;
	}

	public void setDescCategorie(String descCategorie) {
		this.descCategorie = descCategorie;
	}
	
	public Collection<Produit> getProduits() {
	return produits;
	}
}
