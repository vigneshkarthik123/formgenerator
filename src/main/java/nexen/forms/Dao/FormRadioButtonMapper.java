package nexen.forms.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import nexen.forms.domain.FormTemplate;
import nexen.forms.domain.FormUsers;
import nexen.forms.domain.RadioButton;

import org.springframework.jdbc.core.RowMapper;

public class FormRadioButtonMapper implements RowMapper {
	FormTemplate formTemplate;
	public FormRadioButtonMapper(FormTemplate formTemplate) {
		// TODO Auto-generated constructor stub
		this.formTemplate=formTemplate;
	}

	public RadioButton mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		FormUsers formUsers=new FormUsers();
		RadioButton rd=new RadioButton();
		rd.setUserId(rs.getString(2));
		//formUsers.setUserId(rs.getString("formUserId"));
		String[] z=new String[formTemplate.getNumberOfRadioButtons()];
		int j=0;
		for(int i=3;i<=formTemplate.getNumberOfRadioButtons()+2;i++)
		{
			
			z[j]=rs.getString(i);
			j++;
			
			
		}
		//formUsers.setRadioButtonValues(z);
		rd.setRadioButton(z);
		return rd;
	}

}
