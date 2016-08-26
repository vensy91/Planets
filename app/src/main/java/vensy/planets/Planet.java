package vensy.planets;

/**
 * Created by vensy on 26.08.2016.
 */
public class Planet {
    int pic;
    String name, d, dist;

    public Planet() {}

    public Planet(int pic, String name, String d, String dist) {
        this.pic = pic;
        this.name = name;
        this.d = d;
        this.dist = dist;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiameter() {
        return d;
    }

    public void setDiameter(String d) {
        this.d = d;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }
}
