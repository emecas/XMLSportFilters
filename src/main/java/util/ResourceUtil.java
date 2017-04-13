/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author ecastaneda1
 */


import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

public class ResourceUtil {

    
    public static String getStringFromResource(String resourcePath) {
        final String s;
        try {
            final InputStream is = ResourceUtil.class.getResourceAsStream(resourcePath);
            if (is == null) {
                throw new IOException("Cannot open resource [" + resourcePath + "]");
            }
            s = IOUtils.toString(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return s;
    }
    
    
    public static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
    
    
   
}
