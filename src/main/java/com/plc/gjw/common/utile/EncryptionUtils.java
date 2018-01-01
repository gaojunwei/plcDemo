package com.plc.gjw.common.utile;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 常用  编码/解码  工具类
 *
 * @author gjw
 * @create 2017-12-02 20:33
 **/
public class EncryptionUtils {

    //得到文件的字节数组
    public static byte[] getFileByte(String path) throws Exception {
        File file = new File(path);
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int) file.length()];
        inputFile.read(buffer);
        inputFile.close();
        return buffer;
    }


    //得到文件的字节数组
    public static byte[] getFileByteByRelativePath(String path) throws Exception {
        InputStream in = EncryptionUtils.class.getClassLoader().getResourceAsStream(path);
//        InputStream in = getServletContext().getResourceAsStream( "/WEB-INF/xmlfile.xml" );
        byte[] bytes = IOUtils.toByteArray(in);
        return bytes;
    }

    //base64
    public static String base64EncodeFile(String path) throws Exception {
        byte[] buffer = EncryptionUtils.getFileByte(path);
        String s = new String(java.util.Base64.getEncoder().encode(buffer));
        return s;
    }


    public static String base64Encode(String data) {
        return base64Encode(data.getBytes());
    }

    public static String base64Encode(byte[] bytes) {
        return Base64.encodeBase64String(bytes);
    }

    public static byte[] base64Decode(String data) {
        return Base64.decodeBase64(data.getBytes());
    }

    //MD5
    public static String md5(String data) {
        return DigestUtils.md5Hex(data);
    }

    //sha1
    public static String sha1(String data) {
        return DigestUtils.sha1Hex(data);
    }

    //sha256Hex
    public static String sha256Hex(String data) {
        return DigestUtils.sha256Hex(data);
    }
}
