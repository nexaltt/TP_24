package Command;

public class AdjustBrightnessCommand implements Command {
    private Light light;
    private int brightness;
    private int previousBrightness;

    public AdjustBrightnessCommand(Light light, int brightness) {
        this.light = light;
        this.brightness = brightness;
        this.previousBrightness = light.getBrightness();
    }

    @Override
    public void execute() {
        light.adjustBrightness(brightness);
    }

    @Override
    public void undo() {
        light.adjustBrightness(previousBrightness);
    }
}

