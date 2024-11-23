package App.Application.Controllers;

import App.Domain.Constellation;
import App.Infrastructure.ConstellationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/Constellation")
public class ConstellationController {

    private final ConstellationRepository constellationRepository;

    public ConstellationController(@Autowired JdbcTemplate databaseConnection){
        this.constellationRepository = new ConstellationRepository(databaseConnection);
    }
    @GetMapping("")
    public List<Constellation> getAllConstellations(){
        return this.constellationRepository.get();
    }
}
