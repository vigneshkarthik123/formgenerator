package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

public class FormUsers {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :userId")
	private String userId;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :textBoxValues")
	private String[] textBoxValues;
	@ApiModelProperty(position = 3, required = true, value = "brief description of the property :textAreaValues")
	private String[] textAreaValues;
	@ApiModelProperty(position = 4, required = true, value = "brief description of the property :checkBoxValues")
	private String[] checkBoxValues;
	@ApiModelProperty(position = 5, required = true, value = "brief description of the property :radioButtonValues")
	private String[] radioButtonValues;
	@ApiModelProperty(position = 6, required = true, value = "brief description of the property :dropDownValues")
	private String[] dropDownValues;
	@ApiModelProperty(position = 7, required = true, value = "brief description of the property :dateValues")
	private String[] dateValues;
	@ApiModelProperty(position = 8, required = true, value = "brief description of the property :submit")
	private String[] submit;
	@ApiModelProperty(position = 9, required = true, value = "brief description of the property :resets")
	private String[] resets;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String[] getTextBoxValues() {
		return textBoxValues;
	}
	public void setTextBoxValues(String[] textBoxValues) {
		this.textBoxValues = textBoxValues;
	}
	public String[] getTextAreaValues() {
		return textAreaValues;
	}
	public void setTextAreaValues(String[] textAreaValues) {
		this.textAreaValues = textAreaValues;
	}
	public String[] getCheckBoxValues() {
		return checkBoxValues;
	}
	public void setCheckBoxValues(String[] checkBoxValues) {
		this.checkBoxValues = checkBoxValues;
	}
	public String[] getRadioButtonValues() {
		return radioButtonValues;
	}
	public void setRadioButtonValues(String[] radioButtonValues) {
		this.radioButtonValues = radioButtonValues;
	}
	public String[] getDropDownValues() {
		return dropDownValues;
	}
	public void setDropDownValues(String[] dropDownValues) {
		this.dropDownValues = dropDownValues;
	}
	public String[] getDateValues() {
		return dateValues;
	}
	public void setDateValues(String[] dateValues) {
		this.dateValues = dateValues;
	}
	public String[] getSubmit() {
		return submit;
	}
	public void setSubmit(String[] submit) {
		this.submit = submit;
	}
	public String[] getResets() {
		return resets;
	}
	public void setResets(String[] resets) {
		this.resets = resets;
	}
	
}
