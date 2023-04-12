package com.mountain.control;


import com.kingdee.shr.sso.client.ltpa.LtpaTokenManager;

import com.kingdee.shr.sso.client.util.UrlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginHR {
    private static final Logger logger = LoggerFactory.getLogger(LoginHR.class);
    @Value("${shr.sso.url}")
    private String ssoUrl;

    @GetMapping({"/loginHr"})
    public void pcLoginAction(@RequestParam String username, @RequestParam String redirectTo, HttpServletResponse response)
            throws IOException {
        Map<String, Object> parameters = new HashMap();
        parameters.put("username", username);
        String password = LtpaTokenManager.generate(username, LtpaTokenManager.getDefaultLtpaConfig(), "OTP").toString();
        parameters.put("password", password);
        parameters.put("userAuthPattern", "OTP");
        parameters.put("isNotCheckRelogin", "true");

        parameters.put("redirectTo", redirectTo);
        String url = UrlUtil.assembleUrl(this.ssoUrl, parameters);
        logger.info("RedirectUrl--->" + url);
        response.sendRedirect(url);
    }
}
