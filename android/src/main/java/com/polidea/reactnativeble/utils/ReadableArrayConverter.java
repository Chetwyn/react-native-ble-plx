package com.polidea.reactnativeble.utils;

import com.facebook.react.bridge.ReadableArray;

public class ReadableArrayConverter {
    public static String[] toStringArray(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        String[] stringArray = new String[readableArray.size()];
        for (int i = 0; i < readableArray.size(); ++i) {
            stringArray[i] = readableArray.getString(i);
        }
        return stringArray;
    }

    public static byte[] toByteArray(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        byte[] bytes = new byte[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            bytes[i] = Integer.valueOf(readableArray.getInt(i)).byteValue();
        }
        return bytes;
    }
}
