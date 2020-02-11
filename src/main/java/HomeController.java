import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/recipe1")
    public String recipeOne(){
        return "recipeOne";
    }
    @RequestMapping("/recipe2")
    public String recipeTwo(){
        return "recipeTwo";
    }
    @RequestMapping("/recipe3")
    public String recipeThree(){
        return "recipeThree";
    }

}
