/**
 * Created by Bram on 4-2-2017.
 */
public class SwordSkill extends CharacterDecorator {
    private Character character;

    public SwordSkill(Character character) {
        this.character = character;
    }

    @Override
    public String getCharacterType() {
        return character.getCharacterType() +  ", with sword skills";
    }

}
