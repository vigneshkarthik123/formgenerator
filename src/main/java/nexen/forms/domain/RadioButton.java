package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class RadioButton {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :userId")
	private String userId;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :radioButton")
	private String[] radioButton;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

	public String[] getRadioButton() {
		return radioButton;
	}

	public void setRadioButton(String[] radioButton) {
		this.radioButton = radioButton;
	}

	
}
