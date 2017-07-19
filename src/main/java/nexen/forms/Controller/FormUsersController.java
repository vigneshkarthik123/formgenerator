package nexen.forms.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import nexen.forms.Dao.FormsJdbcTemplate;
import nexen.forms.domain.Form;
import nexen.forms.domain.FormResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormUsersController {
	@Autowired
	FormsJdbcTemplate formsJdbcTemplate;
	
	
	
	@ApiOperation(value = "insertion of form details by users", notes = "More notes about this method", response = FormResponse.class)
	@ApiParam(name = "formObject", value = "Contains form elements and values of elements", required = true)
	@ResponseStatus(value = HttpStatus.CREATED)
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "successfull insertion of form details", response = FormResponse.class),
			@ApiResponse(code = 404, message = "form data insertion  failed", response = FormResponse.class),
			@ApiResponse(code = 400, message = "bad request for form insertion", response = FormResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = FormResponse.class) })
	
	@RequestMapping(value="/formusers",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public String insertFormDetails(@RequestBody Form form)
	{
		String reply="";
		try {
			reply = formsJdbcTemplate.insertFormDetails(form);
			return reply;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reply=e.getMessage();
			return reply;
		}
		
	}
	
	@ApiOperation(value = "edit an already filled form", notes = "More notes about this method", response = FormResponse.class)
	@ApiParam(name = "formObject", value = "Contains form elements and values of elements", required = true)
	@ResponseStatus(value = HttpStatus.CREATED)
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "successfull insertion of form details", response = FormResponse.class),
			@ApiResponse(code = 404, message = "form data insertion  failed", response = FormResponse.class),
			@ApiResponse(code = 400, message = "bad request for form insertion", response = FormResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = FormResponse.class) })
	
	@RequestMapping(value="/formusers/{formUserId}",method=RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public String updateFormDetails(@PathVariable("formUserId") String formUserId,@RequestBody Form form)
	{
		
		String reply="";
		try {
			reply = formsJdbcTemplate.updateFormDetails(formUserId,form);
			return reply;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reply=e.getMessage();
			return reply;
		}
		
	}

}
