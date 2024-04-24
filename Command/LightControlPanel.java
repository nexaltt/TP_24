package Command;
import java.util.ArrayList;
import java.util.List;

public class LightControlPanel {
    private List<Light> lights;

    public LightControlPanel() {
        this.lights = new ArrayList<>();
    }

    public void addLight(Light light) {
        lights.add(light);
        System.out.println("Lumiere ajouter au pane");
    }

    public void removeLight(Light light) {
        lights.remove(light);
        System.out.println("Lumiere retirer du panel");
    }

    public List<Light> getLights() {
        return lights;
    }
}
