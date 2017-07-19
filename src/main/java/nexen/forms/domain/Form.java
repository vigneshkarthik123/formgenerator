package nexen.forms.domain;

import io.swagger.annotations.ApiModelProperty;

public class Form {
@ApiModelProperty(position = 1, required = true, value = "brief description of the property :formTemplate")
private FormTemplate formTemplate;
@ApiModelProperty(position = 2, required = true, value = "brief description of the property :formElements")
private FormElements formElements;
@ApiModelProperty(position = 3, required = true, value = "brief description of the property :formElementsValues")
private FormElementsValues formElementsValues;


public FormTemplate getFormTemplate() {
	return formTemplate;
}
public void setFormTemplate(FormTemplate formTemplate) {
	this.formTemplate = formTemplate;
}
public FormElements getFormElements() {
	return formElements;
}
public void setFormElements(FormElements formElements) {
	this.formElements = formElements;
}
public FormElementsValues getFormElementsValues() {
	return formElementsValues;
}
public void setFormElementsValues(FormElementsValues formElementsValues) {
	this.formElementsValues = formElementsValues;
}

}
