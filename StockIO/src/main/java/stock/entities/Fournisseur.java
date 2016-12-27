package stock.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Fournisseur implements java.io.Serializable {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idFournisseur;
	private String nomFournisseur;
	private String addrFournisseur;
	private String telFournisseur;
	@OneToMany(mappedBy="fournisseur",fetch=FetchType.LAZY)
	private Collection<CommandeFournisseur> cmdfournisseur;

	public Fournisseur() {
	}

	public Fournisseur(String nomFournisseur, String addrFournisseur, String telFournisseur) {
		this.nomFournisseur = nomFournisseur;
		this.addrFournisseur = addrFournisseur;
		this.telFournisseur = telFournisseur;
	}

	public Fournisseur(String nomFournisseur, String addrFournisseur, String telFournisseur, Set produits) {
		this.nomFournisseur = nomFournisseur;
		this.addrFournisseur = addrFournisseur;
		this.telFournisseur = telFournisseur;
		this.cmdfournisseur = cmdfournisseur;
	}

	public Integer getIdFournisseur() {
		return this.idFournisseur;
	}

	public void setIdFournisseur(Integer idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getNomFournisseur() {
		return this.nomFournisseur;
	}

	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}

	public String getAddrFournisseur() {
		return this.addrFournisseur;
	}

	public void setAddrFournisseur(String addrFournisseur) {
		this.addrFournisseur = addrFournisseur;
	}

	public String getTelFournisseur() {
		return this.telFournisseur;
	}

	public void setTelFournisseur(String telFournisseur) {
		this.telFournisseur = telFournisseur;
	}

	public Collection<CommandeFournisseur> getCmdfournisseur() {
		return cmdfournisseur;
	}

	public void setCmdfournisseur(Collection<CommandeFournisseur> cmdfournisseur) {
		this.cmdfournisseur = cmdfournisseur;
	}

	
}
