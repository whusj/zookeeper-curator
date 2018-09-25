package com.whusj.utils;

public class StringUtil {
    /**
     * 判断string是否为null 或者是blank。
     *
     * @param value string value
     * @return value
     */
    public static boolean isNullOrBlank(String value) {
        return value == null || "".equals(value.trim());
    }

    /**
     *
     * <p>Description: 判断String是否不为空</p>
     * @param value String value
     * @return boolean true or false
     */
    public static boolean isNotBlank(String value) {
        return !isNullOrBlank(value);
    }
}
