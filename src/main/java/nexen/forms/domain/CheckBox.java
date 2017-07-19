package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

public class CheckBox {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :userId")
	private String userId;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :checkBox")
	private String[] checkBox;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	

	public String[] getCheckBox() {
		return checkBox;
	}

	public void setCheckBox(String[] checkBox) {
		this.checkBox = checkBox;
	}

	

}
