import java.util.Random;
public class Characters {

    char [] passwordCharacters = new char[]{'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '[', ']', '/', '-', '=', '+', '?', 'A', 'B',
            'C', 'D', 'E', 'F', 'G', 'H', 'I','J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    public String randomCharacter(){
        int index = new Random().nextInt(passwordCharacters.length);
        String randomChar = String.valueOf((passwordCharacters[index]));

        return randomChar;
    }

    public String randomPassword(){
        String password;

        password = randomCharacter()+randomCharacter()+randomCharacter()+randomCharacter()+
                randomCharacter()+randomCharacter()+randomCharacter()+randomCharacter()+
                randomCharacter()+randomCharacter()+randomCharacter()+randomCharacter();

        return password;
    }
}

