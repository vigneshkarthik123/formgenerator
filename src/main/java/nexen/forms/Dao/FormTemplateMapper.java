package nexen.forms.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import nexen.forms.domain.FormTemplate;

import org.springframework.jdbc.core.RowMapper;

public class FormTemplateMapper implements RowMapper {

	public FormTemplate mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		FormTemplate formTemplate=new FormTemplate();
		formTemplate.setFormId(rs.getInt(1));
		formTemplate.setFormName(rs.getString(3));
		formTemplate.setUserId(rs.getString(2));
		formTemplate.setNumberOfTextBoxes(rs.getInt(4));
		formTemplate.setNumberOfTextAreas(rs.getInt(5));
		formTemplate.setNumberOfCheckBoxes(rs.getInt(6));
		formTemplate.setNumberOfRadioButtons(rs.getInt(7));
		formTemplate.setNumberOfDropDowns(rs.getInt(8));
		formTemplate.setNumberOfDates(rs.getInt(9));
		formTemplate.setNumberOfSubmits(rs.getInt(10));
		formTemplate.setNumberOfResets(rs.getInt(11));
		return formTemplate;
	}

}
