package plugins;

import reflection.IPlugin;

public class Plugin2 implements IPlugin {

    @Override
    public void fazQualQuerCoisa() {
        System.out.println("Sou o plugin 2!");
    }
}