package com.polidea.reactnativeble.utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;

/**
 * Created by chetwyn on 01/03/2018.
 */

public class WritableArrayConverter {

    public static WritableArray toWritableArray(byte[] value) {
        if (value == null) {
            return null;
        }
        WritableArray writableArray = Arguments.createArray();
        for (byte b : value) {
            int intValue = Byte.valueOf(b).intValue();
            writableArray.pushInt(intValue);
        }
        return writableArray;
    }

}
