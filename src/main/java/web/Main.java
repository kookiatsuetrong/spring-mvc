package web;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

// class ต่อไปนี้ให้ทำงานเป็น controller
@Controller
class Main { 

	// เมื่อมี request มาที่ /test ให้เรียก method ถัดไปนี้
	@RequestMapping("/test")
	String showTest() {
		return "test.jsp";  // view ชื่อ test.jsp
	}

}
