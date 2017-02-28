package stock.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class CommandeClient implements java.io.Serializable {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCmdClt;
	private Date dateCmdClt;
	private int prixTotalClt;
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	@OneToOne(cascade=CascadeType.ALL)
	private Facture facture;
	@OneToOne(cascade=CascadeType.ALL)
	private CommandeClient BonDeLivraison;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.commandeClient", cascade=CascadeType.ALL)
	private Set<LigneCmdClt> ligneCmdClt = new HashSet<LigneCmdClt>(0);


	public CommandeClient() {
	}

	public CommandeClient(Date dateCmdClt, int prixTotalClt) {
		super();
		this.dateCmdClt = dateCmdClt;
		this.prixTotalClt = prixTotalClt;
	}

	public CommandeClient(Date dateCmdClt, int prixTotalClt, Client client, Facture facture,
			CommandeClient bonDeLivraison, Set<LigneCmdClt> ligneCmdClt) {
		super();
		this.dateCmdClt = dateCmdClt;
		this.prixTotalClt = prixTotalClt;
		this.client = client;
		this.facture = facture;
		BonDeLivraison = bonDeLivraison;
		this.ligneCmdClt = ligneCmdClt;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Facture getFacture() {
		return this.facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Date getDateCmdClt() {
		return this.dateCmdClt;
	}

	public void setDateCmdClt(Date dateCmdClt) {
		this.dateCmdClt = dateCmdClt;
	}

	public int getPrixTotalClt() {
		return this.prixTotalClt;
	}

	public void setPrixTotalClt(int prixTotalClt) {
		this.prixTotalClt = prixTotalClt;
	}

	public Integer getIdCmdClt() {
		return idCmdClt;
	}

	public void setIdCmdClt(Integer idCmdClt) {
		this.idCmdClt = idCmdClt;
	}

	public CommandeClient getBonDeLivraison() {
		return BonDeLivraison;
	}

	public void setBonDeLivraison(CommandeClient bonDeLivraison) {
		BonDeLivraison = bonDeLivraison;
	}

	public Set<LigneCmdClt> getLigneCmdClt() {
		return ligneCmdClt;
	}

	public void setLigneCmdClt(Set<LigneCmdClt> ligneCmdClt) {
		this.ligneCmdClt = ligneCmdClt;
	}
  
	
}
