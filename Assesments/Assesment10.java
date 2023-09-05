package Assesments;
class MessageDecoder {
public int decodeCharacter(char ch){
    return ch;
    }
}

public class Assesment10 {
    public static void main(String[] args){
        MessageDecoder decoder = new MessageDecoder();
        int rs=decoder.decodeCharacter('A');
        System.out.println(rs);
    }
}
