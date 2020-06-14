import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
@RestController
public class GreetingControler4 {

    private final AtomicLong counter = new AtomicLong();
    @Autowired // Wstrzykiwanie zależności przez pole
            CountService countService;

    @RequestMapping("/age")
    public AgeName age(@RequestParam(value = "age", defaultValue = "0") int age,
    @RequestParam(value = "name", defaultValue = "World")String name){
        return new AgeName(counter.incrementAndGet(), age, name);
    }
}

