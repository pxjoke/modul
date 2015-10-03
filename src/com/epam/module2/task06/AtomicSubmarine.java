package com.epam.module2.task06;

/**
 * Created by pxjok on 02.10.2015.
 */
@SubmarineInfo(
        author = "pxjoke"
)
public class AtomicSubmarine {
    private Engine engine;
    private String name;

    public AtomicSubmarine(String name) {
        this.name = name;
        this.engine = new Engine();
    }

    class Engine{
        private boolean launched = false;
        public void launch(){
           launched = true;
        }

        public void stop(){
            launched = false;
        }

        public boolean isLaunched() {
            return launched;
        }
    }

    public String getStatus(){
        return engine.isLaunched() ? "Engine launched!" : "Engine stopped!";
    }

    public String getName() {
        return name;
    }

    public void launch(){
        engine.launch();
    }

    public void stop(){
        engine.stop();
    }

    @Override
    public String toString() {
        return "Submarine " + name + ". Status: " + getStatus();
    }
}
