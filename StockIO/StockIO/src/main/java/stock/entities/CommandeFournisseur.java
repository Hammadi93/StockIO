package stock.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CommandeFournisseur implements java.io.Serializable {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCmdFounisseur;
	private Date dateCmdFounisseur;
	private int prixTotalFournisseur;
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.commandeFournisseur", cascade=CascadeType.ALL)
	private Set<LigneCmdFounisseur> ligneCmdFounisseurs = new HashSet<LigneCmdFounisseur>(0);

	public CommandeFournisseur() {
	}

	public CommandeFournisseur(Date dateCmdFounisseur, int prixTotalFournisseur) {
		this.dateCmdFounisseur = dateCmdFounisseur;
		this.prixTotalFournisseur = prixTotalFournisseur;
	}
	
	

	public CommandeFournisseur(Date dateCmdFounisseur, int prixTotalFournisseur, Fournisseur fournisseur,
			Set<LigneCmdFounisseur> ligneCmdFounisseurs) {
		super();
		this.dateCmdFounisseur = dateCmdFounisseur;
		this.prixTotalFournisseur = prixTotalFournisseur;
		this.fournisseur = fournisseur;
		this.ligneCmdFounisseurs = ligneCmdFounisseurs;
	}

	public Date getDateCmdFounisseur() {
		return this.dateCmdFounisseur;
	}

	public void setDateCmdFounisseur(Date dateCmdFounisseur) {
		this.dateCmdFounisseur = dateCmdFounisseur;
	}

	public int getPrixTotalFournisseur() {
		return this.prixTotalFournisseur;
	}

	public void setPrixTotalFournisseur(int prixTotalFournisseur) {
		this.prixTotalFournisseur = prixTotalFournisseur;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Set<LigneCmdFounisseur> getLigneCmdFounisseurs() {
		return ligneCmdFounisseurs;
	}

	public void setLigneCmdFounisseurs(Set<LigneCmdFounisseur> ligneCmdFounisseurs) {
		this.ligneCmdFounisseurs = ligneCmdFounisseurs;
	}

	

}
