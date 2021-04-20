package crypto;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.http.sampler.HTTPSampler;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;

public class Test {
    public static void main(String[] args) {
//        String url = "https://b2b-stage.zhuizhikeji.com/b2b/activity/goods/activity/create?sign=d8aa2be819a6408a420dee79e85bac67&zzfunctiontype=activity-goods-member&nonce=pQybWbxjIWY4vgcUJpyL";
//        String body = "{\"title\":\"kkk\",\"enablefrom\":1617897600000,\"enableto\":1617984000000,\"districtscope\":\"178,182,127,100,138,146,137,161,171,183,\",\"shopscope\":\"\",\"pricekind\":\"member\",\"cancombinecoupon\":\"1\",\"costcenterinfo\":{\"shop\":1},\"preid\":\"351014998677397504\",\"enabledtimeinfo\":{\"starttime1\":\"\",\"endtime1\":\"\"},\"promotiontype\":\"reduction\",\"promotionamt\":\"\",\"batchaddgoodsrequestlist\":[{\"goodsid\":\"4106859030000\",\"activityprice\":\"1\"}],\"realm\":{},\"shoprealmtype\":\"all\",\"ordersubtype\":4,\"membertags\":[]}";
        String url = "https://b2b-qa.zhuizhikeji.com/b2b/account/signin?sign=170b470b54e17f96ef82787da3c320d8&nonce=Lgb2cFsVW8S7qDZqd3Bk";
        String body = "{\"username\":\"15001815836\",\"password\":\"666666\",\"rememberme\":true}";
        HTTPSamplerProxy sampler = new HTTPSamplerProxy();
        sampler.addArgument("",body);
        RequestManager requestManager = new RequestManager(url,sampler);
//        RequestManager requestManager = new RequestManager(url,"aaa",sampler);
        System.out.println("Domain:"+requestManager.getDomain());
        System.out.println("Path:"+requestManager.getPath());
        System.out.println("Body:"+requestManager.getBody());
        System.out.println("Nonce:"+requestManager.getNonce());
        System.out.println("Timestamp:"+requestManager.getTimestamp());
        System.out.println("Sign:"+requestManager.getSign());
    }
}
