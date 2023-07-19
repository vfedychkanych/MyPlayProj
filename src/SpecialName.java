import java.util.Random;

public enum SpecialName {
    Dwarf,
    Elf,
    Man,
    Dragonborn,
    Orc,
    Gnome;

    private static final Random PRNG = new Random();

    public static SpecialName randomSpecial()  {
        SpecialName[] specialNames = values();
        return specialNames[PRNG.nextInt(specialNames.length)];
    }
}
