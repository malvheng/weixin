package com.itgod.action;

import com.itgod.service.CoreService;
import com.itgod.util.SignUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
public class GetParm {

    private final Logger logger =Logger.getLogger(GetParm.class);

    /**
     * 微信接入
     * @param
     * @return
     * @throws IOException
     */
    @RequestMapping(value="/connect.do",method = {RequestMethod.GET})
    @ResponseBody
    public void connectWeixin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");  //微信服务器POST消息时用的是UTF-8编码，在接收时也要用同样的编码，否则中文会乱码；
        response.setCharacterEncoding("UTF-8"); //在响应消息（回复消息给用户）时，也将编码方式设置为UTF-8，原理同上;
        boolean isGet = request.getMethod().toLowerCase().equals("get");

        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");

        PrintWriter out = response.getWriter();
        //请求校验，若校验成功则原样返回echostr,表示接入成功，否则接入失败
        if(SignUtil.checksignature(signature,timestamp,nonce)){
            out.print(echostr);
        }
        out.close();
        out = null;
    }

    /**
     *对接收消息进行处理
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value="/connect.do",method = {RequestMethod.POST})
    @ResponseBody
    public void handleMessage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");  //微信服务器POST消息时用的是UTF-8编码，在接收时也要用同样的编码，否则中文会乱码；
        response.setCharacterEncoding("UTF-8"); //在响应消息（回复消息给用户）时，也将编码方式设置为UTF-8，原理同上;
        //接收参数：微信加密签名，时间戳，随机数
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        PrintWriter out = response.getWriter();
        if(SignUtil.checksignature(signature,timestamp,nonce)){
            //调用核心服务器类接收处理请求
            String respXml = CoreService.processRequest(request);
            logger.info("respXml:"+respXml);
            out.write(respXml);
        }
        out.close();
        out=null;
    }
}
