package com.example.OCP.designPatterns;

/**
 * Created by guille on 10/17/18.
 */
public interface Fly {

    public default Boolean overAir(int x) {
        return x > 50;
    }

    public int speed();
}

interface BreakSoundBarrier extends Fly {

    public default int speed(int x) {
        return x;
    }

    public int airLevel(int x);

    class Airplane implements BreakSoundBarrier {

        @Override
        public int speed() {
            return 0;
        }


        @Override
        public int airLevel(int x) {
            return 0;
        }
    }

    abstract class AirplanesAbstract implements BreakSoundBarrier {
        //I DONT NEED TO IMPLEMENT METHOS HERE
    }
}
