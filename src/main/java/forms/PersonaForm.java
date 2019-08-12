package forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class PersonaForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (nombre == null || nombre.length() < 1) {
            errors.add("nombre", new ActionMessage("error.nombre.required"));
        }
        if (apellido == null || apellido.length() < 1) {
            errors.add("apellido", new ActionMessage("error.apellido.required"));
        }
        return errors;
    }
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}