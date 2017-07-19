package nexen.forms.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import nexen.forms.domain.DropDown;
import nexen.forms.domain.FormTemplate;
import nexen.forms.domain.FormUsers;

import org.springframework.jdbc.core.RowMapper;

public class FormDropDownMapper implements RowMapper {
	FormTemplate formTemplate;
	public FormDropDownMapper(FormTemplate formTemplate) {
		// TODO Auto-generated constructor stub
		this.formTemplate=formTemplate;
	}

	public DropDown mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		FormUsers formUsers=new FormUsers();
		DropDown dd=new DropDown();
		dd.setUserId(rs.getString(2));
		//formUsers.setUserId(rs.getString("formUserId"));
		String[] z=new String[formTemplate.getNumberOfDropDowns()];
		int j=0;
		for(int i=3;i<=formTemplate.getNumberOfDropDowns()+2;i++)
		{
			
			z[j]=rs.getString(i);
			j++;
			
			
		}
		//formUsers.setDropDownValues(z);
		dd.setDropDown(z);
		return dd;
	}

}
