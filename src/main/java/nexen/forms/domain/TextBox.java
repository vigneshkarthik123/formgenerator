package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class TextBox {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :userId")
	private String userId;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :textBox")
	private String[] textBox;
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

	public String[] getTextBox() {
		return textBox;
	}

	public void setTextBox(String[] textBox) {
		this.textBox = textBox;
	}

	

}
