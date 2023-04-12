package com.mountain.control;

import com.kingdee.shr.api.Response;
import com.kingdee.shr.api.SHRClient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) throws IOException {
        String SHR_LOCAL = "http://120.25.103.60:7888/shr";

//OSF名称，注意是名称不是编码
        String serviceName = "PersonSearchService";
        SHRClient client = new SHRClient();
//调用OSF所需要的参数
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("searchKey", "50006096");

        Response res = client.executeService(SHR_LOCAL, serviceName, param);
        System.out.println(res.getData());
    }

}
