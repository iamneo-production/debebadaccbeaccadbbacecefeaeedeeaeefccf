import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ApiController {
    @GetMapping("welcome")
    public String Welcome()
    {
        return "Welcome";
    }
}
