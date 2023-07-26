public class Species {
    private SpecialName specialName;
    private String nameOfBoost;

    public Species() {
    }

    public Species(SpecialName specialName, String nameOfBoost) {
        this.specialName = specialName;
        this.nameOfBoost = nameOfBoost;
    }

    public Species createSpeciesForHero() {
        StringBuilder stringBuilder = new StringBuilder("");
        SpecialName specialName = SpecialName.randomSpecial();
        switch (specialName) {
            case Elf -> {
                stringBuilder.append("Збільшений урон з легкої зброї");
            }
            case Man -> {
                stringBuilder.append("Немає ніяких унікальних навичок");
            }
            case Orc -> {
                stringBuilder.append("Збільшений урон з важкої зброї");
            }
            case Dwarf -> {
                stringBuilder.append("Збільшений шанс CriticalHit");
            }
            case Gnome -> {
                stringBuilder.append("Збільшений відсоток захисту");
            }
            case Dragonborn -> {
                stringBuilder.append("Якщо спрацював CriticalHit, то може зробити хід знову");
            }
        }
        return new Species(specialName, stringBuilder.toString());
    }

    public SpecialName getSpecialName() {
        return specialName;
    }

    public String getNameOfBoost() {
        return nameOfBoost;
    }

    @Override
    public String toString() {
        return "{ " + specialName  +
                ", Boost: '" + nameOfBoost + '\'' +
                '}';
    }
}
