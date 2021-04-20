package crypto;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MD5 {
    private String secretKey = null;
    private String nonce = null;
    private String timestamp = null;
    private TreeMap<String,String> params = null;
    private String body = null;
    private String fixedPath;

    public MD5(String secretKey, String nonce, TreeMap<String, String> params, String timestamp, String body) {
        this.secretKey = secretKey;
        this.nonce = nonce;
        this.timestamp = timestamp;
        this.params = params;
        this.body = body;
    }

    public String getFixedPath() {
        return fixedPath;
    }

    public String genSign(){
        TreeMap options = new TreeMap();
        options.put("nonce",nonce);

        if(params!=null){
            Set<String> keys = params.keySet();
            for (String key : keys) {
                options.put(key,params.get(key));
            }
        }

        StringBuilder crypto = new StringBuilder();
        StringBuilder paramSB = new StringBuilder();

        crypto.append(secretKey);
        if (options != null) {
            Iterator iterator = options.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                crypto.append(entry.getKey().toString());
                paramSB.append(entry.getKey().toString()).append("=");
                crypto.append(entry.getValue().toString());
                paramSB.append(entry.getValue().toString());
                paramSB.append("&");
            }
        }
        crypto.append(timestamp);
        if(!body.isEmpty()) {
            crypto.append(body);
        }
        String sign = DigestUtils.md5Hex(crypto.toString());//md5加密
        paramSB.append("sign=").append(sign);
        fixedPath = paramSB.toString();
        System.out.println("EncryptString:"+crypto.toString());

        return sign;
    }


}
