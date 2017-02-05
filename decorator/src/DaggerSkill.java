/**
 * Created by Bram on 4-2-2017.
 */
public class DaggerSkill extends CharacterDecorator {
    private Character character;

    public DaggerSkill(Character character) {
        this.character = character;
    }

    @Override
    public String getCharacterType() {
        return character.getCharacterType() +  ", with dagger skills";
    }

}
