package regex.service;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public enum  Bundle {
    INSTANCE;
    private ResourceBundle resourceBundle;
    private String resName = "message";

    Bundle() {
        this.resourceBundle = ResourceBundle.getBundle(resName, Locale.getDefault());
    }

    public void changeLocale (Locale locale) {
        this.resourceBundle = ResourceBundle.getBundle(resName, locale);
    }

    public String getValue(String key){
        try {
            return new String(resourceBundle.getString(key).getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Enumeration getKeys() {
        return resourceBundle.getKeys();
    }

    public Locale getLocale() {
        return resourceBundle.getLocale();
    }
}
