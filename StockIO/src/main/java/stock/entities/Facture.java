package stock.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Facture implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idFacture;
	private Date dateFacture;
	private Date dateLimite;
	private float mntTotal;
	@OneToOne(cascade=CascadeType.ALL)
	private CommandeClient commandeClient;

	public Facture() {
	}

	public Facture(CommandeClient commandeClient, Date dateFacture, Date dateLimite, float mntTotal) {
		this.commandeClient = commandeClient;
		this.dateFacture = dateFacture;
		this.dateLimite = dateLimite;
		this.mntTotal = mntTotal;
	}

	public Integer getIdFacture() {
		return this.idFacture;
	}

	public void setIdFacture(Integer idFacture) {
		this.idFacture = idFacture;
	}

	public CommandeClient getCommandeClient() {
		return this.commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	public Date getDateFacture() {
		return this.dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Date getDateLimite() {
		return this.dateLimite;
	}

	public void setDateLimite(Date dateLimite) {
		this.dateLimite = dateLimite;
	}

	public float getMntTotal() {
		return this.mntTotal;
	}

	public void setMntTotal(float mntTotal) {
		this.mntTotal = mntTotal;
	}

}
