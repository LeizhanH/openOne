package manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by leipu on 2018/7/18.
 */
@Controller
public class UploadController {
    ModelAndView mv = new ModelAndView();
    @RequestMapping("/hello")
    public ModelAndView getMsg(){

        mv.setViewName("index");
        mv.addObject("hello","nihao");
        return mv;
    }
    @RequestMapping("/fileUpload2")
    public ModelAndView  fileUpload2(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {

//                String realPath = request.getServletContext().getRealPath("/img");

                String realPath = "/Users/leipu/IdeaProjects/ssm_test/src/main/webapp/fileUpload/";
 //               System.out.println("contextPath"+request.getSession().getServletContext().getRealPath("/fileUpload")+"111111");

            //    System.out.println("ServletPath"+request.getServletPath()+"2222222");

            //    System.out.println(request.getCharacterEncoding()+"33333");

                String oldName = file.getOriginalFilename();

  //              System.out.println("oldname"+oldName);
                String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
//
//
                File dest = new File(realPath+File.separator+newName );
//
                file.transferTo(dest);


                 mv.setViewName("index");

                 mv.addObject("upload","上传");

                 return mv;
    }

    @RequestMapping(value = "/testwebpack",method = RequestMethod.GET)
    @ResponseBody
    public String tetWebpack(){
//        Map map = new HashMap();
//        map.put("mgs","connection success");
//        map.put("status",200);
//        return map;
        return "connection successful";
    }
}
