package com.example.demo.controlle;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Form.Form;






@Controller
public class Request {
	@GetMapping("top")
	public String topView() {
		return "Kadai08-top";
	}
@PostMapping(value="send", params="input")
public String inputView(){
		return "Kadai08-input";
}
@PostMapping(value="send", params="exit")
public String exitView(){
		return "Kadai08-exit";
}


@PostMapping("confirm")
public String confView(Form f) {
		return "Kadai08-confirm";
}
@PostMapping("complete")
public String compView(Form f) {
		return "Kadai08-complete";
}

}
