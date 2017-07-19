package nexen.forms.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import nexen.forms.domain.FormTemplate;
import nexen.forms.domain.FormUsers;
import nexen.forms.domain.TextArea;

import org.springframework.jdbc.core.RowMapper;

public class FormTextAreaMapper implements RowMapper{

	FormTemplate formTemplate=new FormTemplate();
	public FormTextAreaMapper(FormTemplate formTemplate) {
		// TODO Auto-generated constructor stub
		this.formTemplate=formTemplate;
	}

	public TextArea mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		FormUsers formUsers=new FormUsers();
		TextArea ta=new TextArea();
		ta.setUserId(rs.getString(2));
		//formUsers.setUserId(rs.getString("formUserId"));
		String[] z=new String[formTemplate.getNumberOfTextAreas()];
		int j=0;
		for(int i=3;i<=formTemplate.getNumberOfTextAreas()+2;i++)
		{
			
			z[j]=rs.getString(i);
			j++;
			
			
		}
		//formUsers.setTextAreaValues(z);
		ta.setTextArea(z);
		return ta;
	}

}
