// Factory Pattern
interface Stand {
    void describeAbility();
}

class GoldenWind implements Stand {
    @Override
    public void describeAbility() {
        System.out.println("Requiem ability that can manipulate time!");
    }
}
class SilverChariot implements Stand {
    @Override
    public void describeAbility() {
        System.out.println("High speed and precision sword attacks!");
    }
}
class TheWorld implements Stand {
    @Override
    public void describeAbility() {
        System.out.println("Can stop the time!");
    }
}

interface StandFactory {
    Stand createStand();
}

class GoldenWindFactory implements StandFactory {
    @Override
    public Stand createStand() {
        return new GoldenWind();
    }
}

class SilverChariotFactory implements StandFactory {
    @Override
    public Stand createStand() {
        return new SilverChariot();
    }
}

class TheWorldFactory implements StandFactory {
    @Override
    public Stand createStand() {
        return new TheWorld();
    }
}
