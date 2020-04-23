package com.quinn.app.common.util;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 判断工具包
 *
 * @author Quinn
 */
public class CommonUtils {

    public static boolean isEmpty(Object value) {
        if (null == value) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(Object value) {
        if (null != value) {
            return true;
        }
        return false;
    }

    public static boolean isBlank(Object value) {
        if (null == value || value.toString().trim().equals("")) {
            return true;
        }
        return false;
    }

    public static boolean isNotBlank(Object value) {
        if (isBlank(value)) {
            return false;
        }
        return true;
    }

    public static boolean isNullStr(Object value) {
        if (null == value || value.toString().trim().equals("")
                || value.toString().trim().toLowerCase().equals("null")) {
            return true;
        }
        return false;
    }

    public static boolean isNotNullStr(Object value) {
        if (isNullStr(value)) {
            return false;
        }
        return true;
    }

    public static boolean isNumber(Object value) {
        if (isNotNullStr(value)) {
            return value.toString().matches("^\\d+$");
        }
        return false;
    }

    /**
     * 判断是否是金额，保留两位小数
     *
     * @param value
     * @return
     */
    public static boolean isMoney(Object value) {
        if (isBlank(value)) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[\\-\\+]?(-)?[0-9]+(.[0-9]{1,2})?$"); // 判断小数点后2位的数字的正则表达式
        Matcher match = pattern.matcher(value.toString());
        return match.matches();
    }

    public static boolean isBigDecimal(Object value) {
        if (isBlank(value)) {
            return false;
        }
        Pattern pattern = Pattern.compile("^[\\-\\+]?(-)?[0-9]+(.[0-9]+)?$"); // 判断小数点后2位的数字的正则表达式
        Matcher match = pattern.matcher(value.toString());
        return match.matches();
    }

    public static <T extends Object> boolean isNotEmptyList(Collection<T> c) {
        if (null != c && c.size() > 0) {
            return true;
        }
        return false;
    }

    /**
     * 返回long类型-最小-秒
     *
     * @param v
     * @return
     */
    public static Long getLongBySeconds(Long v) {
        if (v.toString().length() < 13) {
            return v;
        } else {
            return v / 1000;
        }
    }

    /**
     * 返回long类型-最小-毫秒
     *
     * @param v
     * @return
     */
    public static Long getLongByMillisecond(Long v) {
        if (v.toString().length() >= 13) {
            return v;
        } else {
            return v * 1000;
        }
    }

    /**
     * 判断是否是可用枚举
     **/
    public static <T extends Enum<T>> boolean isEnum(Class<T> c, String name) {
        try {
            Enum.valueOf(c, name);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public static String getStringTime(Date date, String patter) {
        SimpleDateFormat format = new SimpleDateFormat(patter);
        return format.format(date);
    }

    public static String valueOfString(Object o) {
        if (isNotBlank(o)) {
            return o.toString();
        } else {
            return "";
        }
    }

    public static String valueOfNull(Object o) {
        if (isNotBlank(o)) {
            return o.toString();
        } else {
            return null;
        }
    }

    public static LocalDateTime longToLocalDateTime(long t) {
        Instant instant = Instant.ofEpochMilli(t);
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    public static Long localDateTimeToLong(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return instant.toEpochMilli();
    }

    public static boolean isDateFormat(String format){
        for (DATE_FORMAT b : DATE_FORMAT.values()) {
            if (b.getFormat().equals(format)) {
                return true;
            }
        }
        return false;
    }

    public static String longToDateStr(String format,Long time){
        if(!isDateFormat(format)){
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return formatter.format(longToLocalDateTime(time));
    }

    public static String toDateStr(String format,LocalDateTime time){
        if(!isDateFormat(format)){
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return formatter.format(time);
    }


    public static String getUUIDString() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 删除map中值为null或者空字符的key
     **/
    public static void removeMapEmptyKey(Map<String, Object> map) {
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = it.next();
            if (CommonUtils.isBlank(map.get(entry.getKey()))) {
                it.remove();
            }
        }
    }

    public static <T> T[] toArray(T... items) {
        return items;
    }

    public enum DATE_FORMAT{
        FORMAT1("yyyy-MM-dd"),
        FORMAT2("yyyy-MM-dd HH:mm:ss");

        private String format;
        DATE_FORMAT(String format){
            this.format = format;
        }
        public String getFormat() {
            return format;
        }

        public String getFormat(Long time) {
            return longToDateStr(format,time);
        }

        public String getFormat(LocalDateTime time) {
            return toDateStr(format,time);
        }

        public void setFormat(String format) {
            this.format = format;
        }
    }


}
