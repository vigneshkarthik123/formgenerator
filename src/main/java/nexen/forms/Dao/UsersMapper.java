package nexen.forms.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UsersMapper implements RowMapper {

	public String mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		String formUserId="";
		formUserId=rs.getString(1);
		return formUserId;
	}

}
