package App.Domain;

import java.util.List;

public class Constellation {
    private String abbreviation;
    private String name;
    private String shape;

    private List<Star> stars;

    // Getter and Setter for abbreviation
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for shape
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public List<Star> getStars(){
        return this.stars;
    }

    public void setStars(List<Star> stars){
        this.stars = stars;
    }

    public void addStar(Star star){
        this.stars.add(star);
    }
}
