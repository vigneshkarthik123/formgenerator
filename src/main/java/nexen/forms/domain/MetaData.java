package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

public class MetaData {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :responseCode")
	private int responseCode;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :description")
	private String description;
	
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
