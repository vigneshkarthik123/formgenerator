package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

public class FormElementsValues {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :formUserId")
	private String formUserId;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :textBoxesValues")
	private String[] textBoxesValues;
	@ApiModelProperty(position = 3, required = true, value = "brief description of the property :textAreasValues")
	private String[] textAreasValues;
	@ApiModelProperty(position = 4, required = true, value = "brief description of the property :checkBoxesValues")
	private String[] checkBoxesValues;
	@ApiModelProperty(position = 5, required = true, value = "brief description of the property :radioButtonsValues")
	private String[] radioButtonsValues;
	@ApiModelProperty(position = 6, required = true, value = "brief description of the property :dropDownsValues")
	private String[] dropDownsValues;
	@ApiModelProperty(position = 7, required = true, value = "brief description of the property :datesValues")
	private String[] datesValues;
	@ApiModelProperty(position = 8, required = true, value = "brief description of the property :submitsValue")
	private String[] submitsValues;
	@ApiModelProperty(position = 9, required = true, value = "brief description of the property :resetsValues")
	private String[] resetsValues;
	
	public String[] getTextBoxesValues() {
		return textBoxesValues;
	}
	public void setTextBoxesValues(String[] textBoxesValues) {
		this.textBoxesValues = textBoxesValues;
	}
	public String[] getTextAreasValues() {
		return textAreasValues;
	}
	public void setTextAreasValues(String[] textAreasValues) {
		this.textAreasValues = textAreasValues;
	}
	public String[] getCheckBoxesValues() {
		return checkBoxesValues;
	}
	public void setCheckBoxesValues(String[] checkBoxesValues) {
		this.checkBoxesValues = checkBoxesValues;
	}
	public String[] getRadioButtonsValues() {
		return radioButtonsValues;
	}
	public void setRadioButtonsValues(String[] radioButtonsValues) {
		this.radioButtonsValues = radioButtonsValues;
	}
	public String[] getDropDownsValues() {
		return dropDownsValues;
	}
	public void setDropDownsValues(String[] dropDownsValues) {
		this.dropDownsValues = dropDownsValues;
	}
	public String[] getDatesValues() {
		return datesValues;
	}
	public void setDatesValues(String[] datesValues) {
		this.datesValues = datesValues;
	}
	public String[] getSubmitsValues() {
		return submitsValues;
	}
	public void setSubmitsValues(String[] submitsValues) {
		this.submitsValues = submitsValues;
	}
	public String[] getResetsValues() {
		return resetsValues;
	}
	public void setResetsValues(String[] resetsValues) {
		this.resetsValues = resetsValues;
	}
	public String getFormUserId() {
		return formUserId;
	}
	public void setFormUserId(String formUserId) {
		this.formUserId = formUserId;
	}

}
