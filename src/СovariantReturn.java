public class СovariantReturn {

    public static void main(String[] args) {

        Melnica melnica = new Melnica();
        Zerno zerno = melnica.processed();
        System.out.println(zerno);

        melnica = new VetrinayaMelnica();
        zerno = melnica.processed();
        System.out.println(zerno);

    }
}

class Zerno {
    @Override
    public String toString() {
        return "Zerno";
    }
}

class Phenica extends Zerno {
    @Override
    public String toString() {
        return "Phenica";
    }
}

class Melnica {
    Zerno processed() {
        return new Zerno();
    }
}

class VetrinayaMelnica extends Melnica {
    @Override
    Phenica processed() {
        return new Phenica();
    }
}