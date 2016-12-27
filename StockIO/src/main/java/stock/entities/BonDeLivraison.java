package stock.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class BonDeLivraison implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idLivraison;
	private Date dateLivraison;
	private int qtLivraison;
	private float mntLivraison;
	@OneToOne(cascade=CascadeType.ALL)
	private CommandeClient commandeClient;

	public BonDeLivraison() {
		super();
	}

	public BonDeLivraison(CommandeClient commandeClient, Date dateLivraison, int qtLivraison, float mntLivraison) {
		this.commandeClient = commandeClient;
		this.dateLivraison = dateLivraison;
		this.qtLivraison = qtLivraison;
		this.mntLivraison = mntLivraison;
	}

	public BonDeLivraison(Date dateLivraison, int qtLivraison, float mntLivraison, CommandeClient commandeClient) {
		super();
		this.dateLivraison = dateLivraison;
		this.qtLivraison = qtLivraison;
		this.mntLivraison = mntLivraison;
		this.commandeClient = commandeClient;
	}

	public CommandeClient getCommandeClient() {
		return this.commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	public Date getDateLivraison() {
		return this.dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public int getQtLivraison() {
		return this.qtLivraison;
	}

	public void setQtLivraison(int qtLivraison) {
		this.qtLivraison = qtLivraison;
	}

	public float getMntLivraison() {
		return this.mntLivraison;
	}

	public void setMntLivraison(float mntLivraison) {
		this.mntLivraison = mntLivraison;
	}

}
