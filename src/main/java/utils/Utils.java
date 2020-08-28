package utils;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Utils {

    public static String readFile(String file) throws IOException {
        InputStream is = Utils.class.getResourceAsStream(file);
        return IOUtils.toString(is, Charset.defaultCharset());
    }
}
