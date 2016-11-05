package com.vstaryw.web.common.utils;

import com.google.common.base.Strings;

/**
 * Date: 16/8/31
 * Time: 下午5:42
 * Describe: String工具类
 */
public class StringUtil {

    public static boolean isNullOrEmpty(String str){
        return Strings.isNullOrEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isNullOrEmpty(str);
    }

    public static String nullToEmpty(String str){
        return Strings.nullToEmpty(str);
    }


}
