package nexen.forms.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import nexen.forms.domain.Date;
import nexen.forms.domain.FormTemplate;
import nexen.forms.domain.FormUsers;

import org.springframework.jdbc.core.RowMapper;

public class FormDatesMapper implements RowMapper {
	FormTemplate formTemplate;
	public FormDatesMapper(FormTemplate formTemplate) {
		// TODO Auto-generated constructor stub
		this.formTemplate=formTemplate;
	}

	public Date mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		FormUsers formUsers=new FormUsers();
		Date d=new Date();
		//formUsers.setUserId(rs.getString("formUserId"));
		d.setUserId(rs.getString(2));
		String[] z=new String[formTemplate.getNumberOfDates()];
		int j=0;
		for(int i=3;i<=formTemplate.getNumberOfDates()+2;i++)
		{
			
			z[j]=rs.getString(i);
			j++;
			
			
		}
		//formUsers.setDateValues(z);
		d.setDate(z);
		return d;
	}

}
