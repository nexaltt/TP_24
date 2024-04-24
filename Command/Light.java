package Command;

public class Light {
    private boolean isOn;
    private int brightness;

    public Light() {
        this.isOn = false;
        this.brightness = 0;
    }

    public void turnOn() {
        isOn = true;
        brightness = 50;
        System.out.println("Lumiere Allumer , Alumer à  " + brightness);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lumiere etteinte");
    }

    public void adjustBrightness(int newBrightness) {
        if (isOn && newBrightness >= 0 && newBrightness <= 100) {
            brightness = newBrightness;
            System.out.println("Lumiere ajuster à " + brightness);
        }
    }

    public boolean isOn() {public class TurnOnLightCommand implements Command {
        private Light light;

        public TurnOnLightCommand(Light light) {
            this.light = light;
        }

        @Override
        public void execute() {
            light.turnOn();
        }

        @Override
        public void undo() {
            light.turnOff();
        }
    }

        return isOn;
    }

    public int getBrightness() {
        return brightness;
    }
}
