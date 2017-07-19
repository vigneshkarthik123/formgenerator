package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

public class FormTemplate {
	@ApiModelProperty(position = 1, required = true, value = "brief description of the property :formId")
	private int formId;
	@ApiModelProperty(position = 2, required = true, value = "brief description of the property :userId")
	private String userId;
	@ApiModelProperty(position = 3, required = true, value = "brief description of the property :formName")
	private String formName;
	@ApiModelProperty(position = 4, required = true, value = "brief description of the property :numberOfTextBoxes")
	private int numberOfTextBoxes;
	@ApiModelProperty(position = 5, required = true, value = "brief description of the property :numberOfTextAreas")
	private int numberOfTextAreas;
	@ApiModelProperty(position = 6, required = true, value = "brief description of the property :numberOfCheckBoxes")
	private int numberOfCheckBoxes;
	@ApiModelProperty(position = 7, required = true, value = "brief description of the property :numberOfRadioButtons")
	private int numberOfRadioButtons;
	@ApiModelProperty(position = 8, required = true, value = "brief description of the property :numberOfDropDowns")
	private int numberOfDropDowns;
	@ApiModelProperty(position = 9, required = true, value = "brief description of the property :numberOfSubmits")
	private int numberOfSubmits;
	@ApiModelProperty(position = 10, required = true, value = "brief description of the property :numberOfDates")
	private int numberOfDates;
	@ApiModelProperty(position = 11, required = true, value = "brief description of the property :numberOfResets")
	private int numberOfResets;

	public int getNumberOfResets() {
		return numberOfResets;
	}

	public void setNumberOfResets(int numberOfResets) {
		this.numberOfResets = numberOfResets;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public int getNumberOfTextBoxes() {
		return numberOfTextBoxes;
	}

	public void setNumberOfTextBoxes(int numberOfTextBoxes) {
		this.numberOfTextBoxes = numberOfTextBoxes;
	}

	public int getNumberOfTextAreas() {
		return numberOfTextAreas;
	}

	public void setNumberOfTextAreas(int numberOfTextAreas) {
		this.numberOfTextAreas = numberOfTextAreas;
	}

	public int getNumberOfCheckBoxes() {
		return numberOfCheckBoxes;
	}

	public void setNumberOfCheckBoxes(int numberOfCheckBoxes) {
		this.numberOfCheckBoxes = numberOfCheckBoxes;
	}

	public int getNumberOfRadioButtons() {
		return numberOfRadioButtons;
	}

	public void setNumberOfRadioButtons(int numberOfRadioButtons) {
		this.numberOfRadioButtons = numberOfRadioButtons;
	}

	public int getNumberOfDropDowns() {
		return numberOfDropDowns;
	}

	public void setNumberOfDropDowns(int numberOfDropDowns) {
		this.numberOfDropDowns = numberOfDropDowns;
	}

	public int getNumberOfSubmits() {
		return numberOfSubmits;
	}

	public void setNumberOfSubmits(int numberOfSubmits) {
		this.numberOfSubmits = numberOfSubmits;
	}

	public int getNumberOfDates() {
		return numberOfDates;
	}

	public void setNumberOfDates(int numberOfDates) {
		this.numberOfDates = numberOfDates;
	}

}
