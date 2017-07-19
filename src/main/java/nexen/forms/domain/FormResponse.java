package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class FormResponse {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :metaData")
	private MetaData metaData;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :formOutput")
	private List formOutput;
	@ApiModelProperty(position = 3, required = true, value = "brief description of the property :error")
	private ErrorMessage error;
	
public MetaData getMetaData() {
		return metaData;
	}
	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}
	public List getFormOutput() {
		return formOutput;
	}
	public void setFormOutput(List formOutput) {
		this.formOutput = formOutput;
	}
	public ErrorMessage getError() {
		return error;
	}
	public void setError(ErrorMessage error) {
		this.error = error;
	}

}
