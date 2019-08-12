package actions;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import forms.PersonaForm;

public class PersonaAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
    	try {
            PersonaForm personaForm = (PersonaForm) form;
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("sell.system");
            System.out.println("Is opened connection :: "+ factory.createEntityManager().isOpen());
            return mapping.findForward("success");
        } catch (Exception e) {
            e.printStackTrace();
            return mapping.findForward("failure");
        }
    }
}