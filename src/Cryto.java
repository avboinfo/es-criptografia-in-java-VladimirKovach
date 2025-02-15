public class Cryto {

    public static String Cesar(String data, int shift) {
        StringBuilder output = new StringBuilder(data.length());
        for (char singleChar : data.toCharArray()) {
            int shiftedChar = (int) (singleChar + shift) % 256;
            output.append((char) shiftedChar);
        }
        return output.toString();
    }

    public static String xorAlgo(String data, String key) {

        String acc = "";
        
        for (int i = 0; i < data.length();) {
            char d = data.charAt(i);

            for (int j = 0; j < key.length() && i < data.length(); j++, i++) {
                char k = key.charAt(j);

                char xorChar = (char) (d ^ k);
                acc = acc + xorChar;
            }
        }

        return acc;
    }
}
