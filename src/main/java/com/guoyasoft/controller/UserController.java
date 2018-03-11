package com.guoyasoft.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
//
//    @Autowired
//    private IUserService userService;
//    
//    @RequestMapping(value="/showname",method=RequestMethod.GET)
//    public String showUserName(@RequestParam("uid") int uid,HttpServletRequest request,Model model){
//        System.out.println("showname");
//        User user = userService.getUserById(uid);
//        if(user != null){
//            request.setAttribute("name", user.getUserName());
//            model.addAttribute("mame", user.getUserName());
//            return "showName";
//        }
//        request.setAttribute("error", "没有找到该用户！");
//        return "error";
//    }
}