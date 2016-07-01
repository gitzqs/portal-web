/**
 * Copyright 2014-2015 www.jshuabo.com. all rights reserved.
 */
package com.zqs.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factory to create a formatter from a pattern string.
 *
 * @author <a href="mailto:lianghe_yuan@yeah.net">lianghe.yuan</a>
 * @since 15, 2015 9:15:17 AM
 */
public class DateFormatFactory {
    private static final Logger logger = LoggerFactory.getLogger(DateFormatFactory.class);

    public static final String ymd = "yyyy-MM-dd";
    public static final String ymd_hm = "yyyy-MM-dd HH:mm";
    public static final String ymd_hms = "yyyy-MM-dd HH:mm:ss";
    public static final String ymd_hms_s = "yyyy-MM-dd HH:mm:ss SSS";
    public static final String defaultPattern = ymd_hms;

    private static final ConcurrentHashMap<String, ThreadLocal<DateFormat>> cPatternCache =
            new ConcurrentHashMap<String, ThreadLocal<DateFormat>>();
    private static final Object LOCK = new Object();

    private DateFormatFactory() {
    }

    /**
     * Factory to create a default formatter.
     * The pattern string is described above in the class level javadoc.
     * It is same to SimpleDateFormat patterns.
     *
     * @return the formatter
     * @author <a href="mailto:lianghe_yuan@yeah.net">lianghe.yuan</a>
     * @since 15, 2015 11:01:49 AM
     */
    public static DateFormat forPattern() {
        return createFormatterForPattern(defaultPattern);
    }

    /**
     * Factory to create a formatter from a pattern string.
     * The pattern string is described above in the class level javadoc.
     * It is same to SimpleDateFormat patterns.
     *
     * @param pattern pattern specification
     * @return the formatter
     * @author <a href="mailto:lianghe_yuan@yeah.net">lianghe.yuan</a>
     * @since 15, 2015 11:01:49 AM
     */
    public static DateFormat forPattern(String pattern) {
        return createFormatterForPattern(pattern);
    }

    /**
     * Select a format from a custom pattern.
     *
     * @param pattern  pattern specification
     * @return the formatter
     * @author <a href="mailto:lianghe_yuan@yeah.net">lianghe.yuan</a>
     * @since 15, 2015 11:03:38 AM
     */
    private static DateFormat createFormatterForPattern(String pattern) {
        if (pattern == null || pattern.length() == 0) {
            throw new IllegalArgumentException("pattern must not be null or empty!");
        }

        ThreadLocal<DateFormat> t = cPatternCache.get(pattern);
        if (null == t || null == t.get()) {
            synchronized (LOCK) {
                t = cPatternCache.get(pattern);
                if (null == t) {
                    t = new ThreadLocal<DateFormat>();
                }

                DateFormat formatter = t.get();
                if (null == formatter) {
                    try {
                        formatter = new SimpleDateFormat(pattern);
                    } catch (Exception ex) {
                        logger.error("bad pattern for SimpleDateFormat : {}", pattern);
                        throw new IllegalArgumentException("Invalid pattern specification", ex);
                    }
                    t.set(formatter);
                }
                cPatternCache.put(pattern, t);
            }
        }

        return cPatternCache.get(pattern).get();
    }

}
