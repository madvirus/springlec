package web;

import member.AlreadyExistingMemberException;
import member.RegisterRequest;
import member.RegisterService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class MemberRegisterController {

	public static final String FORM_VIEWNAME = "form";

}
