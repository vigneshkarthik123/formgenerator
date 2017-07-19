
package nexen.forms.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import nexen.forms.domain.FormTemplate;

import org.springframework.jdbc.core.RowMapper;

public class FormMapper implements RowMapper {

	public FormTemplate mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		FormTemplate ft=new FormTemplate();
		ft.setFormId(rs.getInt(1));
		ft.setFormName(rs.getString(2));
		return ft;
	}

}
