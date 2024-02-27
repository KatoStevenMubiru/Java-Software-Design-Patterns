package BEHAVIOURALPATTERNS.Command;

public class CommandPatternDemo{
    public static void main(String[] args){
        Light light = new Light();

        Command switchUp = new LightOnCommand(light);
        Command switchDown = new LightOffCommand(light);

        Switch mySwitch = new Switch(switchUp, switchDown);

        mySwitch.flipUp();;
        mySwitch.flipDown();
    }
}