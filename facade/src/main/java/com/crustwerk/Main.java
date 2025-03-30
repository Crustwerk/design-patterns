package com.crustwerk;

/*
Simply put, a facade encapsulates a complex subsystem behind a simple interface.
It hides much of the complexity and makes the subsystem easy to use.

Also, if we need to use the complex subsystem directly, we still can do that;
we aren’t forced to use the facade all the time.

Besides a much simpler interface, there’s one more benefit of using this design pattern.
It decouples a client implementation from the complex subsystem.
Thanks to this, we can make changes to the existing subsystem and don’t affect a client.
 */

public class Main {
    public static void main(String[] args) {
        CarEngineFacade facade = new CarEngineFacade();
        facade.startEngine();
        // After some time...
        facade.stopEngine();
    }
}