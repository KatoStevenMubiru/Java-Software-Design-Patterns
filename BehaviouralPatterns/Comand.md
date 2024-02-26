# Command Pattern Example in Java

This document explains the Command pattern example implemented in Java. The Command pattern is a behavioral design pattern that encapsulates a request as an object, allowing for parameterization of clients with different requests, queuing, logging of requests, and support for undoable operations.

## Command Interface

The `Command` interface declares a method `execute()` that is the contract for all concrete command classes. This method will be called to execute the command's action.

```java
public interface Command {
    void execute();
}
```
# Receiver Class

The Light class acts as the Receiver. It contains the actual logic to perform actions, such as turning the light on and off.
```java
class Light {
    public void turnOn() {
        System.out.println("The light is on.");
    }

    public void turnOff() {
        System.out.println("The light is off.");
    }
}
```
# ConcreteCommand Classes

LightOnCommand and LightOffCommand are concrete implementations of the Command interface. They encapsulate a request to the Light object.
``` java
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
```
# Invoker Class

The Switch class acts as the Invoker. It holds two commands: one to turn the light on and another to turn it off. It provides methods flipUp() and flipDown() that execute these commands.
``` java
class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCommand, Command flipDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }

    public void flipUp() {
        flipUpCommand.execute();
    }

    public void flipDown() {
        flipDownCommand.execute();
    }
}
```
# Client Class

The CommandPatternDemo class acts as the Client. It creates an instance of the Light, instances of LightOnCommand and LightOffCommand, and an instance of Switch. It then calls flipUp() and flipDown() on the Switch to turn the light on and off.

``` java
public class CommandPatternDemo {
    public static void main(String[] args) {
        Light light = new Light(); // the receiver

        Command switchUp = new LightOnCommand(light);
        Command switchDown = new LightOffCommand(light);

        Switch mySwitch = new Switch(switchUp, switchDown);

        mySwitch.flipUp();   // The light is on.
        mySwitch.flipDown(); // The light is off.
    }
}
```
