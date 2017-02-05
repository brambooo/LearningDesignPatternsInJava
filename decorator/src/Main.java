public class Main {

    public static void main(String[] args) {

        Character barbarian = new Barbarian();
        System.out.println(barbarian.getCharacterType());

        // Wrap decorator (swordskill) around the barbarian
        barbarian = new SwordSkill(barbarian); // assign swordSkills to barbarian.
        System.out.println(barbarian.getCharacterType());

        // Wrap dagger skill around barbarian
        barbarian = new DaggerSkill(barbarian);
        System.out.println(barbarian.getCharacterType());

        // TODO: opmerking is het alleen de bedoeling dat je bestaande functionaliteit uitbreid met dit patroon?

    }
}
