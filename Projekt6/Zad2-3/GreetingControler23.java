import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
@RestController
public class GreetingControler23 {
    private static final String template2 = "Witam, %s!";
    private static final String template = "Bye, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired // Wstrzykiwanie zależności przez pole
            CountService countService;

    @RequestMapping(path = "/Bye", method = GET) // odpowiada endpoin'tom http
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, countService.count(name)));
    }

    @RequestMapping(path = "/Witam", method = GET) // odpowiada endpoin'tom http
    public Bye bye(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Bye(counter.incrementAndGet(), String.format(template2, countService.count(name)));
    }

    @RequestMapping("/age")
    public Age age(@RequestParam(value = "age", defaultValue = "0") int age) {
        return new Age(counter.incrementAndGet(), age);
    }
}

