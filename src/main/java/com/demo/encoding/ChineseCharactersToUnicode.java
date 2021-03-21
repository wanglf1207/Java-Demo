package com.demo.encoding;

import java.io.UnsupportedEncodingException;

/**
 * 汉字转Unicode
 */
public class ChineseCharactersToUnicode {

    /**
     *
     * @param s
     * @return
     */
    public static String chineseCharactersToUnicode(String s) {
        try {
            StringBuffer stringBuffer = new StringBuffer("");
            //直接获取字符串的unicode二进制
            byte[] bytes = s.getBytes("unicode");
            //然后将其byte转换成对应的16进制表示即可
            for (int i = 0; i < bytes.length - 1; i += 2) {
                stringBuffer.append("\\u");
                String str = Integer.toHexString(bytes[i + 1] & 0xff);
                for (int j = str.length(); j < 2; j++) {
                    stringBuffer.append("0");
                }
                String str1 = Integer.toHexString(bytes[i] & 0xff);
                stringBuffer.append(str1);
                stringBuffer.append(str);
            }
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
