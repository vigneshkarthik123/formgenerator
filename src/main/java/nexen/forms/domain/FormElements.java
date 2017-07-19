package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

public class FormElements {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :formId")
	private int formId;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :formUserId")
	private int formUserId;

	
	@ApiModelProperty(position = 3, required = true, value = "brief description of the property :textBoxes")
	private String[] textBoxes;
	@ApiModelProperty(position = 4, required = true, value = "brief description of the property :textAreas")
	private String[] textAreas;
	@ApiModelProperty(position = 5, required = true, value = "brief description of the property :checkBoxes")
	private String[] checkBoxes;
	@ApiModelProperty(position = 6, required = true, value = "brief description of the property :radioButtons")
	private String[] radioButtons;
	@ApiModelProperty(position = 7, required = true, value = "brief description of the property :dropDowns")
	private String[] dropDowns;
	@ApiModelProperty(position = 8, required = true, value = "brief description of the property :dates")
	private String[] dates;
	@ApiModelProperty(position = 9, required = true, value = "brief description of the property :submits")
	private String[] submits;
	@ApiModelProperty(position = 10, required = true, value = "brief description of the property :resets;")
	private String[] resets;
	

	public String[] getResets() {
		return resets;
	}

	public void setResets(String[] resets) {
		this.resets = resets;
	}

	public String[] getTextBoxes() {
		return textBoxes;
	}

	public void setTextBoxes(String[] textBoxes) {
		this.textBoxes = textBoxes;
	}

	public String[] getTextAreas() {
		return textAreas;
	}

	public void setTextAreas(String[] textAreas) {
		this.textAreas = textAreas;
	}

	public String[] getCheckBoxes() {
		return checkBoxes;
	}

	public void setCheckBoxes(String[] checkBoxes) {
		this.checkBoxes = checkBoxes;
	}

	public String[] getRadioButtons() {
		return radioButtons;
	}

	public void setRadioButtons(String[] radioButtons) {
		this.radioButtons = radioButtons;
	}

	public String[] getDropDowns() {
		return dropDowns;
	}

	public void setDropDowns(String[] dropDowns) {
		this.dropDowns = dropDowns;
	}

	public String[] getDates() {
		return dates;
	}

	public void setDates(String[] dates) {
		this.dates = dates;
	}

	public String[] getSubmits() {
		return submits;
	}

	public void setSubmits(String[] submits) {
		this.submits = submits;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}
	public int getFormUserId() {
		return formUserId;
	}

	public void setFormUserId(int formUserId) {
		this.formUserId = formUserId;
	}

}
