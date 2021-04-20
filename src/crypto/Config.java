package crypto;

public class Config {
    public static String SAAS_STAGE = "59mTZIqVUR0E7eHTiZ";
    public static String SAAS_QA = "xpMFj7Oiqx5EQK5j6J";
    public static String SAAS_MINIAPP_STAGE = "iH05XBJz8dI2IZnHmoIYHyvLJGqFdN";
    public static String SAAS_MINIAPP_QA = "LGW22N0SfA1AgcVdz3cRmG1TtuuX8D";
    public static String SAAS_POS_QA = "kVl55eO1n3DZhWC8Z7";
    public static String SAAS_ASSISTANT_QA = "DUqK8lLuy7HOeLFDT0";

    public static String getSecretKey(String domain){
        switch (domain){
            case "b2b-stage.zhuizhikeji.com":
                return SAAS_STAGE;
            case "b2b-qa.zhuizhikeji.com":
                return SAAS_QA;
            default:
                System.out.println("Secret Key Not Found");
        }
        return null;
    }
}
