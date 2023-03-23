
package Ucoltis.demo;

import Ucoltis.demo.newpackage.PersonaDao;
//import com.coltis.HolaMundoSpring.dao.PersonaDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Controlador {

    @Autowired
    private PersonaDao PersonaDao;

    @GetMapping("/")
    public String inicio(Model model) {

        var personas = PersonaDao.findAll();
        model.addAttribute("personas", personas);
        return "index";
    }

}
