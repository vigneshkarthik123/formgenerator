package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

public class ErrorMessage {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :errorCode")
	private int errorCode;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :errorDescription")
	private String errorDescription;
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	

}
