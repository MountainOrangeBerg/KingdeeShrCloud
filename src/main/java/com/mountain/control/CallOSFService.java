package com.mountain.control;

import com.kingdee.shr.api.Response;
import com.kingdee.shr.api.SHRClient;


import org.apache.commons.httpclient.HttpMethod;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.mountain.pojo.MyError;

@Controller
public class CallOSFService {

    @Value("${shr.sso.url}")
    private String SHR_LOCAL;

    @ResponseBody
    @GetMapping({"/call"})
    public Object callService(@RequestParam(required = false) String serviceName, @RequestParam(required = false) Map map)
            throws IOException {
        if (serviceName.isEmpty() || map.isEmpty()) {
            return new MyError("Empty character in parameter", new HashMap() {{
                put("serviceName", serviceName);
                put("map", map);
            }});
        }
        SHRClient client = new SHRClient();
        //调用OSF所需要的参数
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("searchKey", "50006096");

        Response res = client.executeService(this.SHR_LOCAL, "PersonSearchService", param);
        System.out.println(res.getData());

        return res.getData();
    }


}
