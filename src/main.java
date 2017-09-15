public class main {

    public static String stringReverse(String buff) {
        buff = buff.trim();
        StringBuilder reversedBuff = new StringBuilder();
        StringBuilder subBuff = new StringBuilder();

        for (int i = 0; i < buff.length(); i++){
            char currChar = buff.charAt(i);

            if (currChar != ' ' && currChar != '-') {
                subBuff.append(currChar);
            }
            else {
                reversedBuff.insert(0, currChar + subBuff.toString());
                subBuff.setLength(0);
            }
        }

        return reversedBuff.insert(0, subBuff.toString()).toString();
    }

    public static void main(String[] args){

        System.out.print(stringReverse("My name is Kirios !"));
    }
}
