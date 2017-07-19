package nexen.forms.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import nexen.forms.domain.Form;
import nexen.forms.domain.FormElements;
import nexen.forms.domain.FormElementsValues;
import nexen.forms.domain.FormTemplate;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class FormsJdbcTemplate {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

	public String insertForm(Form form) throws Exception{
		
		
		//*********************************** FORM TEMPLATE INSERTION IN STATIC FORMTEMPLATEGSV TABLE**********************************
		
		
		final FormTemplate formTemplate = form.getFormTemplate();
		FormElements formElements = form.getFormElements();

		String formInsertQuery = "insert into formTemplateGSV values("
				+ formTemplate.getFormId() + ",'" + formTemplate.getUserId()
				+ "','" + formTemplate.getFormName() + "',"
				+ formTemplate.getNumberOfTextBoxes() + ","
				+ formTemplate.getNumberOfTextAreas() + ","
				+ formTemplate.getNumberOfCheckBoxes() + ","
				+ formTemplate.getNumberOfRadioButtons() + ","
				+ formTemplate.getNumberOfDropDowns() + ","
				+ formTemplate.getNumberOfDates() + ","
				+ formTemplate.getNumberOfSubmits() + ","
				+ formTemplate.getNumberOfResets() + ",sysdate)";
		jdbcTemplate.update(formInsertQuery);
		String formUsersIdQuery="create table formusers_"+formTemplate.getFormId()+"(formuserid varchar(300))";
		jdbcTemplate.update(formUsersIdQuery);
		
	
		
		
		
		
		
		
		//*****************************************DYNAMIC TABLE CREATION OF FORM FIELDS*********************************
		
		
		
		
		try{
	if(!formElements.getTextBoxes().equals(null))
		{
		final String[] textBoxes = formElements.getTextBoxes();
		

			String textBoxesCreateQuery = "create table textBox_"
					+ formTemplate.getFormId() + "(formId int,formUserId varchar(100))";
			jdbcTemplate.update(textBoxesCreateQuery);
			for (int i = 0; i < textBoxes.length; i++) {
				String z=textBoxes[i];
				char[] a=z.toCharArray();
				for(int k=0;k<a.length;k++)
				{
					if(a[k]==' ')
					{
						a[k]='_';
					}
				}
				String textBoxesQuery = "alter table textBox_"
						+ formTemplate.getFormId() + " add " + String.valueOf(a)
						+ " varchar(300)";
				jdbcTemplate.update(textBoxesQuery);
			}

		}
}
	catch(Exception e)
		{
		if(e instanceof SQLException)
		{
		throw e;
		}
	}
		
		try{
		
		if(!formElements.getTextAreas().equals(null))
		{
		final String[] textAreas = formElements.getTextAreas();
	
			String textAreasCreateQuery = "create table textArea_"
					+ formTemplate.getFormId() + "(formId int,formUserId varchar(100))";
			jdbcTemplate.update(textAreasCreateQuery);
			for (int i = 0; i < textAreas.length; i++) {
				String z=textAreas[i];
				char[] a=z.toCharArray();
				for(int k=0;k<a.length;k++)
				{
					if(a[k]==' ')
					{
						a[k]='_';
					}
				}
				String textAreasQuery = "alter table textArea_"
						+ formTemplate.getFormId() + " add " + String.valueOf(a)
						+ " varchar(300)";
				jdbcTemplate.update(textAreasQuery);
			}

		}
		}
		catch(Exception e)
		{
			if(e instanceof SQLException)
			{
			throw e;
			}
	}
		
		
		try{
		if(!formElements.getCheckBoxes().equals(null))
		{
		final String[] checkBoxes = formElements.getCheckBoxes();
		

			String checkBoxesCreateQuery = "create table checkBox_"
					+ formTemplate.getFormId() + "(formId int,formUserId varchar(100))";
			jdbcTemplate.update(checkBoxesCreateQuery);
			for (int i = 0; i < checkBoxes.length; i++) {
				String z=checkBoxes[i];
				char[] a=z.toCharArray();
				for(int k=0;k<a.length;k++)
				{
					if(a[k]==' ')
					{
						a[k]='_';
					}
				}
				String checkBoxesQuery = "alter table checkBox_"
						+ formTemplate.getFormId() + " add " + String.valueOf(a)
						+ " varchar(300)";
				jdbcTemplate.update(checkBoxesQuery);
			}

		}
		}
		catch(Exception e)
		{
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		try{
		if(!formElements.getRadioButtons().equals(null))
		{
		final String[] radioButtons = formElements.getRadioButtons();
		

			String radioButtonsCreateQuery = "create table radioButton_"
					+ formTemplate.getFormId() + "(formId int,formUserId varchar(100))";
			jdbcTemplate.update(radioButtonsCreateQuery);
			for (int i = 0; i < radioButtons.length; i++) {
				String z=radioButtons[i];
				char[] a=z.toCharArray();
				for(int k=0;k<a.length;k++)
				{
					if(a[k]==' ')
					{
						a[k]='_';
					}
				}
				String radioButtonsQuery = "alter table checkBox_"
						+ formTemplate.getFormId() + " add " + String.valueOf(a)
						+ " varchar(300)";
				jdbcTemplate.update(radioButtonsQuery);
			}

		}
		}
		catch(Exception e)
		{
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		try{
		if(!formElements.getDropDowns().equals(null))
		{
		final String[] dropDowns = formElements.getDropDowns();
		

			String dropDownsCreateQuery = "create table dropDown_"
					+ formTemplate.getFormId() + "(formId int,formUserId varchar(100))";
			jdbcTemplate.update(dropDownsCreateQuery);
			for (int i = 0; i < dropDowns.length; i++) {
				String z=dropDowns[i];
				char[] a=z.toCharArray();
				for(int k=0;k<a.length;k++)
				{
					if(a[k]==' ')
					{
						a[k]='_';
					}
				}
				String dropDownsQuery = "alter table dropDown_"
						+ formTemplate.getFormId() + " add " + String.valueOf(a)
						+ " varchar(300)";
				jdbcTemplate.update(dropDownsQuery);
			}

		}
		}
		catch(Exception e)
		{
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		try
		{
		if(!formElements.getDates().equals(null))
		{
		final String[] dates = formElements.getDates();
		

			String datesCreateQuery = "create table date_"
					+ formTemplate.getFormId() + "(formId int,formUserId varchar(100))";
			jdbcTemplate.update(datesCreateQuery);
			for (int i = 0; i < dates.length; i++) {
				String z=dates[i];
				char[] a=z.toCharArray();
				for(int k=0;k<a.length;k++)
				{
					if(a[k]==' ')
					{
						a[k]='_';
					}
				}
				String datesQuery = "alter table date_"
						+ formTemplate.getFormId() + " add " + String.valueOf(a)
						+ " varchar(300)";
				jdbcTemplate.update(datesQuery);
			}

		}
		}
		catch(Exception e)
		{
			if(e instanceof SQLException)
			{
			throw e;
			}
			
		}
		
		
		try{
		if(!formElements.getSubmits().equals(null))
		{
		final String[] submits = formElements.getSubmits();
		

			String submitsCreateQuery = "create table submit_"
					+ formTemplate.getFormId() + "(formId int,formUserId varchar(100))";
			jdbcTemplate.update(submitsCreateQuery);
			for (int i = 0; i < submits.length; i++) {
				String z=submits[i];
				char[] a=z.toCharArray();
				for(int k=0;k<a.length;k++)
				{
					if(a[k]==' ')
					{
						a[k]='_';
					}
				}
				String submitsQuery = "alter table submit_"
						+ formTemplate.getFormId() + " add " + String.valueOf(a)
						+ " varchar(300)";
				jdbcTemplate.update(submitsQuery);
			}

		}
		}
		catch(Exception e)
		{
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		
		try
		{
		if(!formElements.getResets().equals(null))
		{
		final String[] resets = formElements.getResets();
	

			String resetsCreateQuery = "create table reset_"
					+ formTemplate.getFormId() + "(formId int,formUserId varchar(100))";
			jdbcTemplate.update(resetsCreateQuery);
			for (int i = 0; i < resets.length; i++) {
				String z=resets[i];
				char[] a=z.toCharArray();
				for(int k=0;k<a.length;k++)
				{
					if(a[k]==' ')
					{
						a[k]='_';
					}
				}
				String resetsQuery = "alter table reset_"
						+ formTemplate.getFormId() + " add " + String.valueOf(a)
						+ " varchar(300)";
				jdbcTemplate.update(resetsQuery);
			}

		}
		}
		catch(Exception e)
		{
			if(e instanceof SQLException)
			{
			throw e;
			}
			
		}

		return "inserted";

	}

	
	//***********************************DYNAMIC INSERTION OF FORM FIELDS FILLED BY USERS***********************************************************
	
	
	public String insertFormDetails(final Form form) throws Exception {
		
		FormElements formElements=form.getFormElements();
		FormElementsValues formElementsValues=form.getFormElementsValues();
		String insertUserId="insert into formusers_"+formElements.getFormId()+" values('"+formElementsValues.getFormUserId()+"')";
		jdbcTemplate.update(insertUserId);
		
				try{
					String[] textBoxes=formElements.getTextBoxes();
					String[] textBoxesValues=formElementsValues.getTextBoxesValues();
					String textBoxInsertQuery="insert into textBox_"+formElements.getFormId()+"(formid,formUserId) values("+formElements.getFormId()+",'"+formElementsValues.getFormUserId()+"')";
					jdbcTemplate.update(textBoxInsertQuery);
					for(int i=0;i<textBoxes.length;i++)
					{
						String z=textBoxes[i];
						char[] a=z.toCharArray();
						for(int k=0;k<a.length;k++)
						{
							if(a[k]==' ')
							{
								a[k]='_';
							}
						}
						String textBoxValueInsertQuery="update textBox_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+textBoxesValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
						jdbcTemplate.update(textBoxValueInsertQuery);
					}
					
				}
			catch(Exception e)
				{
				if(e instanceof SQLException)
				{
				throw e;
				}
				}
				
				
	try{
		
		
		String[] textAreas=formElements.getTextAreas();
		String[] textAreasValues=formElementsValues.getTextAreasValues();
		String textAreaInsertQuery="insert into textArea_"+formElements.getFormId()+"(formid,formUserId) values("+formElements.getFormId()+",'"+formElementsValues.getFormUserId()+"')";
		jdbcTemplate.update(textAreaInsertQuery);
		for(int i=0;i<textAreas.length;i++)
		{
			String z=textAreas[i];
			char[] a=z.toCharArray();
			for(int k=0;k<a.length;k++)
			{
				if(a[k]==' ')
				{
					a[k]='_';
				}
			}
			String textAreaValueInsertQuery="update textArea_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+textAreasValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
			jdbcTemplate.update(textAreaValueInsertQuery);
		}
					
				}
			catch(Exception e)
				{
				if(e instanceof SQLException)
				{
				throw e;
				}
				}
	
	
	
	
	try{
		
		
		String[] checkBoxes=formElements.getCheckBoxes();
		String[] checkBoxesValues=formElementsValues.getCheckBoxesValues();
		String checkBoxInsertQuery="insert into checkBox_"+formElements.getFormId()+"(formid,formUserId) values("+formElements.getFormId()+",'"+formElementsValues.getFormUserId()+"')";
		jdbcTemplate.update(checkBoxInsertQuery);
		for(int i=0;i<checkBoxes.length;i++)
		{
			String z=checkBoxes[i];
			char[] a=z.toCharArray();
			for(int k=0;k<a.length;k++)
			{
				if(a[k]==' ')
				{
					a[k]='_';
				}
			}
			String checkBoxValueInsertQuery="update checkBox_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+checkBoxesValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
			jdbcTemplate.update(checkBoxValueInsertQuery);
		}
		
	}
catch(Exception e)
	{
	
	if(e instanceof SQLException)
	{
	throw e;
	}
	}
	
	
	try{
		
		String[] radioButtons=formElements.getRadioButtons();
		String[] radioButtonsValues=formElementsValues.getRadioButtonsValues();
		String radioButtonsInsertQuery="insert into radioButton_"+formElements.getFormId()+"(formid,formUserId) values("+formElements.getFormId()+",'"+formElementsValues.getFormUserId()+"')";
		jdbcTemplate.update(radioButtonsInsertQuery);
		for(int i=0;i<radioButtons.length;i++)
		{
			String z=radioButtons[i];
			char[] a=z.toCharArray();
			for(int k=0;k<a.length;k++)
			{
				if(a[k]==' ')
				{
					a[k]='_';
				}
			}
			String radioButtonsValueInsertQuery="update textBox_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+radioButtonsValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
			jdbcTemplate.update(radioButtonsValueInsertQuery);
		}
		
	}
catch(Exception e)
	{
	if(e instanceof SQLException)
	{
	throw e;
	}
	}
	
	
	try{
		
		
		String[] dropDowns=formElements.getDropDowns();
		String[] dropDownsValues=formElementsValues.getDropDownsValues();
		String dropDownsInsertQuery="insert into dropDown_"+formElements.getFormId()+"(formid,formUserId) values("+formElements.getFormId()+",'"+formElementsValues.getFormUserId()+"')";
		jdbcTemplate.update(dropDownsInsertQuery);
		for(int i=0;i<dropDowns.length;i++)
		{
			String z=dropDowns[i];
			char[] a=z.toCharArray();
			for(int k=0;k<a.length;k++)
			{
				if(a[k]==' ')
				{
					a[k]='_';
				}
			}
			String dropDownsValueInsertQuery="update dropDown_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+dropDownsValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
			jdbcTemplate.update(dropDownsValueInsertQuery);
		}
		
	}
catch(Exception e)
	{
	if(e instanceof SQLException)
	{
	throw e;
	}
	
	}
	
	
	try{
		
		
		String[] dates=formElements.getDates();
		String[] datesValues=formElementsValues.getDatesValues();
		String datesInsertQuery="insert into date_"+formElements.getFormId()+"(formid,formUserId) values("+formElements.getFormId()+",'"+formElementsValues.getFormUserId()+"')";
		jdbcTemplate.update(datesInsertQuery);
		for(int i=0;i<dates.length;i++)
		{
			String z=dates[i];
			char[] a=z.toCharArray();
			for(int k=0;k<a.length;k++)
			{
				if(a[k]==' ')
				{
					a[k]='_';
				}
			}
			String datesValueInsertQuery="update date_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+datesValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
			jdbcTemplate.update(datesValueInsertQuery);
		}
		
	}
catch(Exception e)
	{
	if(e instanceof SQLException)
	{
	throw e;
	}
	
	}
	
	
	
	/*try{
		
		String[] submits=formElements.getSubmits();
		String[] submitsValues=formElementsValues.getSubmitsValues();
		String submitsInsertQuery="insert into submit_"+formElements.getFormId()+"(formid,formUserId) values("+formElements.getFormId()+",'"+formElementsValues.getFormUserId()+"')";
		jdbcTemplate.update(submitsInsertQuery);
		for(int i=0;i<submits.length;i++)
		{
			String submitsValueInsertQuery="update submit_"+formElements.getFormId()+" set "+submits[i]+"='"+submitsValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
			jdbcTemplate.update(submitsValueInsertQuery);
		}
		
	}
catch(Exception e)
	{
	
	}
try{
		
		String[] resets=formElements.getResets();
		String[] resetsValues=formElementsValues.getResetsValues();
		String resetsInsertQuery="insert into reset_"+formElements.getFormId()+"(formid,formUserId) values("+formElements.getFormId()+",'"+formElementsValues.getFormUserId()+"')";
		jdbcTemplate.update(resetsInsertQuery);
		for(int i=0;i<resets.length;i++)
		{
			String resetsValueInsertQuery="update reset_"+formElements.getFormId()+" set "+resets[i]+"='"+resetsValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
			jdbcTemplate.update(resetsValueInsertQuery);
		}
		
		
	}
catch(Exception e)
	{
	
	}*/

		return "details inserted";
	}
	
	
	
	
	
	//************************FORM DETAIL RETRIEVAL BASED ON FORM ID************************************
	
	
	public List getDetails(int formId) throws Exception
	{
		
	List Response =new ArrayList();
		
		FormTemplate formTemplate;
		try {
			String sql2="select * from formTemplateGSV where formid=?";
			formTemplate = jdbcTemplate.queryForObject(sql2,new Object[]{formId},new FormTemplateMapper());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		
			throw e;
		}
		
		
		List textBoxesValues=null;
		try {
			if(formTemplate.getNumberOfTextBoxes()>=1)
			{
				String sql1="select * from textBox_"+formTemplate.getFormId()+"";
				textBoxesValues=jdbcTemplate.query(sql1,new FormTextBoxMapper(formTemplate)); 
				Response.add(textBoxesValues);
				 
			}
		} catch (Exception e) {
			
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		List textAreasValues=null;
		try {
			if(formTemplate.getNumberOfTextAreas()>=1)
			{
				String sql1="select * from textArea_"+formTemplate.getFormId()+"";
				textAreasValues=jdbcTemplate.query(sql1,new FormTextAreaMapper(formTemplate)); 
				Response.add(textAreasValues);
				
				 
			}
		} catch (Exception e) {
			
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		List checkBoxValues=null;
		try {
			if(formTemplate.getNumberOfCheckBoxes()>=1)
			{
				String sql1="select * from checkBox_"+formTemplate.getFormId()+"";
				checkBoxValues=jdbcTemplate.query(sql1,new FormCheckBoxMapper(formTemplate));
				Response.add(checkBoxValues);
				 
			}
		} catch (Exception e) {
			
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		List radioButtonsValues=null;
		try {
			if(formTemplate.getNumberOfRadioButtons()>=1)
			{
				String sql1="select * from radioButton_"+formTemplate.getFormId()+"";
				radioButtonsValues=jdbcTemplate.query(sql1,new FormRadioButtonMapper(formTemplate)); 
				Response.add(radioButtonsValues);
				 
			}
		} catch (Exception e) {
			
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		List dropDownsValues=null;
		try {
			if(formTemplate.getNumberOfDropDowns()>=1)
			{
				String sql1="select * from dropDown_"+formTemplate.getFormId()+"";
				dropDownsValues=jdbcTemplate.query(sql1,new FormDropDownMapper(formTemplate)); 
				Response.add(dropDownsValues);
				 
			}
		} catch (Exception e) {
		
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		List datesValues=null;
		try {
			if(formTemplate.getNumberOfDates()>=1)
			{
				String sql1="select * from date_"+formTemplate.getFormId()+"";
				datesValues=jdbcTemplate.query(sql1,new FormDatesMapper(formTemplate)); 
				Response.add(datesValues);
				 
			}
		} catch (Exception e) {
			
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		
		
		
		
		
		return Response;
	}

	public String updateFormDetails(String formUserId,Form form) throws Exception{
		FormElements formElements=form.getFormElements();
		FormElementsValues formElementsValues=form.getFormElementsValues();
		String checkQuery="select * from formusers_"+formElements.getFormId()+" where formuserid='"+formUserId+"'";
		String formUserId1=jdbcTemplate.queryForObject(checkQuery,new UsersMapper());
		try
		{
		if(formUserId1.equals(formUserId))
		{
			try{
				String[] textBoxes=formElements.getTextBoxes();
				String[] textBoxesValues=formElementsValues.getTextBoxesValues();
				for(int i=0;i<textBoxes.length;i++)
				{
					String z=textBoxes[i];
					char[] a=z.toCharArray();
					for(int k=0;k<a.length;k++)
					{
						if(a[k]==' ')
						{
							a[k]='_';
						}
					}
					String textBoxValueInsertQuery="update textBox_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+textBoxesValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
					jdbcTemplate.update(textBoxValueInsertQuery);
				}
				
			}
		catch(Exception e)
			{
			if(e instanceof SQLException)
			{
			throw e;
			}
			}
			
			
try{
	
	
	String[] textAreas=formElements.getTextAreas();
	String[] textAreasValues=formElementsValues.getTextAreasValues();
	for(int i=0;i<textAreas.length;i++)
	{
		String z=textAreas[i];
		char[] a=z.toCharArray();
		for(int k=0;k<a.length;k++)
		{
			if(a[k]==' ')
			{
				a[k]='_';
			}
		}
		String textAreaValueInsertQuery="update textArea_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+textAreasValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
		jdbcTemplate.update(textAreaValueInsertQuery);
	}
				
			}
		catch(Exception e)
			{
			if(e instanceof SQLException)
			{
			throw e;
			}
			}




try{
	
	
	String[] checkBoxes=formElements.getCheckBoxes();
	String[] checkBoxesValues=formElementsValues.getCheckBoxesValues();
	for(int i=0;i<checkBoxes.length;i++)
	{
		String z=checkBoxes[i];
		char[] a=z.toCharArray();
		for(int k=0;k<a.length;k++)
		{
			if(a[k]==' ')
			{
				a[k]='_';
			}
		}
		String checkBoxValueInsertQuery="update checkBox_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+checkBoxesValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
		jdbcTemplate.update(checkBoxValueInsertQuery);
	}
	
}
catch(Exception e)
{

if(e instanceof SQLException)
{
throw e;
}
}


try{
	
	String[] radioButtons=formElements.getRadioButtons();
	String[] radioButtonsValues=formElementsValues.getRadioButtonsValues();
	for(int i=0;i<radioButtons.length;i++)
	{
		String z=radioButtons[i];
		char[] a=z.toCharArray();
		for(int k=0;k<a.length;k++)
		{
			if(a[k]==' ')
			{
				a[k]='_';
			}
		}
		String radioButtonsValueInsertQuery="update textBox_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+radioButtonsValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
		jdbcTemplate.update(radioButtonsValueInsertQuery);
	}
	
}
catch(Exception e)
{
if(e instanceof SQLException)
{
throw e;
}
}


try{
	
	
	String[] dropDowns=formElements.getDropDowns();
	String[] dropDownsValues=formElementsValues.getDropDownsValues();
	for(int i=0;i<dropDowns.length;i++)
	{
		String z=dropDowns[i];
		char[] a=z.toCharArray();
		for(int k=0;k<a.length;k++)
		{
			if(a[k]==' ')
			{
				a[k]='_';
			}
		}
		String dropDownsValueInsertQuery="update dropDown_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+dropDownsValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
		jdbcTemplate.update(dropDownsValueInsertQuery);
	}
	
}
catch(Exception e)
{
if(e instanceof SQLException)
{
throw e;
}

}


try{
	
	
	String[] dates=formElements.getDates();
	String[] datesValues=formElementsValues.getDatesValues();
	for(int i=0;i<dates.length;i++)
	{
		String z=dates[i];
		char[] a=z.toCharArray();
		for(int k=0;k<a.length;k++)
		{
			if(a[k]==' ')
			{
				a[k]='_';
			}
		}
		String datesValueInsertQuery="update date_"+formElements.getFormId()+" set "+String.valueOf(a)+"='"+datesValues[i]+"' where formUserId='"+formElementsValues.getFormUserId()+"'";
		jdbcTemplate.update(datesValueInsertQuery);
	}
	
}
catch(Exception e)
{
if(e instanceof SQLException)
{
throw e;
}

}
			
			
			
			
			
			
			
			
			
		}
		}
		catch(Exception e)
		{
			throw e;
		}
		
		// TODO Auto-generated method stub
		return "Update Success!";
	}

	
	
	
	
	
	public String deleteForm(int formId) throws Exception {
		
		FormTemplate formTemplate=new FormTemplate();
		try {
			String sql2="select * from formTemplateGSV where formid=?";
			formTemplate = jdbcTemplate.queryForObject(sql2,new Object[]{formId},new FormTemplateMapper());
			String sql="delete from formtemplategsv where formid="+formId+"";
			jdbcTemplate.update(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		
			throw e;
		}
		
		
		
		try {
			if(formTemplate.getNumberOfTextBoxes()>=1)
			{
				String sql1="drop table textBox_"+formTemplate.getFormId()+"";
				jdbcTemplate.update(sql1); 
				
				 
			}
		} catch (Exception e) {
			
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		
		try {
			if(formTemplate.getNumberOfTextAreas()>=1)
			{
				String sql1="drop table textArea_"+formTemplate.getFormId()+"";
				jdbcTemplate.update(sql1);
				
				 
			}
		} catch (Exception e) {
			
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		
		try {
			if(formTemplate.getNumberOfCheckBoxes()>=1)
			{
				String sql1="drop table checkBox_"+formTemplate.getFormId()+"";
				jdbcTemplate.update(sql1);
				 
			}
		} catch (Exception e) {
			
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		
		try {
			if(formTemplate.getNumberOfRadioButtons()>=1)
			{
				String sql1="drop table radioButton_"+formTemplate.getFormId()+"";
				jdbcTemplate.update(sql1);
				 
			}
		} catch (Exception e) {
			
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		
		try {
			if(formTemplate.getNumberOfDropDowns()>=1)
			{
				String sql1="drop table dropDown_"+formTemplate.getFormId()+"";
				jdbcTemplate.update(sql1);
				 
			}
		} catch (Exception e) {
		
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		
		try {
			if(formTemplate.getNumberOfDates()>=1)
			{
				String sql1="drop table date_"+formTemplate.getFormId()+"";
				jdbcTemplate.update(sql1);
				 
			}
		} catch (Exception e) {
			
			if(e instanceof SQLException)
			{
			throw e;
			}
		}
		
		
		
		
		
		return "deleted";
	}

	
	
	
	
	
}
