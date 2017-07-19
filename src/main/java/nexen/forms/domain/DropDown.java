package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class DropDown {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :userId")
	private String userId;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :dropDown")
	private String[] dropDown;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

	public String[] getDropDown() {
		return dropDown;
	}

	public void setDropDown(String[] dropDown) {
		this.dropDown = dropDown;
	}

	

}
