package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class TextArea {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :userId")
	private String userId;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :textArea")
	private String[] textArea;
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

	public String[] getTextArea() {
		return textArea;
	}

	public void setTextArea(String[] textArea) {
		this.textArea = textArea;
	}

	

}
