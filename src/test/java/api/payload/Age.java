package api.payload;

public class Age {
	
	String type;
	int client_id;
	int age;
	int request_type;
	int cognito_id;
	int relationship_id;
	
	
	public int getRelationship_id() {
		return relationship_id;
	}
	public void setRelationship_id(int relationship_id) {
		this.relationship_id = relationship_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRequest_type() {
		return request_type;
	}
	public void setRequest_type(int request_type) {
		this.request_type = request_type;
	}
	public int getCognito_id() {
		return cognito_id;
	}
	public void setCognito_id(int cognito_id) {
		this.cognito_id = cognito_id;
	}
	
	

}
