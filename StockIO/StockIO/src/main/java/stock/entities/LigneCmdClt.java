package stock.entities;

import java.util.*;

import javax.persistence.*;

@Entity
@AssociationOverrides({
		@AssociationOverride(name = "pk.produit",
			joinColumns = @JoinColumn(name = "refProduit")),
		@AssociationOverride(name = "pk.commandeClient",
			joinColumns = @JoinColumn(name = "idCmdClt")) })
public class LigneCmdClt implements java.io.Serializable {

	private LigneCmdCltId pk = new LigneCmdCltId();
    private double qtt_cmd_clt;
    List<Produit> produits = new ArrayList<Produit>();
    
    public LigneCmdClt() {
		super();
		// TODO Auto-generated constructor stub
	}

	@EmbeddedId
	public LigneCmdCltId getPk() {
		return pk;
	}
 
	public void setPk(LigneCmdCltId pk) {
		this.pk = pk;
	}
	
	@Transient
	public Produit getProduit() {
		return getPk().getProduit();
	}

	public void setProduit(Produit produit) {
		getPk().setProduit(produit);
	}
	
	public void addProduit(Produit produit){
		produits.add(produit);
	}

	@Transient
	public CommandeClient getCommandeClient() {
		return getPk().getCommandeClient();
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		getPk().setCommandeClient(commandeClient);
	}
	

	public double getQtt_cmd_clt() {
		return qtt_cmd_clt;
	}

	public void setQtt_cmd_clt(double qtt_cmd_clt) {
		this.qtt_cmd_clt = qtt_cmd_clt;
	}

}
