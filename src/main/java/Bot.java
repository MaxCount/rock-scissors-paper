import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
public class Bot {

    private int choiceBot;

    public int choice(int size) {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[10];
        random.nextBytes(bytes);

        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        int result = Math.abs(buffer.getShort());
        choiceBot = result % size;
        return choiceBot;
    }

    public int getChoiceBot() {
        return choiceBot;
    }
}

