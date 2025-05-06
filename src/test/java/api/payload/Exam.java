package api.payload;

public class Exam {

	String type;
	int relationship_id;
	int cognito_id;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getRelationship_id() {
		return relationship_id;
	}
	public void setRelationship_id(int relationship_id) {
		this.relationship_id = relationship_id;
	}
	public int getCognito_id() {
		return cognito_id;
	}
	public void setCognito_id(int cognito_id) {
		this.cognito_id = cognito_id;
	}
	
	
	
}
