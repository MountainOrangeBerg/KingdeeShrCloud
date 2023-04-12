//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mountain.control;

import com.kingdee.shr.api.Response;
import com.kingdee.shr.api.SHRClient;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GetOverTimeRestTimeOsf {
    public GetOverTimeRestTimeOsf() {
    }

    public static void main(String[] args) {
        String SHR_LOCAL = "https://shr.zytest.net/shr";
        SHRClient client = new SHRClient();
        Response resp = null;

        try {
            Map param = new HashMap();
            param.put("personNum", "ZY100373");
            param.put("restTime", "0");
            param.put("timeOffStartDate", "2021-06-06 23:00:00");
            param.put("timeOffEndDate", "2021-06-07 00:00:00");
            resp = client.executeService(SHR_LOCAL, "GetOverTimeRestTimeOsf", param);
            System.out.println(resp.getData());
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }
}
