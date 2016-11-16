package edu.esprit.entites;

public class Commentaire {

	
	private int idCommentaire;
	private int idOffre	;
	private int idOwner;
	private String dateAjout;
	private String contenu;
	
	
	
	public int getIdCommentaire() {
		return idCommentaire;
	}
	public void setIdCommentaire(int idCommentaire) {
		this.idCommentaire = idCommentaire;
	}
	
	
	public int getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
	}
	
	public int getIdOwner() {
		return idOwner;
	}
	public void setIdOwner(int idOwner) {
		this.idOwner = idOwner;
	}
	
	public String getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(String dateAjout) {
		this.dateAjout = dateAjout;
	}
	
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Commentaire(int idCommentaire, int idOffre, int idOwner,
			String dateAjout, String contenu) {
		super();
		this.idCommentaire = idCommentaire;
		this.idOffre = idOffre;
		this.idOwner = idOwner;
		this.dateAjout = dateAjout;
		this.contenu = contenu;
	}
	
	@Override
	public String toString() {
		return "Commentaire [idCommentaire=" + idCommentaire + ", idOffre="
				+ idOffre + ", idOwner=" + idOwner + ", dateAjout=" + dateAjout
				+ ", contenu=" + contenu + "]";
	}
	
	
   
	
	
	
	
}
