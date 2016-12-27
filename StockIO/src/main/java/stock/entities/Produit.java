package stock.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
@Entity
public class Produit implements java.io.Serializable {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer refProduit;
	private Fournisseur fournisseur;
	private String designationProduit;
	private int quantiteProduit;
	private float prixProduit;
	private int seuilMin;
	private String imageProduit;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.produit", cascade=CascadeType.ALL)
	private Set<LigneCmdFounisseur> ligneCmdFounisseurs = new HashSet<LigneCmdFounisseur>(0);
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.produit", cascade=CascadeType.ALL)
	private Set<LigneCmdClt> ligneCmdClts = new HashSet<LigneCmdClt>(0);
	@ManyToOne
	@JoinColumn(name="ID_CAT")
	private Categorie categorie;

	public Produit() {
	}

	public Produit(Categorie categorie, Fournisseur fournisseur, String designationProduit, int quantiteProduit,
			float prixProduit, int seuilMin, String imageProduit) {
		this.categorie = categorie;
		this.fournisseur = fournisseur;
		this.designationProduit = designationProduit;
		this.quantiteProduit = quantiteProduit;
		this.prixProduit = prixProduit;
		this.seuilMin = seuilMin;
		this.imageProduit = imageProduit;
	}

	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Fournisseur getFournisseur() {
		return this.fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public String getDesignationProduit() {
		return this.designationProduit;
	}

	public void setDesignationProduit(String designationProduit) {
		this.designationProduit = designationProduit;
	}

	public int getQuantiteProduit() {
		return this.quantiteProduit;
	}

	public void setQuantiteProduit(int quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}

	public float getPrixProduit() {
		return this.prixProduit;
	}

	public void setPrixProduit(float prixProduit) {
		this.prixProduit = prixProduit;
	}

	public int getSeuilMin() {
		return this.seuilMin;
	}

	public void setSeuilMin(int seuilMin) {
		this.seuilMin = seuilMin;
	}

	public String getImageProduit() {
		return this.imageProduit;
	}

	public void setImageProduit(String imageProduit) {
		this.imageProduit = imageProduit;
	}

	public Set getLigneCmdClts() {
		return this.ligneCmdClts;
	}

	public void setLigneCmdClts(Set ligneCmdClts) {
		this.ligneCmdClts = ligneCmdClts;
	}

	public Set getLigneCmdFounisseurs() {
		return this.ligneCmdFounisseurs;
	}

	public void setLigneCmdFounisseurs(Set ligneCmdFounisseurs) {
		this.ligneCmdFounisseurs = ligneCmdFounisseurs;
	}

}
