import java.io.*;
public class Encryption {
    public void breaking(String answer) {
        char[] Simvols = answer.toCharArray();
        String[] bi = new String[Simvols.length];
        String msg = "";
        for (int i = 0; i < Simvols.length; i++) {
            bi[i] = Integer.toBinaryString(Simvols[i]);
            msg +=(bi[i]+" ");
            System.out.print(bi[i] + " ");
        }

        System.out.println("\n");
        for (int i = 0; i < Simvols.length; i++ ) {
            int line = bi[i].length();
            keys_creating(line, msg);
            System.out.print(" ");

        }

    }

    public Integer[] keys_creating(int line, String msg) {
        String Keys = "";
        Integer[] keys = new Integer[line];
        for (int i = 0; i<line; i++){

            keys[i] = (int) (Math.random() * 2);
            Keys += String.valueOf(keys[i]);
            /*Keys +=keys[i].toString();*/

        }
        System.out.print(Keys);
        encryption(msg, Keys);
        return keys;

    }

    public void encryption(String msg, String Keys){
        String ans = "";

        // Loop to iterate over the
        // Binary Strings
        for (int i = 0; i < msg.length(); i++)
        {
            // If the Character matches
            if (msg.charAt(i) == Keys.charAt(i))
                ans += "0";
            else
                ans += "1";
        }

        System.out.print(ans);

    }

}
