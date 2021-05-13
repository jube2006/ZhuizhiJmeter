package crypto;

public class Config {
    private final static String SAAS_STAGE = "59mTZIqVUR0E7eHTiZ";
    private final static String SAAS_QA = "xpMFj7Oiqx5EQK5j6J";
    private final static String SAAS_MINIAPP_STAGE = "iH05XBJz8dI2IZnHmoIYHyvLJGqFdN";
    private final static String SAAS_MINIAPP_QA = "LGW22N0SfA1AgcVdz3cRmG1TtuuX8D";
    private final static String SAAS_POS_QA = "kVl55eO1n3DZhWC8Z7";
    private final static String SAAS_ASSISTANT_QA = "DUqK8lLuy7HOeLFDT0";
    private final static String BIYOUXUAN_STAGE = "";
    private final static String BIYOUXUAN_QA = "";
    private final static String BIYOUXUAN_MINIAPP_STAGE = "iH05XBJz8dI2IZnHmoIYHyvLJGqFdN";
    private final static String BIYOUXUAN_MINIAPP_QA = "";
    private final static String WENXIANSHENG_STAGE = "huk54csUnEN7MwT6Q1HhIscRTr6mBQ";
    private final static String WENXIANSHENG_QA = "ZTaWKaO1YCMdIGLvTnHpWpWyT7KO54";
    private final static String WENXIANSHENG_MINIAPP_STAGE = "yj6M2Yz3clnfSYe5SfnJxvKGxLCOma";
    private final static String WENXIANSHENG_MINIAPP_QA = "QqLF7V0HaW2HiLQX2aBrvpmJsCKXR9";
    private final static String WENXIANSHENG_POS_STAGE = "2yyi1wXMmolksAQFzK9pjDUUA25ELP";
    private final static String WENXIANSHENG_POS_QA = "z0nRGBMPliWG6ywtdG4Y8f5TdbZ9ll";
    private final static String WENXIANSHENG_ASSISTANT_STAGE = "zFK1exWOiXTonP3kM6uCUHqpIE17O7";
    private final static String WENXIANSHENG_ASSISTANT_QA = "TWhXrMppMaa6PEvfdQOrdPuXWzbne0";




    //配置秘钥于对应的域名
    public static String getSecretKey(String domain){
        switch (domain){
            case "b2b-stage.zhuizhikeji.com":
                return SAAS_STAGE;
            case "b2b-qa.zhuizhikeji.com":
                return SAAS_QA;
            case "xcx-stage.biyouxuan.com":
                return BIYOUXUAN_MINIAPP_STAGE;
            case "b2b-stage.wenxiansheng.cn":
                return WENXIANSHENG_STAGE;
            case "b2b-qa.wenxiansheng.cn":
                return WENXIANSHENG_QA;
            default:
                System.out.println("Secret Key Not Found");     //TODO Exception handling
        }
        return null;
    }
}
