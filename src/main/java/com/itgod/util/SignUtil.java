package com.itgod.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * 请求校验工具
 * Created by Administrator on 2017/6/27.
 */
public class SignUtil {

    //与开发模式接口配置信息中的token一致
    private static String token="weixinGod";


    /**
     * 校验签名
     * @param signature 微信加密签名
     * @param timestamp 时间戳
     * @param nonce 随机数
     * @return
     */
    public static boolean checksignature(String signature,String timestamp,String nonce){
        //对signatrue,timestamp,nonce按字典排序
        String[] paramArr =new String[]{token, timestamp, nonce};
        Arrays.sort(paramArr);
        String content = paramArr[0].concat(paramArr[1]).concat(paramArr[2]);
        String ciphertext = null; //密码
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            //对拼接后的字符串进行shal加密
            byte[] digest = md.digest(content.toString().getBytes());
            ciphertext = byteTostr(digest);
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        //将shal加密后的字符串与singnature进行对比
        return ciphertext!=null ? ciphertext.equals(signature.toUpperCase()) : false ;
    }

    /**
     *将字节数组转换为十六进制字符串
     * @param byteArray
     * @return
     */
    private static String byteTostr(byte[] byteArray){
        String strDigest = "";
        for(int i=0; i<byteArray.length;i++){
            strDigest += byteToHexStr(byteArray[i]);
        }
        return strDigest;
    }

    /**
     * 将字节转换为十六进制字符串
     * @param mByte
     * @return
     */
    private static String byteToHexStr(byte mByte){
        char[] Digit = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] temArr = new char[2];
        temArr[0] = Digit[(mByte >>> 4) & 0x0f];
        temArr[1] = Digit[mByte & 0x0f];
        String s = new String(temArr);
        return s;
    }


}
