package App.Infrastructure;

import App.Domain.Constellation;
import App.Domain.Star;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ConstellationRepository extends BaseRepository<Constellation>{
    public ConstellationRepository(JdbcTemplate databaseConnection){
        super(databaseConnection);
    }

    @Override
    public Constellation get(String id) throws Exception {
        return null;
    }

    @Override
    public List<Constellation> get() {
        String sql = "SELECT * FROM csci340.CONSTELLATION;";
        List<Constellation> constellations = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Constellation.class));

        for(Constellation constellation : constellations){
            sql = "SELECT * FROM csci340.STAR WHERE Constellation = '" + constellation.getAbbreviation() + "';";
            List<Star> stars = this.getDatabaseConnection().query(sql, BeanPropertyRowMapper.newInstance(Star.class));
            constellation.setStars(stars);
        }
        return constellations;
    }

    @Override
    public void create(Constellation constellation) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(String id, Constellation constellation) {

    }
}
