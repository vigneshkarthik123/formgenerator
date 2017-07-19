package nexen.forms.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import nexen.forms.domain.CheckBox;
import nexen.forms.domain.FormTemplate;
import nexen.forms.domain.FormUsers;

import org.springframework.jdbc.core.RowMapper;

public class FormCheckBoxMapper implements RowMapper{
	FormTemplate formTemplate;
	public FormCheckBoxMapper(FormTemplate formTemplate) {
		// TODO Auto-generated constructor stub
		this.formTemplate=formTemplate;
	}

	public CheckBox mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		FormUsers formUsers=new FormUsers();
		CheckBox cb=new CheckBox();
		//formUsers.setUserId(rs.getString("formUserId"));
		cb.setUserId(rs.getString(2));
		String[] z=new String[formTemplate.getNumberOfCheckBoxes()];
		int j=0;
		for(int i=3;i<=formTemplate.getNumberOfCheckBoxes()+2;i++)
		{
			
			z[j]=rs.getString(i);
			j++;
			
			
		}
		//formUsers.setCheckBoxValues(z);
		cb.setCheckBox(z);
		return cb;
		
	}

}
