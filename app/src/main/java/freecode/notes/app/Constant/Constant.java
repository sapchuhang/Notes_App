package freecode.notes.app.Constant;

import java.io.Serializable;

public class Constant implements Serializable {
    private static final long serialVersionUID = 1L;

    public static String company = "FreeCode";
    public static String email = "info.freecode@gmail.com";
    public static String website = "https://www.freecodecom/";
    public static String contact = "+00 0234560890";
    public static String privacyPolicy = "http://example.com/";

    //--------------------Admob ads----------------- //
    public static Boolean isAdmobBannerAd = true;
    public static Boolean  isAdmobInterAd = true;
    public static int adShow = 5;

    //--------------------Fb ads----------------- //
    public static Boolean isFBBannerAd = false;
    public static Boolean  isFBInterAd = false;
    public static int adShowFB = 5;


}