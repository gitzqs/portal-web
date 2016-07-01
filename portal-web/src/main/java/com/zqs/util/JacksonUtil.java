/**
 * Copyright 2014-2015 www.jshuabo.com. all rights reserved.
 */
package com.zqs.util;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * JSON 处理工具
 *
 * @author <a href="mailto:lianghe_yuan@yeah.net">lianghe.yuan</a>
 * @since 17, 2015 8:17:39 PM
 */
public class JacksonUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
       /* objectMapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);*/
        objectMapper.setDateFormat(DateFormatFactory.forPattern(DateFormatFactory.defaultPattern));
    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    /**
     * 采用默认的 yyyy-MM-dd HH:mm:ss 格式 处理日期（如果存在日期的话）
     *
     * @param object 待处理对象
     * @return 转换后的字符串
     * @author <a href="mailto:lianghe_yuan@yeah.net">lianghe.yuan</a>
     * @since 17, 2015 9:23:18 PM
     */
    public static String object2json(Object object) {
        return object2json(object, DateFormatFactory.defaultPattern);
    }

    public static String object2json(Object object, String dateFormatPattern) {
        objectMapper.setDateFormat(DateFormatFactory.forPattern(dateFormatPattern));

        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dateFormatPattern;
    }

    public static <T> T json2object(String content, Class<T> cls) {
        try {
            return objectMapper.readValue(content, cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T[] json2objects(String content, Class<T[]> cls) {
            try {
                return objectMapper.readValue(content, cls);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    public static Map<?, ?> json2map(String content) {
        try {
            return objectMapper.readValue(content, Map.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<LinkedHashMap<?, ?>> json2maps(String content) {
        try {
            return objectMapper.readValue(content, List.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}