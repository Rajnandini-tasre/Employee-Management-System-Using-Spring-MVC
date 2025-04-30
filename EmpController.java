package abc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class EmpController {
	@Autowired
	EmpDao dao;
	@RequestMapping("/emp")
	public String showform(org.springframework.ui.Model m) {
		m.addAttribute("command",new Emp());
		return "empform";
	}
@RequestMapping(value="/save",method=RequestMethod.POST)
public String save(@ModelAttribute("emp") Emp emp) {
	dao.save(emp);

	return "redirect:/viewemp";
	
}
	@RequestMapping("/viewemp")
	public String viewemp(Model m) {
		List<Emp> list= dao.getEmployee();
		m.addAttribute("list", list);
		return "viewemp";
	}
	@RequestMapping(value="/editempform/{id}")
	public String edit(@PathVariable int id, Model m) {
	    Emp emp = dao.getEmpById(id);        // Get employee object by ID
	    m.addAttribute("emp", emp);          // Attribute name must be "emp"
	    return "empeditform";                // This must match your JSP name (empeditform.jsp)
	}
	
	@RequestMapping(value="/editsave", method=RequestMethod.POST)
	public String editsave(@ModelAttribute("emp") Emp p) {
	   
	    dao.update(p);
	    return "redirect:/viewemp";
	}
	@RequestMapping(value="/deleteemp/{id}", method=RequestMethod.GET)
	public String delete(@PathVariable int id) {
		dao.delete(id);
		return "redirect:/viewemp";
	}
	
}
