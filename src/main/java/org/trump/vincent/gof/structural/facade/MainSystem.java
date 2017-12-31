package org.trump.vincent.gof.structural.facade;

import org.trump.vincent.gof.structural.facade.subs.LightSystem;
import org.trump.vincent.gof.structural.facade.subs.MusicSystem;
import org.trump.vincent.gof.structural.facade.subs.PowerSystem;

public class MainSystem {

    private PowerSystem powerSystem;
    private LightSystem lightSystem;
    private MusicSystem musicSystem;

    public MainSystem(PowerSystem powerSystem,LightSystem lightSystem,MusicSystem musicSystem){
        this.powerSystem = powerSystem;
        this.lightSystem = lightSystem;
        this.musicSystem = musicSystem;
    }

    public void sysOn(){
        this.powerSystem.powerOn();
        this.lightSystem.turnUp();
        this.musicSystem.musicStart();
    }

    public void sysOff(){
        this.musicSystem.musicDown();
        this.lightSystem.turnDown();
        this.powerSystem.powerOff();
    }
}
