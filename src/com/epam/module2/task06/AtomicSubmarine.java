package com.epam.module2.task06;

/**
 * Created by pxjoke on 02.10.2015.
 */
@SubmarineInfo(
        author = "pxjoke",
        description = "This class describe Submarine with RZ-12Core engine."
)
public class AtomicSubmarine {
    private Engine engine;
    private String name;

    public AtomicSubmarine(String name) {
        this.name = name;
        this.engine = new Engine();
    }

    class Engine {
        public boolean launched = false;
        private final String engineSerialName = "RZ-12Core";

        public String getEngineSerialName() {
            return engineSerialName;
        }
    }

    public String getName() {
        return name;
    }

    public void launch() {
        engine.launched = true;
    }

    public void stop() {
        engine.launched = false;
    }

    public String getStatus() {
        return engine.launched ? "Engine launched!" : "Engine stopped!";
    }

    @Override
    public String toString() {
        return "Submarine " + name + ". Status: " + getStatus() + " Engine Serial: " +
                engine.getEngineSerialName();
    }
}
