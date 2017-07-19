package nexen.forms.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import nexen.forms.domain.FormTemplate;
import nexen.forms.domain.FormUsers;
import nexen.forms.domain.TextBox;

import org.springframework.jdbc.core.RowMapper;

public class FormTextBoxMapper implements RowMapper {
FormTemplate formTemplate;
	public FormTextBoxMapper(FormTemplate formTemplate) {
		// TODO Auto-generated constructor stub
		this.formTemplate=formTemplate;
	}

	public TextBox mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		FormUsers formUsers=new FormUsers();
		TextBox tb=new TextBox();
		tb.setUserId(rs.getString(2));
		String[] z=new String[formTemplate.getNumberOfTextBoxes()];
		int j=0;
		for(int i=3;i<=formTemplate.getNumberOfTextBoxes()+2;i++)
		{
			
			z[j]=rs.getString(i);
			j++;
			
			
		}
		
		tb.setTextBox(z);
		return tb;
	}

}
