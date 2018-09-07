import java.io.ByteArrayOutputStream;

public class change {
    public static void main (String[] args){
        String s = "3296abcc86ac9e131d365f4923bbb8d7";
        StringToSixthUtils A = new StringToSixthUtils();
        System.out.println(A.decode("3296abcc86ac9e131d365f4923bbb8d7"));
    }
    public static String hexStr2Str(String hexStr) {
        String str = "0123456789ABCDEF";
        char[] hexs = hexStr.toCharArray();
        byte[] bytes = new byte[hexStr.length() / 2];
        int n;
        for (int i = 0; i < bytes.length; i++) {
            n = str.indexOf(hexs[2 * i]) * 16;
            n += str.indexOf(hexs[2 * i + 1]);
            bytes[i] = (byte) (n & 0xff);
        }
        return new String(bytes);
    }

    public static class StringToSixthUtils {
        private static String hexString = "0123456789abcdef";
        /*
         * 将字符串编码成16进制数字,适用于所有字符（包括中文）
         */
        public static String decode(String bytes) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(bytes.length() / 2);
            //将每2位16进制整数组装成一个字节
            for (int i = 0; i < bytes.length(); i += 2)
                baos.write((hexString.indexOf(bytes.charAt(i)) << 4 | hexString.indexOf(bytes.charAt(i + 1))));
            return new String(baos.toByteArray());
        }
    }
}

